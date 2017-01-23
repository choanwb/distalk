import org.springframework.jms.connection.CachingConnectionFactory
import progress.message.jclient.ConnectionFactory

// Place your Spring DSL code here
beans = {
    jmsConnectionFactory(CachingConnectionFactory) {
        targetConnectionFactory = { ConnectionFactory cf ->
            brokerURL = grailsApplication.config.getProperty("jms.broker")
            defaultUser = grailsApplication.config.getProperty("jms.user")
            defaultPassword = grailsApplication.config.getProperty("jms.passwd")
        }
    }
}
