import javafx.application.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;
public class Aken extends Application{
    int hunte=5;
    int janeseid=30;
    TextField tfHunte=new TextField(String.valueOf(hunte));
    TextField tfJaneseid=new TextField(String.valueOf(janeseid));
    Button nupp1=new Button("1 päev");
    public void start(Stage stage){
       HBox hb=new HBox();
       hb.getChildren().addAll(tfHunte, tfJaneseid, nupp1);
       Group juur=new Group(hb);
       stage.setScene(new Scene(juur));
       stage.show();
    }
}