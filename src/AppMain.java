import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class AppMain extends Application
{
    /**
     * GUI Application
     * @param primaryStage
     * @throws Exception
     */
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Camera Car");

        Label label = new Label("Camera Car");
        Scene scene = new Scene(label, 800,600);
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    /**
     * Main, from here the GUI will run
     * @param args
     */
    public static void main(String[] args) {
        Application.launch(args);
    }

}
