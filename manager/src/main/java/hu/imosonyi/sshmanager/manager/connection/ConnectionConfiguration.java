package hu.imosonyi.sshmanager.manager.connection;

import hu.imosonyi.sshmanager.store.portforwarding.PortForwardingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static hu.imosonyi.sshmanager.manager.connection.ConnectionMapper.CONNECTION_MAPPER;

@Configuration
public class ConnectionConfiguration {

    private final PortForwardingService portForwardingService;

    public ConnectionConfiguration(PortForwardingService portForwardingService) {
        this.portForwardingService = portForwardingService;
    }

    @Bean
    public ConnectionManager connectionManager() {
        return new ConnectionManager(portForwardingService, CONNECTION_MAPPER);
    }

}
