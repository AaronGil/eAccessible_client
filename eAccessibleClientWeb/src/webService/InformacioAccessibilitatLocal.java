/**
 * InformacioAccessibilitatLocal.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webService;

public class InformacioAccessibilitatLocal  implements java.io.Serializable {
    private java.lang.Integer codiCaracteristica;

    private java.lang.Integer codiLocal;

    private java.lang.String nomCaracteristicaCA;

    private java.lang.Integer valor;

    public InformacioAccessibilitatLocal() {
    }

    public InformacioAccessibilitatLocal(
           java.lang.Integer codiCaracteristica,
           java.lang.Integer codiLocal,
           java.lang.String nomCaracteristicaCA,
           java.lang.Integer valor) {
           this.codiCaracteristica = codiCaracteristica;
           this.codiLocal = codiLocal;
           this.nomCaracteristicaCA = nomCaracteristicaCA;
           this.valor = valor;
    }


    /**
     * Gets the codiCaracteristica value for this InformacioAccessibilitatLocal.
     * 
     * @return codiCaracteristica
     */
    public java.lang.Integer getCodiCaracteristica() {
        return codiCaracteristica;
    }


    /**
     * Sets the codiCaracteristica value for this InformacioAccessibilitatLocal.
     * 
     * @param codiCaracteristica
     */
    public void setCodiCaracteristica(java.lang.Integer codiCaracteristica) {
        this.codiCaracteristica = codiCaracteristica;
    }


    /**
     * Gets the codiLocal value for this InformacioAccessibilitatLocal.
     * 
     * @return codiLocal
     */
    public java.lang.Integer getCodiLocal() {
        return codiLocal;
    }


    /**
     * Sets the codiLocal value for this InformacioAccessibilitatLocal.
     * 
     * @param codiLocal
     */
    public void setCodiLocal(java.lang.Integer codiLocal) {
        this.codiLocal = codiLocal;
    }


    /**
     * Gets the nomCaracteristicaCA value for this InformacioAccessibilitatLocal.
     * 
     * @return nomCaracteristicaCA
     */
    public java.lang.String getNomCaracteristicaCA() {
        return nomCaracteristicaCA;
    }


    /**
     * Sets the nomCaracteristicaCA value for this InformacioAccessibilitatLocal.
     * 
     * @param nomCaracteristicaCA
     */
    public void setNomCaracteristicaCA(java.lang.String nomCaracteristicaCA) {
        this.nomCaracteristicaCA = nomCaracteristicaCA;
    }


    /**
     * Gets the valor value for this InformacioAccessibilitatLocal.
     * 
     * @return valor
     */
    public java.lang.Integer getValor() {
        return valor;
    }


    /**
     * Sets the valor value for this InformacioAccessibilitatLocal.
     * 
     * @param valor
     */
    public void setValor(java.lang.Integer valor) {
        this.valor = valor;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InformacioAccessibilitatLocal)) return false;
        InformacioAccessibilitatLocal other = (InformacioAccessibilitatLocal) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codiCaracteristica==null && other.getCodiCaracteristica()==null) || 
             (this.codiCaracteristica!=null &&
              this.codiCaracteristica.equals(other.getCodiCaracteristica()))) &&
            ((this.codiLocal==null && other.getCodiLocal()==null) || 
             (this.codiLocal!=null &&
              this.codiLocal.equals(other.getCodiLocal()))) &&
            ((this.nomCaracteristicaCA==null && other.getNomCaracteristicaCA()==null) || 
             (this.nomCaracteristicaCA!=null &&
              this.nomCaracteristicaCA.equals(other.getNomCaracteristicaCA()))) &&
            ((this.valor==null && other.getValor()==null) || 
             (this.valor!=null &&
              this.valor.equals(other.getValor())));
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
        if (getCodiCaracteristica() != null) {
            _hashCode += getCodiCaracteristica().hashCode();
        }
        if (getCodiLocal() != null) {
            _hashCode += getCodiLocal().hashCode();
        }
        if (getNomCaracteristicaCA() != null) {
            _hashCode += getNomCaracteristicaCA().hashCode();
        }
        if (getValor() != null) {
            _hashCode += getValor().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InformacioAccessibilitatLocal.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webService/", "informacioAccessibilitatLocal"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiCaracteristica");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codiCaracteristica"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codiLocal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codiLocal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomCaracteristicaCA");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nomCaracteristicaCA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
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
