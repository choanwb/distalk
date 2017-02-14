import grails.plugins.config.util.ConfigSlurperUtil

println "PROCESSING application.groovy"

// region External configuration

def CONFIG_DIR
if (System.properties.get('config.dir')) {
    CONFIG_DIR = "${System.properties.get('config.dir')}"
}
else {
    CONFIG_DIR = "conf/LOC"
}
println "CONFIG_DIR='${CONFIG_DIR}'"

def USER_HOME = System.properties.get('user.home')
def HOST_NAME = InetAddress.localHost.hostName.toLowerCase()

/**
 * This reads a properties file resource and binds it contents into
 * grailsApplication.config.
 * After this, say, a property app.name from gradle.properties is available as
 * grailsApplication.config.gradle.app.name in controllers and views.
 * This requires that the property files have been copied into
 * build/resources/main by build.gradle.
 */
gradle = ConfigSlurperUtil.slurpPropertiesResource(getClass().classLoader, "gradle.properties")
jenkins = ConfigSlurperUtil.slurpPropertiesResource(getClass().classLoader, "jenkins.properties")

println "HOST_NAME='${HOST_NAME}'"
println "appName='${appName}'"
grails.config.locations = [
        "file:${CONFIG_DIR}/${gradle.app.name}-config.groovy",
        "file:${CONFIG_DIR}/${HOST_NAME}/${gradle.app.name}-config.groovy",
        "file:${USER_HOME}/.grails/${gradle.app.name}-config.groovy"
]

logging.config = "${CONFIG_DIR}/logback.groovy"

// endregion

grails {
    profile = "web"
    codegen {
        defaultPackage = "nl.anwb.hv.distalk"
    }
}

spring {
    groovy {
        template['check-template-location'] = false
    }
}

server {
    port = 8080
    contextPath = '/distalk'
}

endpoints {
    jmx['unique-names'] = true
}

