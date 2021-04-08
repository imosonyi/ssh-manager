package hu.imosonyi.sshmanager.store.portforwarding.configuration;

import org.springframework.data.mongodb.core.mapping.Field;

public class CommonConfiguration {

    @Field("LOCAL_NETWORK_ADAPTER")
    private String localNetworkAdapter;
    @Field("AUTO_START")
    private Boolean autoStart;
    @Field("KEEP_ALIVE")
    private Boolean keepAlive;

    public String getLocalNetworkAdapter() {
        return localNetworkAdapter;
    }

    public void setLocalNetworkAdapter(String localNetworkAdapter) {
        this.localNetworkAdapter = localNetworkAdapter;
    }

    public Boolean getAutoStart() {
        return autoStart;
    }

    public void setAutoStart(Boolean autoStart) {
        this.autoStart = autoStart;
    }

    public Boolean getKeepAlive() {
        return keepAlive;
    }

    public void setKeepAlive(Boolean keepAlive) {
        this.keepAlive = keepAlive;
    }

    @Override
    public String toString() {
        return "Configuration{" +
                ", localNetworkAdapter='" + localNetworkAdapter + '\'' +
                ", autoStart=" + autoStart +
                ", keepAlive=" + keepAlive +
                '}';
    }

}
