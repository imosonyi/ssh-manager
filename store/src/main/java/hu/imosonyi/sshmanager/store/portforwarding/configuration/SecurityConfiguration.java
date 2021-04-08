package hu.imosonyi.sshmanager.store.portforwarding.configuration;

import org.springframework.data.mongodb.core.mapping.Field;

public class SecurityConfiguration {

    @Field("SSH_KEY")
    private String sshKey;
    @Field("STORE_CREDENTIALS")
    private Boolean storeCredentials;
    @Field("PASSPHRASE")
    private String passphrase;

    public String getSshKey() {
        return sshKey;
    }

    public void setSshKey(String sshKey) {
        this.sshKey = sshKey;
    }

    public Boolean getStoreCredentials() {
        return storeCredentials;
    }

    public void setStoreCredentials(Boolean storeCredentials) {
        this.storeCredentials = storeCredentials;
    }

    public String getPassphrase() {
        return passphrase;
    }

    public void setPassphrase(String passphrase) {
        this.passphrase = passphrase;
    }

    @Override
    public String toString() {
        return "SecurityConfiguration{" +
                ", sshKey='" + sshKey + '\'' +
                ", storeCredentials=" + storeCredentials +
                '}';
    }

}
