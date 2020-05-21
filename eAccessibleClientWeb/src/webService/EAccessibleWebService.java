/**
 * EAccessibleWebService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webService;

public interface EAccessibleWebService extends java.rmi.Remote {
    public webService.Caracteristica informacioCaracteristica(int arg0) throws java.rmi.RemoteException;
    public int ultimCodiLocal() throws java.rmi.RemoteException;
    public webService.CaracteristicaTipoLocal[] informacioCaracteristicaTipoLocal(int arg0) throws java.rmi.RemoteException;
    public void baixaLocal(int arg0) throws java.rmi.RemoteException;
    public webService.Local[] cercaLocalPerTipoLocalNomLocalNumero(int arg0, java.lang.String arg1, int arg2) throws java.rmi.RemoteException;
    public webService.TipoLocal[] llistarTipusLocals() throws java.rmi.RemoteException;
    public int ultimCodiAccessibilitat() throws java.rmi.RemoteException;
    public webService.InformacioAccessibilitatLocal[] llistarAccessibilitatLocal(int arg0) throws java.rmi.RemoteException;
    public webService.Local[] cercaLocalPerTipoLocal(int arg0) throws java.rmi.RemoteException;
    public void altaLocal(webService.Local arg0, webService.Accessibilitat[] arg1) throws java.rmi.RemoteException;
    public void validacioLocal(int arg0) throws java.rmi.RemoteException;
}
