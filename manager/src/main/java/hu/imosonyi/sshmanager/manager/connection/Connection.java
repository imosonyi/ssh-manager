package hu.imosonyi.sshmanager.manager.connection;

public class Connection {

    private String id;
    private String name;
    private ConnectionStatus status;
    private ConnectionType type;
    private Boolean passphraseRequired;

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

    public ConnectionStatus getStatus() {
        return status;
    }

    public void setStatus(ConnectionStatus status) {
        this.status = status;
    }

    public ConnectionType getType() {
        return type;
    }

    public void setType(ConnectionType type) {
        this.type = type;
    }

    public Boolean getPassphraseRequired() {
        return passphraseRequired;
    }

    public void setPassphraseRequired(Boolean passphraseRequired) {
        this.passphraseRequired = passphraseRequired;
    }

    @Override
    public String toString() {
        return "Connection{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status=" + status +
                ", type=" + type +
                ", passphraseRequired=" + passphraseRequired +
                '}';
    }

}
