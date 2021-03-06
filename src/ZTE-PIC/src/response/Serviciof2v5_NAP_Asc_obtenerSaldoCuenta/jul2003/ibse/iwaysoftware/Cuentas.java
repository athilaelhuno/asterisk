/**
 * Cuentas.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package response.Serviciof2v5_NAP_Asc_obtenerSaldoCuenta.jul2003.ibse.iwaysoftware;

public class Cuentas  implements java.io.Serializable {
    private java.lang.String codigoArea;

    private java.lang.String telefono;

    private java.lang.String fechaUltimaFacturacion;

    public Cuentas() {
    }

    public Cuentas(
           java.lang.String codigoArea,
           java.lang.String telefono,
           java.lang.String fechaUltimaFacturacion) {
           this.codigoArea = codigoArea;
           this.telefono = telefono;
           this.fechaUltimaFacturacion = fechaUltimaFacturacion;
    }


    /**
     * Gets the codigoArea value for this Cuentas.
     * 
     * @return codigoArea
     */
    public java.lang.String getCodigoArea() {
        return codigoArea;
    }


    /**
     * Sets the codigoArea value for this Cuentas.
     * 
     * @param codigoArea
     */
    public void setCodigoArea(java.lang.String codigoArea) {
        this.codigoArea = codigoArea;
    }


    /**
     * Gets the telefono value for this Cuentas.
     * 
     * @return telefono
     */
    public java.lang.String getTelefono() {
        return telefono;
    }


    /**
     * Sets the telefono value for this Cuentas.
     * 
     * @param telefono
     */
    public void setTelefono(java.lang.String telefono) {
        this.telefono = telefono;
    }


    /**
     * Gets the fechaUltimaFacturacion value for this Cuentas.
     * 
     * @return fechaUltimaFacturacion
     */
    public java.lang.String getFechaUltimaFacturacion() {
        return fechaUltimaFacturacion;
    }


    /**
     * Sets the fechaUltimaFacturacion value for this Cuentas.
     * 
     * @param fechaUltimaFacturacion
     */
    public void setFechaUltimaFacturacion(java.lang.String fechaUltimaFacturacion) {
        this.fechaUltimaFacturacion = fechaUltimaFacturacion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Cuentas)) return false;
        Cuentas other = (Cuentas) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codigoArea==null && other.getCodigoArea()==null) || 
             (this.codigoArea!=null &&
              this.codigoArea.equals(other.getCodigoArea()))) &&
            ((this.telefono==null && other.getTelefono()==null) || 
             (this.telefono!=null &&
              this.telefono.equals(other.getTelefono()))) &&
            ((this.fechaUltimaFacturacion==null && other.getFechaUltimaFacturacion()==null) || 
             (this.fechaUltimaFacturacion!=null &&
              this.fechaUltimaFacturacion.equals(other.getFechaUltimaFacturacion())));
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
        if (getCodigoArea() != null) {
            _hashCode += getCodigoArea().hashCode();
        }
        if (getTelefono() != null) {
            _hashCode += getTelefono().hashCode();
        }
        if (getFechaUltimaFacturacion() != null) {
            _hashCode += getFechaUltimaFacturacion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Cuentas.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:iwaysoftware:ibse:jul2003:Serviciof2v5_NAP_Asc_obtenerSaldoCuenta:response", "Cuentas"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoArea");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoArea"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("telefono");
        elemField.setXmlName(new javax.xml.namespace.QName("", "telefono"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaUltimaFacturacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fechaUltimaFacturacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
