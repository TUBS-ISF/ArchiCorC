//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// ?nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.02.11 um 10:27:32 AM CET 
//


package de.tu_bs.ccc.contracting.core.io.ccc;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f?r RequiresType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RequiresType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="service" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{}ServiceTrafficType">
 *                 &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="label" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="ref" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="filter" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="function" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="rte" type="{}NameType" minOccurs="0"/>
 *         &lt;element name="spec" type="{}NameType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ram" type="{}QuantumType" minOccurs="0"/>
 *         &lt;element name="caps" type="{}QuantumType" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequiresType", propOrder = {
    "serviceOrRteOrSpec"
})
public class RequiresType {

    @XmlElementRefs({
        @XmlElementRef(name = "service", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "rte", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "spec", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ram", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "caps", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> serviceOrRteOrSpec;

    /**
     * Gets the value of the serviceOrRteOrSpec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceOrRteOrSpec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceOrRteOrSpec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link NameType }{@code >}
     * {@link JAXBElement }{@code <}{@link NameType }{@code >}
     * {@link JAXBElement }{@code <}{@link QuantumType }{@code >}
     * {@link JAXBElement }{@code <}{@link RequiresType.Service }{@code >}
     * {@link JAXBElement }{@code <}{@link QuantumType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getServiceOrRteOrSpec() {
        if (serviceOrRteOrSpec == null) {
            serviceOrRteOrSpec = new ArrayList<JAXBElement<?>>();
        }
        return this.serviceOrRteOrSpec;
    }


    /**
     * <p>Java-Klasse f?r anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{}ServiceTrafficType">
     *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="label" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ref" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="filter" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="function" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Service
        extends ServiceTrafficType
    {

        @XmlAttribute(name = "name", required = true)
        protected String name;
        @XmlAttribute(name = "label")
        protected String label;
        @XmlAttribute(name = "ref")
        protected String ref;
        @XmlAttribute(name = "filter")
        protected String filter;
        @XmlAttribute(name = "function")
        protected String function;

        /**
         * Ruft den Wert der name-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Legt den Wert der name-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Ruft den Wert der label-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLabel() {
            return label;
        }

        /**
         * Legt den Wert der label-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLabel(String value) {
            this.label = value;
        }

        /**
         * Ruft den Wert der ref-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRef() {
            return ref;
        }

        /**
         * Legt den Wert der ref-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRef(String value) {
            this.ref = value;
        }

        /**
         * Ruft den Wert der filter-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFilter() {
            return filter;
        }

        /**
         * Legt den Wert der filter-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFilter(String value) {
            this.filter = value;
        }

        /**
         * Ruft den Wert der function-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFunction() {
            return function;
        }

        /**
         * Legt den Wert der function-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFunction(String value) {
            this.function = value;
        }

    }

}
