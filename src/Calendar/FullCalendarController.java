package Calendar;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.layout.Pane;
import Login.LoginStage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class FullCalendarController {

    // Get the pane to put the calendar on
    @FXML Pane calendarPane;
//    @FXML private Button logoutButton;
//    @FXML private Label  sessionLabel;
    
    public void initSessionID(final LoginStage loginStage, String sessionID) {
//    sessionLabel.setText(sessionID);
//    logoutButton.setOnAction(new EventHandler<ActionEvent>() {
//      @Override public void handle(ActionEvent event) {
//        loginStage.logout();
//      }
//    });
        System.out.println("calendar loaded");
  }

}
