package hu.imosonyi.sshmanager.store.portforwarding.configuration;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("SECURITY_CONFIGURATION")
public class SecurityConfiguration {

    @Id
    @Field("ID")
    private String id;
    @Field("SSH_KEY")
    private String sshKey;
    @Field("STORE_CREDENTIALS")
    private Boolean storeCredentials;
    @Field("PASSPHRASE")
    private String passphrase;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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
                "id='" + id + '\'' +
                ", sshKey='" + sshKey + '\'' +
                ", storeCredentials=" + storeCredentials +
                '}';
    }

}
