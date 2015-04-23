//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2014.11.27 a las 11:46:20 AM CET 
//


package wsTaedsBook;

import java.util.ArrayList;
import java.util.List;
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
 *                 &lt;attribute name="login" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="pass" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="cliente" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MODALIDAD"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="DESTINO"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="DURACION"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;simpleContent&gt;
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                                     &lt;attribute name="codigo" type="{http://www.w3.org/2001/XMLSchema}byte" /&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/simpleContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="codigo" type="{http://www.w3.org/2001/XMLSchema}byte" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="codigo" type="{http://www.w3.org/2001/XMLSchema}byte" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DATOS"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="FECHA_INICIO_VIAJE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="NASEGURADOS" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
 *                   &lt;element name="ASEGURADOS"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="ASEGURADO" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="NOMBRE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="LOCALIDAD" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="PRECIO_NETO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="REF_AGENCIA" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="TRAMITADO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="COUNTRY_SOLD" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
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
    "autenticacion",
    "modalidad",
    "datos"
})
@XmlRootElement(name = "PETICION_CERTIFICADO")
public class PETICIONCERTIFICADO {

    @XmlElement(name = "AUTENTICACION", required = true)
    protected PETICIONCERTIFICADO.AUTENTICACION autenticacion;
    @XmlElement(name = "MODALIDAD", required = true)
    protected PETICIONCERTIFICADO.MODALIDAD modalidad;
    @XmlElement(name = "DATOS", required = true)
    protected PETICIONCERTIFICADO.DATOS datos;

    /**
     * Obtiene el valor de la propiedad autenticacion.
     * 
     * @return
     *     possible object is
     *     {@link PETICIONCERTIFICADO.AUTENTICACION }
     *     
     */
    public PETICIONCERTIFICADO.AUTENTICACION getAUTENTICACION() {
        return autenticacion;
    }

    /**
     * Define el valor de la propiedad autenticacion.
     * 
     * @param value
     *     allowed object is
     *     {@link PETICIONCERTIFICADO.AUTENTICACION }
     *     
     */
    public void setAUTENTICACION(PETICIONCERTIFICADO.AUTENTICACION value) {
        this.autenticacion = value;
    }

    /**
     * Obtiene el valor de la propiedad modalidad.
     * 
     * @return
     *     possible object is
     *     {@link PETICIONCERTIFICADO.MODALIDAD }
     *     
     */
    public PETICIONCERTIFICADO.MODALIDAD getMODALIDAD() {
        return modalidad;
    }

    /**
     * Define el valor de la propiedad modalidad.
     * 
     * @param value
     *     allowed object is
     *     {@link PETICIONCERTIFICADO.MODALIDAD }
     *     
     */
    public void setMODALIDAD(PETICIONCERTIFICADO.MODALIDAD value) {
        this.modalidad = value;
    }

    /**
     * Obtiene el valor de la propiedad datos.
     * 
     * @return
     *     possible object is
     *     {@link PETICIONCERTIFICADO.DATOS }
     *     
     */
    public PETICIONCERTIFICADO.DATOS getDATOS() {
        return datos;
    }

