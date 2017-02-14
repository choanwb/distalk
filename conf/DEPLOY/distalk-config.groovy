println "Reading {{DISTALK_ENV}} distalk-config"

grails {
    serverURL = "{{DISTALK_SERVER_URL}}"
}

disel {
    requestQueue = "{{DISEL_CALL_Q}}"
    responseQueue = "{{DISEL_CALLBROKER_Q}}"
    timeout = 10
    proces = "{{PROCES_ID}}"
}

logicx {
    destination = "{{LOGICX_DESTINATION_Q}}"
}

jms {
    broker = "{{BROKER_URL}}"
    user = "{{JMS_USER}}"
    passwd = "{{JMS_PW}}"
}

schemavalidation = "{{SCHEMA_VALIDATION}}"

lavasimulator = "{{LAVA_SIM_ENABLED}}"

lavasim {
    url = "{{LAVA_SIM_URL}}"
    tns = "{{LAVA_SIM_TNS}}"
}

//naam waaronder de services beschikbaar zijn
cxf {
    servlet {
        mapping = "{{SERVICE_MAPPING}}"
    }
}

logging {
    config = "{{LOG_URL}}"
        }