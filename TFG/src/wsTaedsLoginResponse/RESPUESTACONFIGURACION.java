//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2014.11.27 a las 11:40:55 AM CET 
//


package wsTaedsLoginResponse;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="MODALIDADES"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="MODALIDAD" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="IMGMODURL" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
 *                             &lt;element name="IMGCOURL" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
 *                             &lt;element name="MODURL" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
 *                             &lt;element name="LABEL" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="DESTINO" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="DURACION" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;simpleContent&gt;
 *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                                               &lt;attribute name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                               &lt;attribute name="codigo" type="{http://www.w3.org/2001/XMLSchema}short" /&gt;
 *                                               &lt;attribute name="dies" type="{http://www.w3.org/2001/XMLSchema}short" /&gt;
 *                                               &lt;attribute name="precio" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *                                               &lt;attribute name="precioC" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *                                             &lt;/extension&gt;
 *                                           &lt;/simpleContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                     &lt;attribute name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="codigo" type="{http://www.w3.org/2001/XMLSchema}byte" /&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="GARANTIAS" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="GARANTIA" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="CAPITAL" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;simpleContent&gt;
 *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                                                         &lt;attribute name="nombre" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *                                                         &lt;attribute name="codigoCapital" type="{http://www.w3.org/2001/XMLSchema}byte" /&gt;
 *                                                         &lt;attribute name="codigoDestino" type="{http://www.w3.org/2001/XMLSchema}byte" /&gt;
 *                                                         &lt;attribute name="codigoDuracion" type="{http://www.w3.org/2001/XMLSchema}byte" /&gt;
 *                                                         &lt;attribute name="precio" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *                                                         &lt;attribute name="precioCoste" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *                                                       &lt;/extension&gt;
 *                                                     &lt;/simpleContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                               &lt;/sequence&gt;
 *                                               &lt;attribute name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                               &lt;attribute name="codigoGarantia" type="{http://www.w3.org/2001/XMLSchema}byte" /&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="codigo" type="{http://www.w3.org/2001/XMLSchema}short" /&gt;
 *                           &lt;attribute name="TAEDSOK" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="Comisionable" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="valorGlobal" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="maxPax" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="isAccident" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="fechafin" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AGENCIA"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="IMGAGURL" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
 *                   &lt;element name="IMGGRPURL" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
 *                   &lt;element name="PRECIO_CREDITO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TRAMITADORES"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TRAMITADOR" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                           &lt;attribute name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="codigo" type="{http://www.w3.org/2001/XMLSchema}short" /&gt;
 *                           &lt;attribute name="nif" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
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
    "modalidades",
    "agencia",
    "tramitadores"
})
@XmlRootElement(name = "RESPUESTA_CONFIGURACION")
public class RESPUESTACONFIGURACION {

    @XmlElement(name = "MODALIDADES", required = true)
    protected RESPUESTACONFIGURACION.MODALIDADES modalidades;
    @XmlElement(name = "AGENCIA", required = true)
    protected RESPUESTACONFIGURACION.AGENCIA agencia;
    @XmlElement(name = "TRAMITADORES", required = true)
    protected RESPUESTACONFIGURACION.TRAMITADORES tramitadores;

    /**
     * Obtiene el valor de la propiedad modalidades.
     * 
     * @return
     *     possible object is
     *     {@link RESPUESTACONFIGURACION.MODALIDADES }
     *     
     */
    public RESPUESTACONFIGURACION.MODALIDADES getMODALIDADES() {
        return modalidades;
    }

    /**
     * Define el valor de la propiedad modalidades.
     * 
     * @param value
     *     allowed object is
     *     {@link RESPUESTACONFIGURACION.MODALIDADES }
     *     
     */
    public void setMODALIDADES(RESPUESTACONFIGURACION.MODALIDADES value) {
        this.modalidades = value;
    }

