package hu.imosonyi.sshmanager.store.portforwarding.configuration;

import org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListener;
import org.springframework.data.mongodb.core.mapping.event.AfterConvertEvent;
import org.springframework.data.mongodb.core.mapping.event.BeforeSaveEvent;
import org.springframework.stereotype.Component;

@Component
public class SecurityConfigurationMongoEventListener extends AbstractMongoEventListener<SecurityConfiguration> {

    private final DataEncryptor dataEncryptor;

    public SecurityConfigurationMongoEventListener(DataEncryptor dataEncryptor) {
        this.dataEncryptor = dataEncryptor;
    }

    @Override
    public void onBeforeSave(BeforeSaveEvent<SecurityConfiguration> event) {
        SecurityConfiguration source = event.getSource();
        source.setPassphrase(source.getStoreCredentials() ? null : dataEncryptor.encrypt(source.getPassphrase()));
        super.onBeforeSave(event);
    }

    @Override
    public void onAfterConvert(AfterConvertEvent<SecurityConfiguration> event) {
        SecurityConfiguration source = event.getSource();
        if (source.getPassphrase() != null) {
            source.setPassphrase(dataEncryptor.decrypt(source.getPassphrase()));
        }
        super.onAfterConvert(event);
    }

}