    /**
     * Define el valor de la propiedad datos.
     * 
     * @param value
     *     allowed object is
     *     {@link PETICIONCERTIFICADO.DATOS }
     *     
     */
    public void setDATOS(PETICIONCERTIFICADO.DATOS value) {
        this.datos = value;
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
     *       &lt;attribute name="login" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="pass" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="cliente" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
        @XmlAttribute(name = "login")
        protected String login;
        @XmlAttribute(name = "pass")
        protected String pass;
        @XmlAttribute(name = "cliente")
        protected String cliente;

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

    }


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
     *         &lt;element name="FECHA_INICIO_VIAJE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="NASEGURADOS" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
     *         &lt;element name="ASEGURADOS"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="ASEGURADO" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="NOMBRE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="LOCALIDAD" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="PRECIO_NETO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="REF_AGENCIA" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="TRAMITADO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="COUNTRY_SOLD" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "fechainicioviaje",
        "nasegurados",
        "asegurados",
        "localidad",
        "precioneto",
        "refagencia",
        "tramitado",
        "countrysold"
    })
    public static class DATOS {

        @XmlElement(name = "FECHA_INICIO_VIAJE", required = true)
        protected String fechainicioviaje;
        @XmlElement(name = "NASEGURADOS")
        protected byte nasegurados;
        @XmlElement(name = "ASEGURADOS", required = true)
        protected PETICIONCERTIFICADO.DATOS.ASEGURADOS asegurados;
        @XmlElement(name = "LOCALIDAD", required = true)
        protected String localidad;
        @XmlElement(name = "PRECIO_NETO", required = true)
        protected String precioneto;
        @XmlElement(name = "REF_AGENCIA", required = true)
        protected String refagencia;
        @XmlElement(name = "TRAMITADO", required = true)
        protected String tramitado;
        @XmlElement(name = "COUNTRY_SOLD", required = true)
        protected String countrysold;

        /**
         * Obtiene el valor de la propiedad fechainicioviaje.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFECHAINICIOVIAJE() {
            return fechainicioviaje;
        }

        /**
         * Define el valor de la propiedad fechainicioviaje.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFECHAINICIOVIAJE(String value) {
            this.fechainicioviaje = value;
        }

        /**
         * Obtiene el valor de la propiedad nasegurados.
         * 
         */
        public byte getNASEGURADOS() {
            return nasegurados;
        }

        /**
         * Define el valor de la propiedad nasegurados.
         * 
         */
        public void setNASEGURADOS(byte value) {
            this.nasegurados = value;
        }

        /**
         * Obtiene el valor de la propiedad asegurados.
         * 
         * @return
         *     possible object is
         *     {@link PETICIONCERTIFICADO.DATOS.ASEGURADOS }
         *     
         */
        public PETICIONCERTIFICADO.DATOS.ASEGURADOS getASEGURADOS() {
            return asegurados;
        }

        /**
         * Define el valor de la propiedad asegurados.
         * 
         * @param value
         *     allowed object is
         *     {@link PETICIONCERTIFICADO.DATOS.ASEGURADOS }
         *     
         */
        public void setASEGURADOS(PETICIONCERTIFICADO.DATOS.ASEGURADOS value) {
            this.asegurados = value;
        }

        /**
         * Obtiene el valor de la propiedad localidad.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLOCALIDAD() {
            return localidad;
        }

        /**
         * Define el valor de la propiedad localidad.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLOCALIDAD(String value) {
            this.localidad = value;
        }

        /**
         * Obtiene el valor de la propiedad precioneto.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPRECIONETO() {
            return precioneto;
        }

        /**
         * Define el valor de la propiedad precioneto.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPRECIONETO(String value) {
            this.precioneto = value;
        }

        /**
         * Obtiene el valor de la propiedad refagencia.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREFAGENCIA() {
            return refagencia;
        }

        /**
         * Define el valor de la propiedad refagencia.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREFAGENCIA(String value) {
            this.refagencia = value;
        }

        /**
         * Obtiene el valor de la propiedad tramitado.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTRAMITADO() {
            return tramitado;
        }

        /**
         * Define el valor de la propiedad tramitado.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTRAMITADO(String value) {
            this.tramitado = value;
        }

        /**
         * Obtiene el valor de la propiedad countrysold.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCOUNTRYSOLD() {
            return countrysold;
        }

        /**
         * Define el valor de la propiedad countrysold.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCOUNTRYSOLD(String value) {
            this.countrysold = value;
        }


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
         *         &lt;element name="ASEGURADO" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="NOMBRE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
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
            "asegurado"
        })
        public static class ASEGURADOS {

            @XmlElement(name = "ASEGURADO")
            protected List<PETICIONCERTIFICADO.DATOS.ASEGURADOS.ASEGURADO> asegurado;

            /**
             * Gets the value of the asegurado property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the asegurado property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getASEGURADO().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PETICIONCERTIFICADO.DATOS.ASEGURADOS.ASEGURADO }
             * 
             * 
             */
            public List<PETICIONCERTIFICADO.DATOS.ASEGURADOS.ASEGURADO> getASEGURADO() {
                if (asegurado == null) {
                    asegurado = new ArrayList<PETICIONCERTIFICADO.DATOS.ASEGURADOS.ASEGURADO>();
                }
                return this.asegurado;
            }


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
             *         &lt;element name="NOMBRE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
                "nombre"
            })
            public static class ASEGURADO {

                @XmlElement(name = "NOMBRE", required = true)
                protected String nombre;

                /**
                 * Obtiene el valor de la propiedad nombre.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNOMBRE() {
                    return nombre;
                }

                /**
                 * Define el valor de la propiedad nombre.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNOMBRE(String value) {
                    this.nombre = value;
                }

            }

        }

    }


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
     *         &lt;element name="DESTINO"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="DURACION"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;simpleContent&gt;
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                           &lt;attribute name="codigo" type="{http://www.w3.org/2001/XMLSchema}byte" /&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/simpleContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="codigo" type="{http://www.w3.org/2001/XMLSchema}byte" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="codigo" type="{http://www.w3.org/2001/XMLSchema}byte" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "destino"
    })
    public static class MODALIDAD {

        @XmlElement(name = "DESTINO", required = true)
        protected PETICIONCERTIFICADO.MODALIDAD.DESTINO destino;
        @XmlAttribute(name = "codigo")
        protected Byte codigo;

        /**
         * Obtiene el valor de la propiedad destino.
         * 
         * @return
         *     possible object is
         *     {@link PETICIONCERTIFICADO.MODALIDAD.DESTINO }
         *     
         */
        public PETICIONCERTIFICADO.MODALIDAD.DESTINO getDESTINO() {
            return destino;
        }

        /**
         * Define el valor de la propiedad destino.
         * 
         * @param value
         *     allowed object is
         *     {@link PETICIONCERTIFICADO.MODALIDAD.DESTINO }
         *     
         */
        public void setDESTINO(PETICIONCERTIFICADO.MODALIDAD.DESTINO value) {
            this.destino = value;
        }

        /**
         * Obtiene el valor de la propiedad codigo.
         * 
         * @return
         *     possible object is
         *     {@link Byte }
         *     
         */
        public Byte getCodigo() {
            return codigo;
        }

        /**
         * Define el valor de la propiedad codigo.
         * 
         * @param value
         *     allowed object is
         *     {@link Byte }
         *     
         */
        public void setCodigo(Byte value) {
            this.codigo = value;
        }


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
         *         &lt;element name="DURACION"&gt;
         *           &lt;complexType&gt;
         *             &lt;simpleContent&gt;
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *                 &lt;attribute name="codigo" type="{http://www.w3.org/2001/XMLSchema}byte" /&gt;
         *               &lt;/extension&gt;
         *             &lt;/simpleContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="codigo" type="{http://www.w3.org/2001/XMLSchema}byte" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "duracion"
        })
        public static class DESTINO {

            @XmlElement(name = "DURACION", required = true)
            protected PETICIONCERTIFICADO.MODALIDAD.DESTINO.DURACION duracion;
            @XmlAttribute(name = "codigo")
            protected Byte codigo;

            /**
             * Obtiene el valor de la propiedad duracion.
             * 
             * @return
             *     possible object is
             *     {@link PETICIONCERTIFICADO.MODALIDAD.DESTINO.DURACION }
             *     
             */
            public PETICIONCERTIFICADO.MODALIDAD.DESTINO.DURACION getDURACION() {
                return duracion;
            }

            /**
             * Define el valor de la propiedad duracion.
             * 
             * @param value
             *     allowed object is
             *     {@link PETICIONCERTIFICADO.MODALIDAD.DESTINO.DURACION }
             *     
             */
            public void setDURACION(PETICIONCERTIFICADO.MODALIDAD.DESTINO.DURACION value) {
                this.duracion = value;
            }

            /**
             * Obtiene el valor de la propiedad codigo.
             * 
             * @return
             *     possible object is
             *     {@link Byte }
             *     
             */
            public Byte getCodigo() {
                return codigo;
            }

            /**
             * Define el valor de la propiedad codigo.
             * 
             * @param value
             *     allowed object is
             *     {@link Byte }
             *     
             */
            public void setCodigo(Byte value) {
                this.codigo = value;
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
             *       &lt;attribute name="codigo" type="{http://www.w3.org/2001/XMLSchema}byte" /&gt;
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
            public static class DURACION {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "codigo")
                protected Byte codigo;

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
                 * Obtiene el valor de la propiedad codigo.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Byte }
                 *     
                 */
                public Byte getCodigo() {
                    return codigo;
                }

                /**
                 * Define el valor de la propiedad codigo.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Byte }
                 *     
                 */
                public void setCodigo(Byte value) {
                    this.codigo = value;
                }

            }

        }

    }

}
