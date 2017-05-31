package NewUser;

import Calendar.*;
import util.*;
import javafx.event.*;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import java.sql.Date;
import java.sql.SQLException;

/** Controls the login screen */
public class NewUserController {
  @FXML private TextArea resultArea;
  @FXML private TextField userNameText;
  @FXML private TextField passwordText;
  @FXML private Button createUser;
  
  public void initialize() {}
  
    /**
     *
     * @param loginStage
     * @throws Exception
     */
    public void initManager(final NewUserStage newUserStage) {
    createUser.setOnAction(new EventHandler<ActionEvent>()  {
      @Override public void handle(ActionEvent event){
          
        String sessionID = authorize();
        if (sessionID != null) {
          
          try{
                new NewUserStage();
            }
            catch(Exception e){
                System.out.println("Error:" + e);
            }
        }
      }
    });
  }
  @FXML
    private void insertNewUser (ActionEvent actionEvent) throws Exception, ClassNotFoundException {
        try {
            NewUserDAO.insertNewUser(userNameText.getText(),passwordText.getText(), userNameText.getText());
            resultArea.setText("User created! \n");
        } catch (SQLException e) {
            resultArea.setText("Problem occurred while inserting employee " + e);
            throw e;
        }
    }

  /**
   * Check authorization credentials.
   * 
   * If accepted, return a sessionID for the authorized session
   * otherwise, return null.
   */   
  private String authorize() {
    return generateSessionID();

  }
  
  private static int sessionID = 0;

  private String generateSessionID() {
    sessionID++;
    return "xyzzy - session " + sessionID;
  }
}