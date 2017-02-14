package distalk

import grails.boot.GrailsApp
import grails.boot.config.GrailsAutoConfiguration
import grails.plugins.config.util.ConfigurationLoader
import org.springframework.context.EnvironmentAware
import org.springframework.core.env.Environment

class Application extends GrailsAutoConfiguration implements EnvironmentAware {
    static void main(String[] args) {
        GrailsApp.run(Application, args)
    }

    @Override
    void setEnvironment(Environment env) {
        new ConfigurationLoader(this, env).load()
    }
}