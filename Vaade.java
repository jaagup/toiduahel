import javafx.application.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;
public class Vaade extends Application implements AndmeteKuular{
    Arvutused arvutused=new Arvutused();
    Andmed andmed=arvutused.andmed;
    TextField tfHunte=new TextField();
    TextField tfJaneseid=new TextField();
    Button nupp1=new Button("1 päev");
    Button nupp2=new Button("Juhuslik");
    public void start(Stage stage){
       HBox hb=new HBox();
       hb.getChildren().addAll(tfHunte, tfJaneseid, nupp1, nupp2);
       Group juur=new Group(hb);
       stage.setScene(new Scene(juur));
       stage.show();
       nupp1.setOnAction((event) -> arvutused.arvutaPaev());  
       nupp2.setOnAction((event) -> arvutused.looJuhuslikudAndmed());  
       andmed.lisaAndmeteKuular(this);
       loeAndmed();       
    }
    public void loeAndmed(){
       tfHunte.setText(String.valueOf(andmed.huntideArv()));
       tfJaneseid.setText(String.valueOf(andmed.janesteArv()));
    }
    public void andmedMuutusid(){
       loeAndmed();
    }
}