println "Reading LOC distalk-config(${grails.util.Environment.current})"

grails {
    serverURL = "http://localhost:8080/distalk/"
}

disel {
    requestQueue = "anwb.hv.binnenland.dispatch.callQueue.Chi"
    responseQueue = "anwb.hv.binnenland.obicall.callbrokerQueue.Chi"
    timeout = 10
    proces = "DEV_CHI"
}

logicx {
    destination = "anwb.hv.binnenland.dispatch.disToLogicxQueue"
}

jms {
    broker = "tcp://dhglx1003:2523"
    user = "DISPATCH_USER"
    passwd = "DISPATCH_PWD"
}

schemavalidation = "{{SCHEMA_VALIDATION}}"

lavasimulator = "true"

lavasim {
    url = "http://localhost:8080/distalk/disservices/lavasimulator"
    tns = "http://distalk.hv.anwb.nl/"
}

//naam waaronder de services beschikbaar zijn
cxf {
    servlet {
        mapping = "/disservices/*"
    }
}

logging {
    config = "grails-app/conf/logback.groovy"
}