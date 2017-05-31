/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainapp;
import util.*;
import java.io.IOException;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import Login.LoginStage;
import java.util.Locale;

/**
 *
 * @author Timothy
 */
public class MainApp extends Application {
    
    @Override public void start(Stage stage) throws IOException {
    InternationalInterface InterInterface = (String s)->InternationalResources.getString(s);
    String str = InterInterface.show("hello");
    System.out.println(str);
    Scene scene = new Scene(new StackPane());
    
    LoginStage loginManager = new LoginStage(scene);
    loginManager.showLoginScreen();

    stage.setScene(scene);
    stage.show();
  }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
        
    }
    
}
