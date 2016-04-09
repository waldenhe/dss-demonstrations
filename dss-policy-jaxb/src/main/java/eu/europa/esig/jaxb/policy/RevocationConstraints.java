//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.04.09 at 04:39:14 PM CEST 
//


package eu.europa.esig.jaxb.policy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RevocationConstraints complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RevocationConstraints">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dss.esig.europa.eu/validation/policy}LevelConstraint">
 *       &lt;sequence>
 *         &lt;element name="RevocationFreshness" type="{http://dss.esig.europa.eu/validation/policy}TimeConstraint" minOccurs="0"/>
 *         &lt;element name="BasicSignatureConstraints" type="{http://dss.esig.europa.eu/validation/policy}BasicSignatureConstraints" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RevocationConstraints", propOrder = {
    "revocationFreshness",
    "basicSignatureConstraints"
})
public class RevocationConstraints
    extends LevelConstraint
{

    @XmlElement(name = "RevocationFreshness")
    protected TimeConstraint revocationFreshness;
    @XmlElement(name = "BasicSignatureConstraints")
    protected BasicSignatureConstraints basicSignatureConstraints;

    /**
     * Gets the value of the revocationFreshness property.
     * 
     * @return
     *     possible object is
     *     {@link TimeConstraint }
     *     
     */
    public TimeConstraint getRevocationFreshness() {
        return revocationFreshness;
    }

    /**
     * Sets the value of the revocationFreshness property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeConstraint }
     *     
     */
    public void setRevocationFreshness(TimeConstraint value) {
        this.revocationFreshness = value;
    }

    /**
     * Gets the value of the basicSignatureConstraints property.
     * 
     * @return
     *     possible object is
     *     {@link BasicSignatureConstraints }
     *     
     */
    public BasicSignatureConstraints getBasicSignatureConstraints() {
        return basicSignatureConstraints;
    }

    /**
     * Sets the value of the basicSignatureConstraints property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicSignatureConstraints }
     *     
     */
    public void setBasicSignatureConstraints(BasicSignatureConstraints value) {
        this.basicSignatureConstraints = value;
    }

}
