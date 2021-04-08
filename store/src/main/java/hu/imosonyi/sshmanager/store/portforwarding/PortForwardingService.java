package hu.imosonyi.sshmanager.store.portforwarding;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PortForwardingService {

    private final PortForwardingRepository portForwardingRepository;

    public PortForwardingService(PortForwardingRepository portForwardingRepository) {
        this.portForwardingRepository = portForwardingRepository;
    }

    public List<PortForwarding> findAll() {
        return portForwardingRepository.findAll();
    }

    public PortForwarding save(PortForwarding portForwarding) {
        return portForwardingRepository.save(portForwarding);
    }

}
