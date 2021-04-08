package hu.imosonyi.sshmanager.widget;

import javafx.stage.Stage;
import org.springframework.context.ApplicationEvent;

public class WidgetReadyEvent extends ApplicationEvent {

    public WidgetReadyEvent(Stage stage) {
        super(stage);
    }

    public Stage getStage() {
        return ((Stage) getSource());
    }

}
