package hu.imosonyi.sshmanager.widget;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class WidgetInitializer implements ApplicationListener<WidgetReadyEvent> {

    @Value("classpath:/fxml/widget.fxml")
    private Resource widgetResource;

    private final ApplicationContext applicationContext;

    public WidgetInitializer(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Override
    public void onApplicationEvent(WidgetReadyEvent widgetReadyEvent) {
        try {
            showStage(widgetReadyEvent, loadParent());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private Parent loadParent() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(widgetResource.getURL());
        fxmlLoader.setControllerFactory(applicationContext::getBean);
        return fxmlLoader.load();
    }

    private void showStage(WidgetReadyEvent widgetReadyEvent, Parent parent) {
        Stage stage = widgetReadyEvent.getStage();
        stage.setScene(new Scene(parent));
        stage.show();
    }

}
