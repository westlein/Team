import java.util.Optional;
import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;


public class Team extends Application {
@Override
public void start(Stage primaryStage) {
int Badboy = 0;
int Jango = 0;
String inputPe;
String inputPl;

TextInputDialog inputDialog = new TextInputDialog();
inputDialog.setTitle("Number of People");
inputDialog.setHeaderText("Enter Number");
inputDialog.setContentText("Enter The Number of Anthletes(at least 3)");
Optional<String> enteredP = inputDialog.showAndWait();
inputPe = enteredP.get();
int numPeople = Integer.parseInt(inputPe);

if ( numPeople>=10) {
Badboy = numPeople/2;
} else if ( 3<=numPeople && numPeople<10) {
Badboy = numPeople/3;
} else {
Alert alert = new Alert(AlertType.INFORMATION);
alert.setContentText("Can't you read the instructions? It has to be at least 3!");
alert.showAndWait();

}
Alert alert12 = new Alert(AlertType.INFORMATION);
alert12.setTitle("You did it!");
alert12.setContentText("The number of people is " + numPeople + "\n" + "Group size is " + Badboy);
alert12.showAndWait();

TextInputDialog dialogWest = new TextInputDialog();
dialogWest.setTitle("Number of Players");
dialogWest.setHeaderText("Enter Number");
dialogWest.setContentText("Enter The Number of Anthletes!");
Optional<String> sasuke = dialogWest.showAndWait();
inputPl = sasuke.get();
int numPl = Integer.parseInt(inputPl);

if (11<=numPl && numPl>=55) {
Jango = numPl/11;
} else { 
Jango = 1;
}
Alert Westy = new Alert(AlertType.INFORMATION);
Westy.setTitle("You did it!");
Westy.setContentText("The number of players is " + numPl + "\n" + "Group size is " + Jango);
Westy.showAndWait();
}
}
