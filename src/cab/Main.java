package cab;


import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
//        Pane root = new Pane(); // create new Pane, vse elementy budut v kuche v vverhnem uglu
//        Pane root = new VBox(); // element raspolagaetsja kazhdyj na svoej stroke i esli ego mozhno rastjanutj, to ot kraja do kraja
//        Pane root = new FlowPane(); // create new Pane gde vse elementy budut odin za drugim v posledovatelnosti

        Pane root = FXMLLoader.load(getClass().getResource("/cab/MainFxml.fxml"));


////        Button btn = new Button("Hello");
//        Label lbl = new Label("Hello world");
//        //kak variant mozhno manualno zadatj koordinaty, no nepredpochtitelno
////        lbl.setLayoutX(140);
////        lbl.setLayoutY(40);
//
//        TextField txt = new TextField(); // Free text form
//
//        // code for button action. User inserts text into form and after button is pressed, smth happens
////        btn.setOnAction(e -> {
////            System.out.println("Hello, " + txt.getText() + "!");
////                });
//
//        lbl.textProperty().bind(Bindings.concat("Hello, ", txt.textProperty(), "!")); // slozhenie strok
//
//        root.getChildren().addAll(lbl, txt); // sozdaem element (knopku, field, label itd.) i dobavljaem v root

        Scene scene = new Scene(root, 500, 500); // create new scene with sizes. if size is not added, IDEA will calculate it automatically
        primaryStage.setTitle("Bulls and Cows");
        primaryStage.setScene(scene); // define with witch scene to work
        primaryStage.show(); // pokazatj na ekrane
    }





}
