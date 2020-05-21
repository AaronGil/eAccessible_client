/**
 * EAccessibleWebServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webService;

public class EAccessibleWebServiceServiceLocator extends org.apache.axis.client.Service implements webService.EAccessibleWebServiceService {

    public EAccessibleWebServiceServiceLocator() {
    }


    public EAccessibleWebServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public EAccessibleWebServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for eAccessibleWebServicePort
    private java.lang.String eAccessibleWebServicePort_address = "http://localhost:8080/eAccessibleServerWeb/eAccessibleWebService";

    public java.lang.String geteAccessibleWebServicePortAddress() {
        return eAccessibleWebServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String eAccessibleWebServicePortWSDDServiceName = "eAccessibleWebServicePort";

    public java.lang.String geteAccessibleWebServicePortWSDDServiceName() {
        return eAccessibleWebServicePortWSDDServiceName;
    }

    public void seteAccessibleWebServicePortWSDDServiceName(java.lang.String name) {
        eAccessibleWebServicePortWSDDServiceName = name;
    }

    public webService.EAccessibleWebService geteAccessibleWebServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(eAccessibleWebServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return geteAccessibleWebServicePort(endpoint);
    }

    public webService.EAccessibleWebService geteAccessibleWebServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            webService.EAccessibleWebServiceServiceSoapBindingStub _stub = new webService.EAccessibleWebServiceServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(geteAccessibleWebServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void seteAccessibleWebServicePortEndpointAddress(java.lang.String address) {
        eAccessibleWebServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (webService.EAccessibleWebService.class.isAssignableFrom(serviceEndpointInterface)) {
                webService.EAccessibleWebServiceServiceSoapBindingStub _stub = new webService.EAccessibleWebServiceServiceSoapBindingStub(new java.net.URL(eAccessibleWebServicePort_address), this);
                _stub.setPortName(geteAccessibleWebServicePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("eAccessibleWebServicePort".equals(inputPortName)) {
            return geteAccessibleWebServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://webService/", "eAccessibleWebServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://webService/", "eAccessibleWebServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("eAccessibleWebServicePort".equals(portName)) {
            seteAccessibleWebServicePortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
