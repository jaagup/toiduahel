import javafx.application.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;
public class Vaade extends Application{
    Arvutused arvutused=new Arvutused();
    Andmed andmed=arvutused.andmed;
    TextField tfHunte=new TextField(String.valueOf(andmed.huntideArv()));
    TextField tfJaneseid=new TextField(String.valueOf(andmed.janesteArv()));
    Button nupp1=new Button("1 päev");
    public void start(Stage stage){
       HBox hb=new HBox();
       hb.getChildren().addAll(tfHunte, tfJaneseid, nupp1);
       Group juur=new Group(hb);
       stage.setScene(new Scene(juur));
       stage.show();
       nupp1.setOnAction((event) -> arvutused.arvutaPaev());          
    }
}