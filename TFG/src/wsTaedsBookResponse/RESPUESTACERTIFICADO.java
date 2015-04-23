//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2014.11.27 a las 11:43:11 AM CET 
//


package wsTaedsBookResponse;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="PERIODO"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="DESDE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="HASTA" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CODIGO_REFERENCIA" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="LOCALIZADOR" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="NUMERO_POLIZA" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ASOCIACION_AGRUPACION" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MODALIDAD" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DESTINO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FECHA_EXPEDICION" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NUMERO_ASEGURADOS_VIAJEROS" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
 *         &lt;element name="POBLACION" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PRECIO" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
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
 *                             &lt;element name="DNI" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
 *         &lt;element name="CERTIFICADO_URL" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CERTIFICADOECO_URL" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MICERTIFICADO_URL" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
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
    "periodo",
    "codigoreferencia",
    "localizador",
    "numeropoliza",
    "asociacionagrupacion",
    "modalidad",
    "destino",
    "fechaexpedicion",
    "numeroaseguradosviajeros",
    "poblacion",
    "precio",
    "asegurados",
    "certificadourl",
    "certificadoecourl",
    "micertificadourl"
})
@XmlRootElement(name = "RESPUESTA_CERTIFICADO")
public class RESPUESTACERTIFICADO {

    @XmlElement(name = "PERIODO", required = true)
    protected RESPUESTACERTIFICADO.PERIODO periodo;
    @XmlElement(name = "CODIGO_REFERENCIA")
    protected int codigoreferencia;
    @XmlElement(name = "LOCALIZADOR")
    protected long localizador;
    @XmlElement(name = "NUMERO_POLIZA", required = true)
    protected String numeropoliza;
    @XmlElement(name = "ASOCIACION_AGRUPACION", required = true)
    protected String asociacionagrupacion;
    @XmlElement(name = "MODALIDAD", required = true)
    protected String modalidad;
    @XmlElement(name = "DESTINO", required = true)
    protected String destino;
    @XmlElement(name = "FECHA_EXPEDICION", required = true)
    protected String fechaexpedicion;
    @XmlElement(name = "NUMERO_ASEGURADOS_VIAJEROS")
    protected byte numeroaseguradosviajeros;
    @XmlElement(name = "POBLACION", required = true)
    protected String poblacion;
    @XmlElement(name = "PRECIO")
    protected float precio;
    @XmlElement(name = "ASEGURADOS", required = true)
    protected RESPUESTACERTIFICADO.ASEGURADOS asegurados;
    @XmlElement(name = "CERTIFICADO_URL", required = true)
    protected String certificadourl;
    @XmlElement(name = "CERTIFICADOECO_URL", required = true)
    protected String certificadoecourl;
    @XmlElement(name = "MICERTIFICADO_URL", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String micertificadourl;

    /**
     * Obtiene el valor de la propiedad periodo.
     * 
     * @return
     *     possible object is
     *     {@link RESPUESTACERTIFICADO.PERIODO }
     *     
     */
    public RESPUESTACERTIFICADO.PERIODO getPERIODO() {
        return periodo;
    }

    /**
     * Define el valor de la propiedad periodo.
     * 
     * @param value
     *     allowed object is
     *     {@link RESPUESTACERTIFICADO.PERIODO }
     *     
     */
    public void setPERIODO(RESPUESTACERTIFICADO.PERIODO value) {
        this.periodo = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoreferencia.
     * 
     */
    public int getCODIGOREFERENCIA() {
        return codigoreferencia;
    }

    /**
     * Define el valor de la propiedad codigoreferencia.
     * 
     */
    public void setCODIGOREFERENCIA(int value) {
        this.codigoreferencia = value;
    }

    /**
     * Obtiene el valor de la propiedad localizador.
     * 
     */
    public long getLOCALIZADOR() {
        return localizador;
    }

    /**
     * Define el valor de la propiedad localizador.
     * 
     */
    public void setLOCALIZADOR(long value) {
        this.localizador = value;
    }

    /**
     * Obtiene el valor de la propiedad numeropoliza.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMEROPOLIZA() {
        return numeropoliza;
    }

    /**
     * Define el valor de la propiedad numeropoliza.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMEROPOLIZA(String value) {
        this.numeropoliza = value;
    }

    /**
     * Obtiene el valor de la propiedad asociacionagrupacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getASOCIACIONAGRUPACION() {
        return asociacionagrupacion;
    }

    /**
     * Define el valor de la propiedad asociacionagrupacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setASOCIACIONAGRUPACION(String value) {
        this.asociacionagrupacion = value;
    }

    /**
     * Obtiene el valor de la propiedad modalidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMODALIDAD() {
        return modalidad;
    }

    /**
     * Define el valor de la propiedad modalidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMODALIDAD(String value) {
        this.modalidad = value;
    }

    /**
     * Obtiene el valor de la propiedad destino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESTINO() {
        return destino;
    }

    /**
     * Define el valor de la propiedad destino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESTINO(String value) {
        this.destino = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaexpedicion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFECHAEXPEDICION() {
        return fechaexpedicion;
    }

    /**
     * Define el valor de la propiedad fechaexpedicion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFECHAEXPEDICION(String value) {
        this.fechaexpedicion = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroaseguradosviajeros.
     * 
     */
    public byte getNUMEROASEGURADOSVIAJEROS() {
        return numeroaseguradosviajeros;
    }

    /**
     * Define el valor de la propiedad numeroaseguradosviajeros.
     * 
     */
    public void setNUMEROASEGURADOSVIAJEROS(byte value) {
        this.numeroaseguradosviajeros = value;
    }

    /**
     * Obtiene el valor de la propiedad poblacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOBLACION() {
        return poblacion;
    }

    /**
     * Define el valor de la propiedad poblacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOBLACION(String value) {
        this.poblacion = value;
    }

    /**
     * Obtiene el valor de la propiedad precio.
     * 
     */
    public float getPRECIO() {
        return precio;
    }

    /**
     * Define el valor de la propiedad precio.
     * 
     */
    public void setPRECIO(float value) {
        this.precio = value;
    }

    /**
     * Obtiene el valor de la propiedad asegurados.
     * 
     * @return
     *     possible object is
     *     {@link RESPUESTACERTIFICADO.ASEGURADOS }
     *     
     */
    public RESPUESTACERTIFICADO.ASEGURADOS getASEGURADOS() {
        return asegurados;
    }

    /**
     * Define el valor de la propiedad asegurados.
     * 
     * @param value
     *     allowed object is
     *     {@link RESPUESTACERTIFICADO.ASEGURADOS }
     *     
     */
    public void setASEGURADOS(RESPUESTACERTIFICADO.ASEGURADOS value) {
        this.asegurados = value;
    }

    /**
     * Obtiene el valor de la propiedad certificadourl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCERTIFICADOURL() {
        return certificadourl;
    }

    /**
     * Define el valor de la propiedad certificadourl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCERTIFICADOURL(String value) {
        this.certificadourl = value;
    }

    /**
     * Obtiene el valor de la propiedad certificadoecourl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCERTIFICADOECOURL() {
        return certificadoecourl;
    }

    /**
     * Define el valor de la propiedad certificadoecourl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCERTIFICADOECOURL(String value) {
        this.certificadoecourl = value;
    }

    /**
     * Obtiene el valor de la propiedad micertificadourl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMICERTIFICADOURL() {
        return micertificadourl;
    }

    /**
     * Define el valor de la propiedad micertificadourl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMICERTIFICADOURL(String value) {
        this.micertificadourl = value;
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
     *                   &lt;element name="DNI" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        protected List<RESPUESTACERTIFICADO.ASEGURADOS.ASEGURADO> asegurado;

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
         * {@link RESPUESTACERTIFICADO.ASEGURADOS.ASEGURADO }
         * 
         * 
         */
        public List<RESPUESTACERTIFICADO.ASEGURADOS.ASEGURADO> getASEGURADO() {
            if (asegurado == null) {
                asegurado = new ArrayList<RESPUESTACERTIFICADO.ASEGURADOS.ASEGURADO>();
            }
            return this.asegurado;
        }
        
        public String toString() {
        String asegurados = "";           
    	
	    	for (Iterator<RESPUESTACERTIFICADO.ASEGURADOS.ASEGURADO> itA = this.getASEGURADO().iterator(); itA.hasNext();) {        		
	    		asegurados = asegurados + itA.next().toString() + "\n";
	    	}       	
	    return asegurados;
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
         *         &lt;element name="DNI" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
            "nombre",
            "dni"
        })
        public static class ASEGURADO {

            @XmlElement(name = "NOMBRE", required = true)
            protected String nombre;
            @XmlElement(name = "DNI", required = true)
            protected String dni;

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

            /**
             * Obtiene el valor de la propiedad dni.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDNI() {
                return dni;
            }

            /**
             * Define el valor de la propiedad dni.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDNI(String value) {
                this.dni = value;
            }
            
            
            public String toString() {
            	String asegurado = this.getNOMBRE() + this.getDNI();            	
            return asegurado;	
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
     *         &lt;element name="DESDE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="HASTA" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "desde",
        "hasta"
    })
    public static class PERIODO {

        @XmlElement(name = "DESDE", required = true)
        protected String desde;
        @XmlElement(name = "HASTA", required = true)
        protected String hasta;

        /**
         * Obtiene el valor de la propiedad desde.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDESDE() {
            return desde;
        }

        /**
         * Define el valor de la propiedad desde.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDESDE(String value) {
            this.desde = value;
        }

        /**
         * Obtiene el valor de la propiedad hasta.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHASTA() {
            return hasta;
        }

        /**
         * Define el valor de la propiedad hasta.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHASTA(String value) {
            this.hasta = value;
        }

    }

}
