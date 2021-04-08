package hu.imosonyi.sshmanager.store.portforwarding;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("PORT_FORWARDING")
public class DynamicPortForwarding extends PortForwarding {

    @Field("FORWARDED_PORT")
    private Integer forwardedPort;
    @Field("SSH_SERVER")
    private String sshServer;
    @Field("SSH_LOGIN")
    private String sshLogin;
    @Field("SSH_PORT")
    private Integer sshPort;

    public Integer getForwardedPort() {
        return forwardedPort;
    }

    public void setForwardedPort(Integer forwardedPort) {
        this.forwardedPort = forwardedPort;
    }

    public String getSshServer() {
        return sshServer;
    }

    public void setSshServer(String sshServer) {
        this.sshServer = sshServer;
    }

    public String getSshLogin() {
        return sshLogin;
    }

    public void setSshLogin(String sshLogin) {
        this.sshLogin = sshLogin;
    }

    public Integer getSshPort() {
        return sshPort;
    }

    public void setSshPort(Integer sshPort) {
        this.sshPort = sshPort;
    }

    @Override
    public String toString() {
        return "DynamicPortForwarding{" +
                "forwardedPort=" + forwardedPort +
                ", sshServer='" + sshServer + '\'' +
                ", sshLogin='" + sshLogin + '\'' +
                ", sshPort=" + sshPort +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

}
