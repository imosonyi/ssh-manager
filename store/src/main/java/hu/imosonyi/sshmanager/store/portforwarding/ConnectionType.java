package hu.imosonyi.sshmanager.store.portforwarding;

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
