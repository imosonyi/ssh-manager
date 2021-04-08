package hu.imosonyi.sshmanager.store.portforwarding;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PortForwardingRepository extends MongoRepository<PortForwarding, String> {
}