    /**
     * Obtiene el valor de la propiedad agencia.
     * 
     * @return
     *     possible object is
     *     {@link RESPUESTACONFIGURACION.AGENCIA }
     *     
     */
    public RESPUESTACONFIGURACION.AGENCIA getAGENCIA() {
        return agencia;
    }

    /**
     * Define el valor de la propiedad agencia.
     * 
     * @param value
     *     allowed object is
     *     {@link RESPUESTACONFIGURACION.AGENCIA }
     *     
     */
    public void setAGENCIA(RESPUESTACONFIGURACION.AGENCIA value) {
        this.agencia = value;
    }

    /**
     * Obtiene el valor de la propiedad tramitadores.
     * 
     * @return
     *     possible object is
     *     {@link RESPUESTACONFIGURACION.TRAMITADORES }
     *     
     */
    public RESPUESTACONFIGURACION.TRAMITADORES getTRAMITADORES() {
        return tramitadores;
    }

    /**
     * Define el valor de la propiedad tramitadores.
     * 
     * @param value
     *     allowed object is
     *     {@link RESPUESTACONFIGURACION.TRAMITADORES }
     *     
     */
    public void setTRAMITADORES(RESPUESTACONFIGURACION.TRAMITADORES value) {
        this.tramitadores = value;
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
     *         &lt;element name="IMGAGURL" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
     *         &lt;element name="IMGGRPURL" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
     *         &lt;element name="PRECIO_CREDITO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "imgagurl",
        "imggrpurl",
        "preciocredito"
    })
    public static class AGENCIA {

        @XmlElement(name = "IMGAGURL", required = true)
        @XmlSchemaType(name = "anyURI")
        protected String imgagurl;
        @XmlElement(name = "IMGGRPURL", required = true)
        @XmlSchemaType(name = "anyURI")
        protected String imggrpurl;
        @XmlElement(name = "PRECIO_CREDITO", required = true)
        protected String preciocredito;

        /**
         * Obtiene el valor de la propiedad imgagurl.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIMGAGURL() {
            return imgagurl;
        }

        /**
         * Define el valor de la propiedad imgagurl.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIMGAGURL(String value) {
            this.imgagurl = value;
        }

        /**
         * Obtiene el valor de la propiedad imggrpurl.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIMGGRPURL() {
            return imggrpurl;
        }

        /**
         * Define el valor de la propiedad imggrpurl.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIMGGRPURL(String value) {
            this.imggrpurl = value;
        }

        /**
         * Obtiene el valor de la propiedad preciocredito.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPRECIOCREDITO() {
            return preciocredito;
        }

        /**
         * Define el valor de la propiedad preciocredito.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPRECIOCREDITO(String value) {
            this.preciocredito = value;
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
     *         &lt;element name="MODALIDAD" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="IMGMODURL" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
     *                   &lt;element name="IMGCOURL" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
     *                   &lt;element name="MODURL" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
     *                   &lt;element name="LABEL" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="DESTINO" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="DURACION" maxOccurs="unbounded" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;simpleContent&gt;
     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                                     &lt;attribute name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                     &lt;attribute name="codigo" type="{http://www.w3.org/2001/XMLSchema}short" /&gt;
     *                                     &lt;attribute name="dies" type="{http://www.w3.org/2001/XMLSchema}short" /&gt;
     *                                     &lt;attribute name="precio" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
     *                                     &lt;attribute name="precioC" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
     *                                   &lt;/extension&gt;
     *                                 &lt;/simpleContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                           &lt;attribute name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                           &lt;attribute name="codigo" type="{http://www.w3.org/2001/XMLSchema}byte" /&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="GARANTIAS" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="GARANTIA" maxOccurs="unbounded" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="CAPITAL" maxOccurs="unbounded" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;simpleContent&gt;
     *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                                               &lt;attribute name="nombre" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *                                               &lt;attribute name="codigoCapital" type="{http://www.w3.org/2001/XMLSchema}byte" /&gt;
     *                                               &lt;attribute name="codigoDestino" type="{http://www.w3.org/2001/XMLSchema}byte" /&gt;
     *                                               &lt;attribute name="codigoDuracion" type="{http://www.w3.org/2001/XMLSchema}byte" /&gt;
     *                                               &lt;attribute name="precio" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
     *                                               &lt;attribute name="precioCoste" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
     *                                             &lt;/extension&gt;
     *                                           &lt;/simpleContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                     &lt;/sequence&gt;
     *                                     &lt;attribute name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                     &lt;attribute name="codigoGarantia" type="{http://www.w3.org/2001/XMLSchema}byte" /&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="codigo" type="{http://www.w3.org/2001/XMLSchema}short" /&gt;
     *                 &lt;attribute name="TAEDSOK" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="Comisionable" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="valorGlobal" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="maxPax" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="isAccident" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="fechafin" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
        "modalidad"
    })
    public static class MODALIDADES {

        @XmlElement(name = "MODALIDAD")
        protected List<RESPUESTACONFIGURACION.MODALIDADES.MODALIDAD> modalidad;

        /**
         * Gets the value of the modalidad property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the modalidad property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMODALIDAD().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RESPUESTACONFIGURACION.MODALIDADES.MODALIDAD }
         * 
         * 
         */
        public List<RESPUESTACONFIGURACION.MODALIDADES.MODALIDAD> getMODALIDAD() {
            if (modalidad == null) {
                modalidad = new ArrayList<RESPUESTACONFIGURACION.MODALIDADES.MODALIDAD>();
            }
            return this.modalidad;
        }
        
        public String toString(){
        	String modalidades = "";           
            	
        	for (Iterator<RESPUESTACONFIGURACION.MODALIDADES.MODALIDAD> itM = this.getMODALIDAD().iterator(); itM.hasNext();) {        		
        		modalidades = modalidades + itM.next().toString() + "\n";
        	}       	
        	return modalidades;
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
         *         &lt;element name="IMGMODURL" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
         *         &lt;element name="IMGCOURL" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
         *         &lt;element name="MODURL" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
         *         &lt;element name="LABEL" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="DESTINO" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="DURACION" maxOccurs="unbounded" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;simpleContent&gt;
         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *                           &lt;attribute name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                           &lt;attribute name="codigo" type="{http://www.w3.org/2001/XMLSchema}short" /&gt;
         *                           &lt;attribute name="dies" type="{http://www.w3.org/2001/XMLSchema}short" /&gt;
         *                           &lt;attribute name="precio" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
         *                           &lt;attribute name="precioC" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
         *                         &lt;/extension&gt;
         *                       &lt;/simpleContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *                 &lt;attribute name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                 &lt;attribute name="codigo" type="{http://www.w3.org/2001/XMLSchema}byte" /&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="GARANTIAS" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="GARANTIA" maxOccurs="unbounded" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="CAPITAL" maxOccurs="unbounded" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;simpleContent&gt;
         *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *                                     &lt;attribute name="nombre" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
         *                                     &lt;attribute name="codigoCapital" type="{http://www.w3.org/2001/XMLSchema}byte" /&gt;
         *                                     &lt;attribute name="codigoDestino" type="{http://www.w3.org/2001/XMLSchema}byte" /&gt;
         *                                     &lt;attribute name="codigoDuracion" type="{http://www.w3.org/2001/XMLSchema}byte" /&gt;
         *                                     &lt;attribute name="precio" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
         *                                     &lt;attribute name="precioCoste" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
         *                                   &lt;/extension&gt;
         *                                 &lt;/simpleContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                           &lt;/sequence&gt;
         *                           &lt;attribute name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                           &lt;attribute name="codigoGarantia" type="{http://www.w3.org/2001/XMLSchema}byte" /&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="codigo" type="{http://www.w3.org/2001/XMLSchema}short" /&gt;
         *       &lt;attribute name="TAEDSOK" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="Comisionable" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="valorGlobal" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="maxPax" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="isAccident" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="fechafin" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "imgmodurl",
            "imgcourl",
            "modurl",
            "label",
            "destino",
            "garantias"
        })
        public static class MODALIDAD {

            @XmlElement(name = "IMGMODURL", required = true)
            @XmlSchemaType(name = "anyURI")
            protected String imgmodurl;
            @XmlElement(name = "IMGCOURL", required = true)
            @XmlSchemaType(name = "anyURI")
            protected String imgcourl;
            @XmlElement(name = "MODURL", required = true)
            @XmlSchemaType(name = "anyURI")
            protected String modurl;
            @XmlElement(name = "LABEL", required = true)
            protected String label;
            @XmlElement(name = "DESTINO")
            protected List<RESPUESTACONFIGURACION.MODALIDADES.MODALIDAD.DESTINO> destino;
            @XmlElement(name = "GARANTIAS")
            protected RESPUESTACONFIGURACION.MODALIDADES.MODALIDAD.GARANTIAS garantias;
            @XmlAttribute(name = "nombre")
            protected String nombre;
            @XmlAttribute(name = "codigo")
            protected Short codigo;
            @XmlAttribute(name = "TAEDSOK")
            protected String taedsok;
            @XmlAttribute(name = "Comisionable")
            protected String comisionable;
            @XmlAttribute(name = "valorGlobal")
            protected String valorGlobal;
            @XmlAttribute(name = "maxPax")
            protected String maxPax;
            @XmlAttribute(name = "isAccident")
            protected String isAccident;
            @XmlAttribute(name = "fechafin")
            protected String fechafin;

            /**
             * Obtiene el valor de la propiedad imgmodurl.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIMGMODURL() {
                return imgmodurl;
            }

            /**
             * Define el valor de la propiedad imgmodurl.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIMGMODURL(String value) {
                this.imgmodurl = value;
            }

            /**
             * Obtiene el valor de la propiedad imgcourl.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIMGCOURL() {
                return imgcourl;
            }

            /**
             * Define el valor de la propiedad imgcourl.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIMGCOURL(String value) {
                this.imgcourl = value;
            }

            /**
             * Obtiene el valor de la propiedad modurl.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMODURL() {
                return modurl;
            }

            /**
             * Define el valor de la propiedad modurl.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMODURL(String value) {
                this.modurl = value;
            }

            /**
             * Obtiene el valor de la propiedad label.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLABEL() {
                return label;
            }

            /**
             * Define el valor de la propiedad label.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLABEL(String value) {
                this.label = value;
            }

            /**
             * Gets the value of the destino property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the destino property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDESTINO().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link RESPUESTACONFIGURACION.MODALIDADES.MODALIDAD.DESTINO }
             * 
             * 
             */
            public List<RESPUESTACONFIGURACION.MODALIDADES.MODALIDAD.DESTINO> getDESTINO() {
                if (destino == null) {
                    destino = new ArrayList<RESPUESTACONFIGURACION.MODALIDADES.MODALIDAD.DESTINO>();
                }
                return this.destino;
            }

            /**
             * Obtiene el valor de la propiedad garantias.
             * 
             * @return
             *     possible object is
             *     {@link RESPUESTACONFIGURACION.MODALIDADES.MODALIDAD.GARANTIAS }
             *     
             */
            public RESPUESTACONFIGURACION.MODALIDADES.MODALIDAD.GARANTIAS getGARANTIAS() {
                return garantias;
            }

            /**
             * Define el valor de la propiedad garantias.
             * 
             * @param value
             *     allowed object is
             *     {@link RESPUESTACONFIGURACION.MODALIDADES.MODALIDAD.GARANTIAS }
             *     
             */
            public void setGARANTIAS(RESPUESTACONFIGURACION.MODALIDADES.MODALIDAD.GARANTIAS value) {
                this.garantias = value;
            }

            /**
             * Obtiene el valor de la propiedad nombre.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNombre() {
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
            public void setNombre(String value) {
                this.nombre = value;
            }

            /**
             * Obtiene el valor de la propiedad codigo.
             * 
             * @return
             *     possible object is
             *     {@link Short }
             *     
             */
            public Short getCodigo() {
                return codigo;
            }

            /**
             * Define el valor de la propiedad codigo.
             * 
             * @param value
             *     allowed object is
             *     {@link Short }
             *     
             */
            public void setCodigo(Short value) {
                this.codigo = value;
            }

            /**
             * Obtiene el valor de la propiedad taedsok.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTAEDSOK() {
                return taedsok;
            }

            /**
             * Define el valor de la propiedad taedsok.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTAEDSOK(String value) {
                this.taedsok = value;
            }

            /**
             * Obtiene el valor de la propiedad comisionable.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getComisionable() {
                return comisionable;
            }

            /**
             * Define el valor de la propiedad comisionable.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setComisionable(String value) {
                this.comisionable = value;
            }

            /**
             * Obtiene el valor de la propiedad valorGlobal.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValorGlobal() {
                return valorGlobal;
            }

            /**
             * Define el valor de la propiedad valorGlobal.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValorGlobal(String value) {
                this.valorGlobal = value;
            }

            /**
             * Obtiene el valor de la propiedad maxPax.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMaxPax() {
                return maxPax;
            }

            /**
             * Define el valor de la propiedad maxPax.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMaxPax(String value) {
                this.maxPax = value;
            }

            /**
             * Obtiene el valor de la propiedad isAccident.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIsAccident() {
                return isAccident;
            }

            /**
             * Define el valor de la propiedad isAccident.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIsAccident(String value) {
                this.isAccident = value;
            }

            /**
             * Obtiene el valor de la propiedad fechafin.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFechafin() {
                return fechafin;
            }

            /**
             * Define el valor de la propiedad fechafin.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFechafin(String value) {
                this.fechafin = value;
            }

            public String toString() {            	           	
            	
            	String modalidad = "Modalidad: " + this.getNombre() + "\tCodigo: " + this.getCodigo() + "\n\t" +
            						"Notas: " + this.getLABEL() + "\n\t" +
            						"Precios: " + this.getDESTINO() + "\n\n";           	
            	return modalidad;
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
             *         &lt;element name="DURACION" maxOccurs="unbounded" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;simpleContent&gt;
             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
             *                 &lt;attribute name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                 &lt;attribute name="codigo" type="{http://www.w3.org/2001/XMLSchema}short" /&gt;
             *                 &lt;attribute name="dies" type="{http://www.w3.org/2001/XMLSchema}short" /&gt;
             *                 &lt;attribute name="precio" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
             *                 &lt;attribute name="precioC" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
             *               &lt;/extension&gt;
             *             &lt;/simpleContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *       &lt;/sequence&gt;
             *       &lt;attribute name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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

                @XmlElement(name = "DURACION")
                protected List<RESPUESTACONFIGURACION.MODALIDADES.MODALIDAD.DESTINO.DURACION> duracion;
                @XmlAttribute(name = "nombre")
                protected String nombre;
                @XmlAttribute(name = "codigo")
                protected Byte codigo;

                /**
                 * Gets the value of the duracion property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the duracion property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getDURACION().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link RESPUESTACONFIGURACION.MODALIDADES.MODALIDAD.DESTINO.DURACION }
                 * 
                 * 
                 */
                public List<RESPUESTACONFIGURACION.MODALIDADES.MODALIDAD.DESTINO.DURACION> getDURACION() {
                    if (duracion == null) {
                        duracion = new ArrayList<RESPUESTACONFIGURACION.MODALIDADES.MODALIDAD.DESTINO.DURACION>();
                    }
                    return this.duracion;
                }

                /**
                 * Obtiene el valor de la propiedad nombre.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNombre() {
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
                public void setNombre(String value) {
                    this.nombre = value;
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
                
                public String toString() {
                	String precios="";
                	precios = "\n\t\t" + this.getNombre() + " cod." + this.getCodigo() + "\n\t\t"; 
		        	for (Iterator<RESPUESTACONFIGURACION.MODALIDADES.MODALIDAD.DESTINO.DURACION> itD = this.getDURACION().iterator(); itD.hasNext();) {		        		
		        		DURACION d = itD.next();
		        		precios = precios + d.getNombre() + " cod." +  d.getCodigo() + " PVP:" + d.getPrecio() + "\tNETO:" + d.getPrecioC() + "\n\t\t";
		        	}                
                	return precios;
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
                 *       &lt;attribute name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *       &lt;attribute name="codigo" type="{http://www.w3.org/2001/XMLSchema}short" /&gt;
                 *       &lt;attribute name="dies" type="{http://www.w3.org/2001/XMLSchema}short" /&gt;
                 *       &lt;attribute name="precio" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
                 *       &lt;attribute name="precioC" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
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
                    @XmlAttribute(name = "nombre")
                    protected String nombre;
                    @XmlAttribute(name = "codigo")
                    protected Short codigo;
                    @XmlAttribute(name = "dies")
                    protected Short dies;
                    @XmlAttribute(name = "precio")
                    protected Float precio;
                    @XmlAttribute(name = "precioC")
                    protected Float precioC;

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
                     * Obtiene el valor de la propiedad nombre.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNombre() {
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
                    public void setNombre(String value) {
                        this.nombre = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad codigo.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Short }
                     *     
                     */
                    public Short getCodigo() {
                        return codigo;
                    }

                    /**
                     * Define el valor de la propiedad codigo.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Short }
                     *     
                     */
                    public void setCodigo(Short value) {
                        this.codigo = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad dies.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Short }
                     *     
                     */
                    public Short getDies() {
                        return dies;
                    }

                    /**
                     * Define el valor de la propiedad dies.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Short }
                     *     
                     */
                    public void setDies(Short value) {
                        this.dies = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad precio.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Float }
                     *     
                     */
                    public Float getPrecio() {
                        return precio;
                    }

                    /**
                     * Define el valor de la propiedad precio.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Float }
                     *     
                     */
                    public void setPrecio(Float value) {
                        this.precio = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad precioC.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Float }
                     *     
                     */
                    public Float getPrecioC() {
                        return precioC;
                    }

                    /**
                     * Define el valor de la propiedad precioC.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Float }
                     *     
                     */
                    public void setPrecioC(Float value) {
                        this.precioC = value;
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
             *         &lt;element name="GARANTIA" maxOccurs="unbounded" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="CAPITAL" maxOccurs="unbounded" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;simpleContent&gt;
             *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
             *                           &lt;attribute name="nombre" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
             *                           &lt;attribute name="codigoCapital" type="{http://www.w3.org/2001/XMLSchema}byte" /&gt;
             *                           &lt;attribute name="codigoDestino" type="{http://www.w3.org/2001/XMLSchema}byte" /&gt;
             *                           &lt;attribute name="codigoDuracion" type="{http://www.w3.org/2001/XMLSchema}byte" /&gt;
             *                           &lt;attribute name="precio" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
             *                           &lt;attribute name="precioCoste" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
             *                         &lt;/extension&gt;
             *                       &lt;/simpleContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                 &lt;/sequence&gt;
             *                 &lt;attribute name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                 &lt;attribute name="codigoGarantia" type="{http://www.w3.org/2001/XMLSchema}byte" /&gt;
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
                "garantia"
            })
            public static class GARANTIAS {

                @XmlElement(name = "GARANTIA")
                protected List<RESPUESTACONFIGURACION.MODALIDADES.MODALIDAD.GARANTIAS.GARANTIA> garantia;

                /**
                 * Gets the value of the garantia property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the garantia property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getGARANTIA().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link RESPUESTACONFIGURACION.MODALIDADES.MODALIDAD.GARANTIAS.GARANTIA }
                 * 
                 * 
                 */
                public List<RESPUESTACONFIGURACION.MODALIDADES.MODALIDAD.GARANTIAS.GARANTIA> getGARANTIA() {
                    if (garantia == null) {
                        garantia = new ArrayList<RESPUESTACONFIGURACION.MODALIDADES.MODALIDAD.GARANTIAS.GARANTIA>();
                    }
                    return this.garantia;
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
                 *         &lt;element name="CAPITAL" maxOccurs="unbounded" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;simpleContent&gt;
                 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
                 *                 &lt;attribute name="nombre" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
                 *                 &lt;attribute name="codigoCapital" type="{http://www.w3.org/2001/XMLSchema}byte" /&gt;
                 *                 &lt;attribute name="codigoDestino" type="{http://www.w3.org/2001/XMLSchema}byte" /&gt;
                 *                 &lt;attribute name="codigoDuracion" type="{http://www.w3.org/2001/XMLSchema}byte" /&gt;
                 *                 &lt;attribute name="precio" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
                 *                 &lt;attribute name="precioCoste" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
                 *               &lt;/extension&gt;
                 *             &lt;/simpleContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *       &lt;/sequence&gt;
                 *       &lt;attribute name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *       &lt;attribute name="codigoGarantia" type="{http://www.w3.org/2001/XMLSchema}byte" /&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "capital"
                })
                public static class GARANTIA {

                    @XmlElement(name = "CAPITAL")
                    protected List<RESPUESTACONFIGURACION.MODALIDADES.MODALIDAD.GARANTIAS.GARANTIA.CAPITAL> capital;
                    @XmlAttribute(name = "nombre")
                    protected String nombre;
                    @XmlAttribute(name = "codigoGarantia")
                    protected Byte codigoGarantia;

                    /**
                     * Gets the value of the capital property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the capital property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getCAPITAL().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link RESPUESTACONFIGURACION.MODALIDADES.MODALIDAD.GARANTIAS.GARANTIA.CAPITAL }
                     * 
                     * 
                     */
                    public List<RESPUESTACONFIGURACION.MODALIDADES.MODALIDAD.GARANTIAS.GARANTIA.CAPITAL> getCAPITAL() {
                        if (capital == null) {
                            capital = new ArrayList<RESPUESTACONFIGURACION.MODALIDADES.MODALIDAD.GARANTIAS.GARANTIA.CAPITAL>();
                        }
                        return this.capital;
                    }

                    /**
                     * Obtiene el valor de la propiedad nombre.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNombre() {
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
                    public void setNombre(String value) {
                        this.nombre = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad codigoGarantia.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Byte }
                     *     
                     */
                    public Byte getCodigoGarantia() {
                        return codigoGarantia;
                    }

                    /**
                     * Define el valor de la propiedad codigoGarantia.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Byte }
                     *     
                     */
                    public void setCodigoGarantia(Byte value) {
                        this.codigoGarantia = value;
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
                     *       &lt;attribute name="nombre" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
                     *       &lt;attribute name="codigoCapital" type="{http://www.w3.org/2001/XMLSchema}byte" /&gt;
                     *       &lt;attribute name="codigoDestino" type="{http://www.w3.org/2001/XMLSchema}byte" /&gt;
                     *       &lt;attribute name="codigoDuracion" type="{http://www.w3.org/2001/XMLSchema}byte" /&gt;
                     *       &lt;attribute name="precio" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
                     *       &lt;attribute name="precioCoste" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
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
                    public static class CAPITAL {

                        @XmlValue
                        protected String value;
                        @XmlAttribute(name = "nombre")
                        protected Integer nombre;
                        @XmlAttribute(name = "codigoCapital")
                        protected Byte codigoCapital;
                        @XmlAttribute(name = "codigoDestino")
                        protected Byte codigoDestino;
                        @XmlAttribute(name = "codigoDuracion")
                        protected Byte codigoDuracion;
                        @XmlAttribute(name = "precio")
                        protected Float precio;
                        @XmlAttribute(name = "precioCoste")
                        protected Float precioCoste;

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
                         * Obtiene el valor de la propiedad nombre.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Integer }
                         *     
                         */
                        public Integer getNombre() {
                            return nombre;
                        }

                        /**
                         * Define el valor de la propiedad nombre.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Integer }
                         *     
                         */
                        public void setNombre(Integer value) {
                            this.nombre = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad codigoCapital.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Byte }
                         *     
                         */
                        public Byte getCodigoCapital() {
                            return codigoCapital;
                        }

                        /**
                         * Define el valor de la propiedad codigoCapital.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Byte }
                         *     
                         */
                        public void setCodigoCapital(Byte value) {
                            this.codigoCapital = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad codigoDestino.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Byte }
                         *     
                         */
                        public Byte getCodigoDestino() {
                            return codigoDestino;
                        }

                        /**
                         * Define el valor de la propiedad codigoDestino.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Byte }
                         *     
                         */
                        public void setCodigoDestino(Byte value) {
                            this.codigoDestino = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad codigoDuracion.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Byte }
                         *     
                         */
                        public Byte getCodigoDuracion() {
                            return codigoDuracion;
                        }

                        /**
                         * Define el valor de la propiedad codigoDuracion.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Byte }
                         *     
                         */
                        public void setCodigoDuracion(Byte value) {
                            this.codigoDuracion = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad precio.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Float }
                         *     
                         */
                        public Float getPrecio() {
                            return precio;
                        }

                        /**
                         * Define el valor de la propiedad precio.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Float }
                         *     
                         */
                        public void setPrecio(Float value) {
                            this.precio = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad precioCoste.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Float }
                         *     
                         */
                        public Float getPrecioCoste() {
                            return precioCoste;
                        }

                        /**
                         * Define el valor de la propiedad precioCoste.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Float }
                         *     
                         */
                        public void setPrecioCoste(Float value) {
                            this.precioCoste = value;
                        }

                    }

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
     *         &lt;element name="TRAMITADOR" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                 &lt;attribute name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="codigo" type="{http://www.w3.org/2001/XMLSchema}short" /&gt;
     *                 &lt;attribute name="nif" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
        "tramitador"
    })
    public static class TRAMITADORES {

        @XmlElement(name = "TRAMITADOR")
        protected List<RESPUESTACONFIGURACION.TRAMITADORES.TRAMITADOR> tramitador;

        /**
         * Gets the value of the tramitador property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the tramitador property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTRAMITADOR().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RESPUESTACONFIGURACION.TRAMITADORES.TRAMITADOR }
         * 
         * 
         */
        public List<RESPUESTACONFIGURACION.TRAMITADORES.TRAMITADOR> getTRAMITADOR() {
            if (tramitador == null) {
                tramitador = new ArrayList<RESPUESTACONFIGURACION.TRAMITADORES.TRAMITADOR>();
            }
            return this.tramitador;
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
         *       &lt;attribute name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="codigo" type="{http://www.w3.org/2001/XMLSchema}short" /&gt;
         *       &lt;attribute name="nif" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
        public static class TRAMITADOR {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "nombre")
            protected String nombre;
            @XmlAttribute(name = "codigo")
            protected Short codigo;
            @XmlAttribute(name = "nif")
            protected String nif;

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
             * Obtiene el valor de la propiedad nombre.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNombre() {
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
            public void setNombre(String value) {
                this.nombre = value;
            }

            /**
             * Obtiene el valor de la propiedad codigo.
             * 
             * @return
             *     possible object is
             *     {@link Short }
             *     
             */
            public Short getCodigo() {
                return codigo;
            }

            /**
             * Define el valor de la propiedad codigo.
             * 
             * @param value
             *     allowed object is
             *     {@link Short }
             *     
             */
            public void setCodigo(Short value) {
                this.codigo = value;
            }

            /**
             * Obtiene el valor de la propiedad nif.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNif() {
                return nif;
            }

            /**
             * Define el valor de la propiedad nif.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNif(String value) {
                this.nif = value;
            }

        }

    }

}
