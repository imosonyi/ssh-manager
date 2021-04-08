package hu.imosonyi.sshmanager.store.portforwarding;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("PORT_FORWARDING")
public class LocalPortForwarding extends PortForwarding {

    @Field("FORWARDED_PORT")
    private Integer forwardedPort;
    @Field("REMOTE_SERVER")
    private String remoteServer;
    @Field("REMOTE_PORT")
    private Integer remotePort;
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

    public String getRemoteServer() {
        return remoteServer;
    }

    public void setRemoteServer(String remoteServer) {
        this.remoteServer = remoteServer;
    }

    public Integer getRemotePort() {
        return remotePort;
    }

    public void setRemotePort(Integer remotePort) {
        this.remotePort = remotePort;
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
        return "LocalPortForwarding{" +
                "forwardedPort=" + forwardedPort +
                ", remoteServer='" + remoteServer + '\'' +
                ", remotePort=" + remotePort +
                ", sshServer='" + sshServer + '\'' +
                ", sshLogin='" + sshLogin + '\'' +
                ", sshPort=" + sshPort +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

}
