package Login;

import javafx.event.*;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import java.sql.SQLException;
import User.User;
import java.sql.Connection;
import util.DBUtil;

/** Controls the login screen */
public class LoginController {
  @FXML private TextField userText;
  @FXML private TextField passwordText;
  @FXML private Button loginButton;
  @FXML private Button newAccountButton;
  
  public void initialize() {}
  
  public void initManager(final LoginStage loginStage) {
    loginButton.setOnAction(new EventHandler<ActionEvent>() {
      @Override public void handle(ActionEvent event){
        String sessionID = null;
            try{
                sessionID = authorize();
                if(sessionID != null){
                    loginStage.authenticated(sessionID);
                }
                else System.out.println("Time to create alert pop-up");
            }
            catch(Exception e){
                System.out.println("Error:" + e);
            }
      }
    });
    newAccountButton.setOnAction(new EventHandler<ActionEvent>() {
      @Override public void handle(ActionEvent event) {
        try{
                loginStage.showNewUserView();
            }
            catch(Exception e){
                System.out.println("Error:" + e);
            }
      }
    });
  }

  /**
   * Check authorization credentials.
   * 
   * If accepted, return a sessionID for the authorized session
   * otherwise, return null.
   */   
    private String authorize() throws Exception{
        String sessionId = null;
        try {
            Connection conn = DBUtil.dbConnect();
            User user = LoginDAO.getUser(userText.getText(),passwordText.getText());
            if(user.getUserId() != null  ){
                sessionId = generateSessionID();
            }
            
            conn.close();
        } catch (Exception e) {
            sessionId = null;
        }
    return sessionId;
  }
  
  private static int sessionID = 0;

  private String generateSessionID() {
    sessionID++;
    return "xyzzy - session " + sessionID;
  }
}