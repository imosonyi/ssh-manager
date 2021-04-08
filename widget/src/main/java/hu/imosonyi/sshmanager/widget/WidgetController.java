package hu.imosonyi.sshmanager.widget;

import hu.imosonyi.sshmanager.manager.connection.ConnectionManager;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import org.springframework.stereotype.Component;

@Component
public class WidgetController {

    @FXML private Label label;

    private final ConnectionManager connectionManager;

    public WidgetController(ConnectionManager connectionManager) {
        this.connectionManager = connectionManager;
    }

    @FXML
    public void initialize() {
        label.setText(connectionManager.findAll().toString());
    }

}
