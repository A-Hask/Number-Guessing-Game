import java.sql.*;

import javax.swing.plaf.LabelUI;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application{
    private Statement statement;
    private Textfield guess;
    private Label message = new Label(); 

    @Override
    public void start(Stage primaryStage){
        VBox vbox = new VBox();
        vBox.getChildren.addAll(
            new Label("Genie"), message,
            new Label("Enter your guess here"), guess
        );
    }
}
