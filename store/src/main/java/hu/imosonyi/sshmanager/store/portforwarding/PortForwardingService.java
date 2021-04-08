package hu.imosonyi.sshmanager.store.portforwarding;

import hu.imosonyi.sshmanager.store.portforwarding.configuration.CommonConfiguration;
import hu.imosonyi.sshmanager.store.portforwarding.configuration.SecurityConfiguration;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
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

    @PostConstruct
    public void setupDummyData() {
        CommonConfiguration cc = new CommonConfiguration();
        cc.setAutoStart(true);
        cc.setKeepAlive(true);
        cc.setLocalNetworkAdapter("0000");

        SecurityConfiguration sc = new SecurityConfiguration();
        sc.setPassphrase(null);
        sc.setStoreCredentials(false);
        sc.setSshKey("minubyvt");

        DynamicPortForwarding dpf = new DynamicPortForwarding();
        dpf.setForwardedPort(1234);
        dpf.setSshPort(1234);
        dpf.setSshLogin("asdf");
        dpf.setSshServer("qwer");
        dpf.setName("Hello World!");
        dpf.setCommonConfiguration(cc);
        dpf.setSecurityConfiguration(sc);

        portForwardingRepository.save(dpf);
    }

}
