/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

/**
 *
 * @author Timothy
 */
public class LoginStage extends Stage{
 private Scene scene;

    public LoginStage(Scene scene){
        this.scene = scene;
    }
    public Scene getLoginScene(){
        return scene;
    }
    public void authenticated(String sessionID)throws Exception {
        showCalendarView(sessionID);
    }

  /**
   * Callback method invoked to notify that a user has logged out of the main application.
   * Will show the login application screen.
   */ 
  public void logout() {
    showLoginScreen();
  }
  
  public void showLoginScreen() {
    try {
      FXMLLoader loader = new FXMLLoader(
        getClass().getResource("login.fxml")
      );
      scene.setRoot((Parent) loader.load());
      LoginController controller = 
        loader.<LoginController>getController();
      controller.initManager(this);
    } catch (IOException ex) {
      Logger.getLogger(LoginStage.class.getName()).log(Level.SEVERE, null, ex);
    }
  }

  private void showCalendarView(String sessionID)throws Exception {
    new Calendar.CalendarStage(sessionID);
    scene.getWindow().hide();
  }
  public void showNewUserView()throws Exception {
      new NewUser.NewUserStage();
      scene.getWindow().hide();
  }
}
