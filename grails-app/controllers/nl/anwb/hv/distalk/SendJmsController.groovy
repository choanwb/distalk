package nl.anwb.hv.distalk

import org.anwb.hv.ict.oxi.disinc.AanmeldenIncidentMessage

class SendJmsController {
    def disJmsService

    def index() {
        """<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
            <ns13:aanmeldenIncidentMessage xmlns="http://www.siebel.com/xml/ZAMA%20Flow%20integratie-v4" xmlns:ns2="http://anwb.org/hv/ict/oxi/hvenabler" xmlns:ns4="http://anwb.org/hv/ict/oxi/ciaclnt" xmlns:ns3="http://anwb.org/hv/ict/oxi/wegtekst" xmlns:ns6="http://anwb.nl/ict/rcs" xmlns:ns5="http://anwb.org/hv/documentservices/oxi" xmlns:ns8="http://anwb.org/hv/voertuig/oxi" xmlns:ns7="http://anwb.org/hv/ict/oxi/geo" xmlns:ns13="http://anwb.org/hv/ict/oxi/disinc" xmlns:ns9="http://anwb.org/hv/ict/oxi/obi" xmlns:ns12="http://anwb.org/hv/ict/oxi/callinc" xmlns:ns11="http://anwb.org/hv/documentserviceszama/oxi" xmlns:ns10="http://anwb.org/hv/ict/oxi/callaanvr">
                <ns13:incident nummer="5104714">
                    <ns13:volgnummer>5</ns13:volgnummer>
                    <ns13:LBIClassificatie>0</ns13:LBIClassificatie>
                    <ns13:tijdstipMelding>2017-01-20T12:34:45.844+01:00</ns13:tijdstipMelding>
                    <ns13:type>Pechgeval</ns13:type>
                    <ns13:storingscode>Bijgeluiden</ns13:storingscode>
                    <ns13:locatie x="82556" y="456955">
                        <ns13:wegtype>Locale Weg</ns13:wegtype>
                        <ns13:adres>
                            <ns13:plaats>'S-GRAVENHAGE</ns13:plaats>
                            <ns13:straat>WASSENAARSEWEG</ns13:straat>
                            <ns13:huisnummer>220</ns13:huisnummer>
                        </ns13:adres>
                        <ns13:gevaarlijkeLocatie>false</ns13:gevaarlijkeLocatie>
                    </ns13:locatie>
                    <ns13:sleutelOpdracht actienummer="2017"/>
                    <ns13:voertuig>
                        <ns9:merk>Kia</ns9:merk>
                        <ns9:type>SPORTAGE</ns9:type>
                        <ns9:soort>Personenauto</ns9:soort>
                        <ns9:brandstof>Benzine</ns9:brandstof>
                        <ns9:kenteken>1SHN98</ns9:kenteken>
                        <ns9:kleur>Zwart</ns9:kleur>
                        <ns9:nationaliteit>NL</ns9:nationaliteit>
                        <ns9:chassisnummer>U5YPC814ADL302100</ns9:chassisnummer>
                        <ns9:controlerechten>false</ns9:controlerechten>
                        <ns9:afgiftekenteken>2013-10-06T00:00:00+02:00</ns9:afgiftekenteken>
                    </ns13:voertuig>
                    <ns13:journaalAantekening>false</ns13:journaalAantekening>
                   <ns13:kritischeJournaalaantekening>false</ns13:kritischeJournaalaantekening>
                    <ns13:pechhistorie>false</ns13:pechhistorie>
                    <ns13:aantalGewonden>0</ns13:aantalGewonden>
                    <ns13:parkeergarage>false</ns13:parkeergarage>
                    <ns13:verkeersgevaarlijk>false</ns13:verkeersgevaarlijk>
                    <ns13:gevaarlijkeStoffen>false</ns13:gevaarlijkeStoffen>
                    <ns13:voorrangsclassificatie2>false</ns13:voorrangsclassificatie2>
                    <ns13:rijbaanGeblokkeerd>false</ns13:rijbaanGeblokkeerd>
                    <ns13:melder>
                        <ns9:naam>de hair</ns9:naam>
                        <ns9:telefoonnummer>+31620609086</ns9:telefoonnummer>
                        <ns9:geslacht>M</ns9:geslacht>
                    </ns13:melder>
                    <ns13:planningsmethode>Handmatig</ns13:planningsmethode>
                    <ns13:klanten>
                        <ns13:klant typeKlant="RECHTGEVEND" lidnummer="0">
                            <ns9:naam>de hair</ns9:naam>
                            <ns9:achternaam>de hair</ns9:achternaam>
                            <ns9:adres>
                                <ns9:plaats>NOOTDORP</ns9:plaats>
                                <ns9:straat>MAAGDENPALM</ns9:straat>
                                <ns9:huisnummer>
                                    <ns9:nummer>12</ns9:nummer>
                                </ns9:huisnummer>
                            </ns9:adres>
                            <ns9:postcode>2631TW</ns9:postcode>
                            <ns9:lidsoort>Pech</ns9:lidsoort>
                            <ns9:contract>true</ns9:contract>
                            <ns9:type_contract>1</ns9:type_contract>
                            <ns9:naam_contract>Arval Assistance Module 0 Primaire HV (OHV-E)</ns9:naam_contract>
                            <ns9:maatschappij_code>ARVA</ns9:maatschappij_code>
                            <ns9:contract_id>512607273</ns9:contract_id>
                            <ns9:contract_versie>1</ns9:contract_versie>
                            <ns9:rechten>
                                <ns9:betaald>true</ns9:betaald>
                                <ns9:wps>1</ns9:wps>
                                <ns9:sleep>1</ns9:sleep>
                                <ns9:vas>1</ns9:vas>
                                <ns9:krediet>false</ns9:krediet>
                                <ns9:hulpverlening>1</ns9:hulpverlening>
                                <ns9:kenteken>1</ns9:kenteken>
                                <ns9:asmToegestaan>false</ns9:asmToegestaan>
                            </ns9:rechten>
                        </ns13:klant>
                    </ns13:klanten>
                </ns13:incident>
            </ns13:aanmeldenIncidentMessage>"""
        disJmsService.sendJmsMessage(new AanmeldenIncidentMessage(), grailsApplication.config.getProperty("disel.requestQueue"))
        redirect(uri:'/')
    }

    def receiveMessage() {
        disJmsService.receiveJmsMessage("anwb.hv.binnenland.dispatch.disToLogicxQueue.Chi")
        redirect(uri:'/')
    }
}
