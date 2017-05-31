/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calendar;
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
import Meeting.MeetingStage;
import java.time.YearMonth;
import javafx.fxml.FXMLLoader;
/**
 *
 * @author Timothy
 */
public class CalendarStage extends Stage{

    public CalendarStage(String sessionid)throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("fullCalendar.fxml"));
        this.setTitle("Full Calendar FXML Example");
        this.setScene(new Scene(loader.load()));
        // Get the controller and add the calendar view to it
        FullCalendarController controller = loader.getController();
        controller.calendarPane.getChildren().add(new FullCalendarView(YearMonth.now()).getView());
        this.show();

//    openOther.setOnAction(new EventHandler<ActionEvent>() {
//        @Override
//        public void handle(ActionEvent t) {
//            new MeetingStage();
//        }//end action
//    });
    }
}
