import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HospitalManagementApp extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hospital Management System");

        // Create UI elements
        Label label = new Label("Hospital Management System");
        Button patientButton = new Button("Manage Patients");
        Button doctorButton = new Button("Manage Doctors");
        Button appointmentButton = new Button("Manage Appointments");

        // Set button actions
        patientButton.setOnAction(e -> {
            // Code to open patient management window
        });
        doctorButton.setOnAction(e -> {
            // Code to open doctor management window
        });
        appointmentButton.setOnAction(e -> {
            // Code to open appointment management window
        });

        // Layout
        VBox layout = new VBox(10);
        layout.getChildren().addAll(label, patientButton, doctorButton, appointmentButton);

        // Scene
        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
