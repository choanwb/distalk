
package org.anwb.hv.ict.oxi.obi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Klant complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Klant"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="naam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="voorletters" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tussenvoegsel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="achternaam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="adres" type="{http://anwb.org/hv/ict/oxi/obi}Adres" minOccurs="0"/&gt;
 *         &lt;element name="postcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lidsoort" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="productcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contract" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="type_contract" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="naam_contract" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="maatschappij_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contract_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contract_versie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rechten" type="{http://anwb.org/hv/ict/oxi/obi}Rechten" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *       &lt;attribute name="typeKlant" type="{http://anwb.org/hv/ict/oxi/obi}TypeKlant" /&gt;
 *       &lt;attribute name="lidnummer" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Klant", propOrder = {

})
public class Klant {

    protected String naam;
    protected String voorletters;
    protected String tussenvoegsel;
    protected String achternaam;
    protected Adres adres;
    protected String postcode;
    protected String lidsoort;
    protected String productcode;
    protected Boolean contract;
    @XmlElement(name = "type_contract")
    protected Integer typeContract;
    @XmlElement(name = "naam_contract")
    protected String naamContract;
    @XmlElement(name = "maatschappij_code")
    protected String maatschappijCode;
    @XmlElement(name = "contract_id")
    protected String contractId;
    @XmlElement(name = "contract_versie")
    protected String contractVersie;
    protected Rechten rechten;
    @XmlAttribute(name = "typeKlant")
    protected TypeKlant typeKlant;
    @XmlAttribute(name = "lidnummer", required = true)
    protected int lidnummer;

    /**
     * Gets the value of the naam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNaam() {
        return naam;
    }

    /**
     * Sets the value of the naam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNaam(String value) {
        this.naam = value;
    }

    /**
     * Gets the value of the voorletters property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoorletters() {
        return voorletters;
    }

    /**
     * Sets the value of the voorletters property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoorletters(String value) {
        this.voorletters = value;
    }

    /**
     * Gets the value of the tussenvoegsel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTussenvoegsel() {
        return tussenvoegsel;
    }

    /**
     * Sets the value of the tussenvoegsel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTussenvoegsel(String value) {
        this.tussenvoegsel = value;
    }

    /**
     * Gets the value of the achternaam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAchternaam() {
        return achternaam;
    }

    /**
     * Sets the value of the achternaam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAchternaam(String value) {
        this.achternaam = value;
    }

    /**
     * Gets the value of the adres property.
     * 
     * @return
     *     possible object is
     *     {@link Adres }
     *     
     */
    public Adres getAdres() {
        return adres;
    }

    /**
     * Sets the value of the adres property.
     * 
     * @param value
     *     allowed object is
     *     {@link Adres }
     *     
     */
    public void setAdres(Adres value) {
        this.adres = value;
    }

    /**
     * Gets the value of the postcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     * Sets the value of the postcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostcode(String value) {
        this.postcode = value;
    }

    /**
     * Gets the value of the lidsoort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLidsoort() {
        return lidsoort;
    }

    /**
     * Sets the value of the lidsoort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLidsoort(String value) {
        this.lidsoort = value;
    }

    /**
     * Gets the value of the productcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductcode() {
        return productcode;
    }

    /**
     * Sets the value of the productcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductcode(String value) {
        this.productcode = value;
    }

    /**
     * Gets the value of the contract property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isContract() {
        return contract;
    }

    /**
     * Sets the value of the contract property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContract(Boolean value) {
        this.contract = value;
    }

    /**
     * Gets the value of the typeContract property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTypeContract() {
        return typeContract;
    }

    /**
     * Sets the value of the typeContract property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTypeContract(Integer value) {
        this.typeContract = value;
    }

    /**
     * Gets the value of the naamContract property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNaamContract() {
        return naamContract;
    }

    /**
     * Sets the value of the naamContract property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNaamContract(String value) {
        this.naamContract = value;
    }

    /**
     * Gets the value of the maatschappijCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaatschappijCode() {
        return maatschappijCode;
    }

    /**
     * Sets the value of the maatschappijCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaatschappijCode(String value) {
        this.maatschappijCode = value;
    }

    /**
     * Gets the value of the contractId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractId() {
        return contractId;
    }

    /**
     * Sets the value of the contractId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractId(String value) {
        this.contractId = value;
    }

    /**
     * Gets the value of the contractVersie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractVersie() {
        return contractVersie;
    }

    /**
     * Sets the value of the contractVersie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractVersie(String value) {
        this.contractVersie = value;
    }

    /**
     * Gets the value of the rechten property.
     * 
     * @return
     *     possible object is
     *     {@link Rechten }
     *     
     */
    public Rechten getRechten() {
        return rechten;
    }

    /**
     * Sets the value of the rechten property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rechten }
     *     
     */
    public void setRechten(Rechten value) {
        this.rechten = value;
    }

    /**
     * Gets the value of the typeKlant property.
     * 
     * @return
     *     possible object is
     *     {@link TypeKlant }
     *     
     */
    public TypeKlant getTypeKlant() {
        return typeKlant;
    }

    /**
     * Sets the value of the typeKlant property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeKlant }
     *     
     */
    public void setTypeKlant(TypeKlant value) {
        this.typeKlant = value;
    }

    /**
     * Gets the value of the lidnummer property.
     * 
     */
    public int getLidnummer() {
        return lidnummer;
    }

    /**
     * Sets the value of the lidnummer property.
     * 
     */
    public void setLidnummer(int value) {
        this.lidnummer = value;
    }

}
