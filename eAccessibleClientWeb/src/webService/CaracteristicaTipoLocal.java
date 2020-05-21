/**
 * CaracteristicaTipoLocal.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webService;

public class CaracteristicaTipoLocal  implements java.io.Serializable {
    private int codiCaracteristica;

    private int codiCaracteristicaTipoLocal;

    private int codiTipoLocal;

    public CaracteristicaTipoLocal() {
    }

    public CaracteristicaTipoLocal(
           int codiCaracteristica,
           int codiCaracteristicaTipoLocal,
           int codiTipoLocal) {
           this.codiCaracteristica = codiCaracteristica;
           this.codiCaracteristicaTipoLocal = codiCaracteristicaTipoLocal;
           this.codiTipoLocal = codiTipoLocal;
    }


    /**
     * Gets the codiCaracteristica value for this CaracteristicaTipoLocal.
     * 
     * @return codiCaracteristica
     */
    public int getCodiCaracteristica() {
        return codiCaracteristica;
    }


    /**
     * Sets the codiCaracteristica value for this CaracteristicaTipoLocal.
     * 
     * @param codiCaracteristica
     */
    public void setCodiCaracteristica(int codiCaracteristica) {
        this.codiCaracteristica = codiCaracteristica;
    }


    /**
     * Gets the codiCaracteristicaTipoLocal value for this CaracteristicaTipoLocal.
     * 
     * @return codiCaracteristicaTipoLocal
     */
    public int getCodiCaracteristicaTipoLocal() {
        return codiCaracteristicaTipoLocal;
    }


    /**
     * Sets the codiCaracteristicaTipoLocal value for this CaracteristicaTipoLocal.
     * 
     * @param codiCaracteristicaTipoLocal
     */
    public void setCodiCaracteristicaTipoLocal(int codiCaracteristicaTipoLocal) {
        this.codiCaracteristicaTipoLocal = codiCaracteristicaTipoLocal;
    }


    /**
     * Gets the codiTipoLocal value for this CaracteristicaTipoLocal.
     * 
     * @return codiTipoLocal
     */
    public int getCodiTipoLocal() {
        return codiTipoLocal;
    }


    /**
     * Sets the codiTipoLocal value for this CaracteristicaTipoLocal.
     * 
     * @param codiTipoLocal
     */
    public void setCodiTipoLocal(int codiTipoLocal) {
        this.codiTipoLocal = codiTipoLocal;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CaracteristicaTipoLocal)) return false;
        CaracteristicaTipoLocal other = (CaracteristicaTipoLocal) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.codiCaracteristica == other.getCodiCaracteristica() &&
            this.codiCaracteristicaTipoLocal == other.getCodiCaracteristicaTipoLocal() &&
            this.codiTipoLocal == other.getCodiTipoLocal();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += getCodiCaracteristica();
        _hashCode += getCodiCaracteristicaTipoLocal();
        _hashCode += getCodiTipoLocal();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CaracteristicaTipoLocal.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webService/", "caracteristicaTipoLocal"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiCaracteristica");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codiCaracteristica"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiCaracteristicaTipoLocal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codiCaracteristicaTipoLocal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiTipoLocal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codiTipoLocal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
