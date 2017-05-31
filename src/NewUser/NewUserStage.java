/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NewUser;
import Login.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Reflection;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import Calendar.CalendarStage;
import Calendar.FullCalendarController;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
/**
 *
 * @author Timothy
 */
public class NewUserStage extends Stage{
 private Scene scene;

    public NewUserStage()throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("NewUser.fxml"));
        this.setTitle("new user");
        this.setScene(new Scene(loader.load()));
        // Get the controller and add the calendar view to it
        NewUserController controller = loader.getController();
        this.show();
    }
  /**
   * Callback method invoked to notify that a user has logged out of the main application.
   * Will show the login application screen.
   */ 

  private void showCalendarView(String sessionID)throws Exception {
    new Calendar.CalendarStage(sessionID);
    scene.getWindow().hide();
  }
}
