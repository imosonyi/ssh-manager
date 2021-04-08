package hu.imosonyi.sshmanager.store.portforwarding;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

public abstract class PortForwarding {

    @Id
    @Field("ID")
    protected String id;

    @Field("NAME")
    protected String name;

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

    @Override
    public String toString() {
        return "Connection{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

}
