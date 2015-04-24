import javafx.application.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;
import javafx.animation.*;
import javafx.util.Duration;
public class Vaade extends Application implements AndmeteKuular{
    Arvutused arvutused=new Arvutused();
    Andmed andmed=arvutused.andmed;
    TextField tfHunte=new TextField();
    TextField tfJaneseid=new TextField();
    Button nupp1=new Button("1 päev");
    Button nupp2=new Button("Juhuslik");
    Button nupp3=new Button("+Jänes");
    Button nupp4=new Button("Automaat");
    Timeline ajatiksuja=new Timeline(new KeyFrame(Duration.seconds(2), (event)->arvutused.arvutaPaev()));
    boolean tiksub=false;
    public void start(Stage stage){
       HBox hb=new HBox();
       hb.getChildren().addAll(tfHunte, tfJaneseid, nupp1, nupp2, nupp3, nupp4);
       Group juur=new Group(hb);
       stage.setScene(new Scene(juur));
       stage.show();
       nupp1.setOnAction((event) -> arvutused.arvutaPaev());  
       nupp2.setOnAction((event) -> arvutused.looJuhuslikudAndmed());  
       nupp3.setOnAction((event) -> arvutused.lisaJanes());  
       nupp4.setOnAction((event) -> automaatikaNupp());  
       andmed.lisaAndmeteKuular(this);
       loeAndmed();       
       ajatiksuja.setCycleCount(Timeline.INDEFINITE);
    }
    public void loeAndmed(){
       tfHunte.setText(String.valueOf(andmed.huntideArv()));
       tfJaneseid.setText(String.valueOf(andmed.janesteArv()));
    }
    public void andmedMuutusid(){
       loeAndmed();
    }
    public void automaatikaNupp(){
       if(tiksub){ajatiksuja.stop(); tiksub=false;}
       else {ajatiksuja.play(); tiksub=true;}
    }
}