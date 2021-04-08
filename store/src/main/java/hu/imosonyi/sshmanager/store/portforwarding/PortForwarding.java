package hu.imosonyi.sshmanager.store.portforwarding;

import hu.imosonyi.sshmanager.store.portforwarding.configuration.CommonConfiguration;
import hu.imosonyi.sshmanager.store.portforwarding.configuration.SecurityConfiguration;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Field;

public abstract class PortForwarding {

    @Id
    @Field("ID")
    protected String id;
    @Field("NAME")
    protected String name;
    @DBRef
    private CommonConfiguration commonConfiguration;
    @DBRef
    private SecurityConfiguration securityConfiguration;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CommonConfiguration getCommonConfiguration() {
        return commonConfiguration;
    }

    public void setCommonConfiguration(CommonConfiguration commonConfiguration) {
        this.commonConfiguration = commonConfiguration;
    }

    public SecurityConfiguration getSecurityConfiguration() {
        return securityConfiguration;
    }

    public void setSecurityConfiguration(SecurityConfiguration securityConfiguration) {
        this.securityConfiguration = securityConfiguration;
    }

    @Override
    public String toString() {
        return "Connection{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

}
