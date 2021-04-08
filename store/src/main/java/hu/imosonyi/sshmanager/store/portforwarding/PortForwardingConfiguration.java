package hu.imosonyi.sshmanager.store.portforwarding;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories
public class PortForwardingConfiguration {

    private final PortForwardingRepository portForwardingRepository;

    public PortForwardingConfiguration(PortForwardingRepository portForwardingRepository) {
        this.portForwardingRepository = portForwardingRepository;
    }

    @Bean
    public PortForwardingService portForwardingService() {
        return new PortForwardingService(portForwardingRepository);
    }

}
