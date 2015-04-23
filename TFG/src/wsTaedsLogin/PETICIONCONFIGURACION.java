//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2014.11.27 a las 11:35:51 AM CET 
//


package wsTaedsLogin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AUTENTICACION"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                 &lt;attribute name="cliente" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="login" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="pass" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "autenticacion"
})
@XmlRootElement(name = "PETICION_CONFIGURACION")
public class PETICIONCONFIGURACION {

    @XmlElement(name = "AUTENTICACION", required = true)
    protected PETICIONCONFIGURACION.AUTENTICACION autenticacion;

    /**
     * Obtiene el valor de la propiedad autenticacion.
     * 
     * @return
     *     possible object is
     *     {@link PETICIONCONFIGURACION.AUTENTICACION }
     *     
     */
    public PETICIONCONFIGURACION.AUTENTICACION getAUTENTICACION() {
        return autenticacion;
    }

    /**
     * Define el valor de la propiedad autenticacion.
     * 
     * @param value
     *     allowed object is
     *     {@link PETICIONCONFIGURACION.AUTENTICACION }
     *     
     */
    public void setAUTENTICACION(PETICIONCONFIGURACION.AUTENTICACION value) {
        this.autenticacion = value;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *       &lt;attribute name="cliente" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="login" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="pass" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class AUTENTICACION {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "cliente")
        protected String cliente;
        @XmlAttribute(name = "login")
        protected String login;
        @XmlAttribute(name = "pass")
        protected String pass;

        /**
         * Obtiene el valor de la propiedad value.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Define el valor de la propiedad value.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Obtiene el valor de la propiedad cliente.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCliente() {
            return cliente;
        }

        /**
         * Define el valor de la propiedad cliente.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCliente(String value) {
            this.cliente = value;
        }

        /**
         * Obtiene el valor de la propiedad login.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLogin() {
            return login;
        }

        /**
         * Define el valor de la propiedad login.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLogin(String value) {
            this.login = value;
        }

        /**
         * Obtiene el valor de la propiedad pass.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPass() {
            return pass;
        }

        /**
         * Define el valor de la propiedad pass.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPass(String value) {
            this.pass = value;
        }

    }

}
