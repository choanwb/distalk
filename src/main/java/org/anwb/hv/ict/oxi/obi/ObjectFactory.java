
package org.anwb.hv.ict.oxi.obi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.anwb.hv.ict.oxi.obi package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ResultaatBericht_QNAME = new QName("http://anwb.org/hv/ict/oxi/obi", "resultaatBericht");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.anwb.hv.ict.oxi.obi
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ResultaatType }
     * 
     */
    public ResultaatType createResultaatType() {
        return new ResultaatType();
    }

    /**
     * Create an instance of {@link LocatieIndicatie }
     * 
     */
    public LocatieIndicatie createLocatieIndicatie() {
        return new LocatieIndicatie();
    }

    /**
     * Create an instance of {@link Klant }
     * 
     */
    public Klant createKlant() {
        return new Klant();
    }

    /**
     * Create an instance of {@link JournaalAantekening }
     * 
     */
    public JournaalAantekening createJournaalAantekening() {
        return new JournaalAantekening();
    }

    /**
     * Create an instance of {@link Voertuig }
     * 
     */
    public Voertuig createVoertuig() {
        return new Voertuig();
    }

    /**
     * Create an instance of {@link Rechten }
     * 
     */
    public Rechten createRechten() {
        return new Rechten();
    }

    /**
     * Create an instance of {@link Melder }
     * 
     */
    public Melder createMelder() {
        return new Melder();
    }

    /**
     * Create an instance of {@link Opdracht }
     * 
     */
    public Opdracht createOpdracht() {
        return new Opdracht();
    }

    /**
     * Create an instance of {@link Locatie }
     * 
     */
    public Locatie createLocatie() {
        return new Locatie();
    }

    /**
     * Create an instance of {@link Kruising }
     * 
     */
    public Kruising createKruising() {
        return new Kruising();
    }

    /**
     * Create an instance of {@link Hectometerpaal }
     * 
     */
    public Hectometerpaal createHectometerpaal() {
        return new Hectometerpaal();
    }

    /**
     * Create an instance of {@link Adres }
     * 
     */
    public Adres createAdres() {
        return new Adres();
    }

    /**
     * Create an instance of {@link PostcodeHuisnummer }
     * 
     */
    public PostcodeHuisnummer createPostcodeHuisnummer() {
        return new PostcodeHuisnummer();
    }

    /**
     * Create an instance of {@link Markering }
     * 
     */
    public Markering createMarkering() {
        return new Markering();
    }

    /**
     * Create an instance of {@link Praatpaal }
     * 
     */
    public Praatpaal createPraatpaal() {
        return new Praatpaal();
    }

    /**
     * Create an instance of {@link Huisnummer }
     * 
     */
    public Huisnummer createHuisnummer() {
        return new Huisnummer();
    }

    /**
     * Create an instance of {@link Locatiemelding }
     * 
     */
    public Locatiemelding createLocatiemelding() {
        return new Locatiemelding();
    }

    /**
     * Create an instance of {@link LocatieMeldingViaPraatpaal }
     * 
     */
    public LocatieMeldingViaPraatpaal createLocatieMeldingViaPraatpaal() {
        return new LocatieMeldingViaPraatpaal();
    }

    /**
     * Create an instance of {@link Wegenwacht }
     * 
     */
    public Wegenwacht createWegenwacht() {
        return new Wegenwacht();
    }

    /**
     * Create an instance of {@link Foutmelding }
     * 
     */
    public Foutmelding createFoutmelding() {
        return new Foutmelding();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResultaatType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://anwb.org/hv/ict/oxi/obi", name = "resultaatBericht")
    public JAXBElement<ResultaatType> createResultaatBericht(ResultaatType value) {
        return new JAXBElement<ResultaatType>(_ResultaatBericht_QNAME, ResultaatType.class, null, value);
    }

}
