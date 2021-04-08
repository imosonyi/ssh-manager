package hu.imosonyi.sshmanager.store.portforwarding.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.crypto.encrypt.Encryptors;
import org.springframework.security.crypto.encrypt.TextEncryptor;
import org.springframework.stereotype.Component;

@Component
public class DataEncryptor {

    @Value("${data-encryption.password:Password123!}")
    private String password;
    @Value("${data-encryption.salt:ASDFGH1234567890}")
    private String salt;

    private final TextEncryptor encryptor;

    public DataEncryptor() {
        encryptor = Encryptors.text(password, salt);
    }

    public String encrypt(String plain) {
        return encryptor.encrypt(plain);
    }

    public String decrypt(String encoded) {
        return encryptor.decrypt(encoded);
    }

}
