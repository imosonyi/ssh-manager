package hu.imosonyi.sshmanager.manager.connection;

import hu.imosonyi.sshmanager.store.portforwarding.PortForwarding;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(imports = {
        ConnectionType.class
})
public interface ConnectionMapper {

    ConnectionMapper CONNECTION_MAPPER = Mappers.getMapper(ConnectionMapper.class);

    @Mapping(target = "type", expression = "java( ConnectionType.fromClass(portForwarding.getClass()) )")
    @Mapping(target = "passphraseRequired", source = "securityConfiguration.storeCredentials")
    Connection fromPortForwarding(PortForwarding portForwarding);

}
