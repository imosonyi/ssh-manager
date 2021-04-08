package hu.imosonyi.sshmanager.manager.connection;

import hu.imosonyi.sshmanager.store.portforwarding.PortForwardingService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

@Service
public class ConnectionManager {

    private final PortForwardingService portForwardingService;
    private final ConnectionMapper connectionMapper;

    public ConnectionManager(PortForwardingService portForwardingService, ConnectionMapper connectionMapper) {
        this.portForwardingService = portForwardingService;
        this.connectionMapper = connectionMapper;
    }

    public List<Connection> findAll() {
        return portForwardingService.findAll().stream().map(connectionMapper::fromPortForwarding).collect(Collectors.toList());
    }

    public CompletableFuture<Connection> connect(Long id) {
        return null;
    }

    public CompletableFuture<Connection> disconnect(Long id) {
        return null;
    }

}
