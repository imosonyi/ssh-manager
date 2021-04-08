package hu.imosonyi.sshmanager.manager.connection;

import hu.imosonyi.sshmanager.store.portforwarding.DynamicPortForwarding;
import hu.imosonyi.sshmanager.store.portforwarding.LocalPortForwarding;
import hu.imosonyi.sshmanager.store.portforwarding.PortForwarding;
import hu.imosonyi.sshmanager.store.portforwarding.RemotePortForwarding;

import static java.util.stream.Stream.of;

public enum ConnectionType {

    LOCAL(LocalPortForwarding.class),
    REMOTE(RemotePortForwarding.class),
    DYNAMIC(DynamicPortForwarding.class);

    private final Class<? extends PortForwarding> connectionClass;

    ConnectionType(Class<? extends PortForwarding> connectionClass) {
        this.connectionClass = connectionClass;
    }

    public static ConnectionType fromClass(Class<? extends PortForwarding> connectionClass) {
        return of(values()).filter(connectionType -> connectionType.connectionClass.equals(connectionClass)).findAny().orElseThrow();
    }

}
