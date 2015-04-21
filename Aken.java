import javafx.application.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;
import java.io.*;
import java.util.*;
public class Aken extends Application{
    int hunte=5;
    int janeseid=30;
    TextField tfHunte=new TextField(String.valueOf(hunte));
    TextField tfJaneseid=new TextField(String.valueOf(janeseid));
    Button nupp1=new Button("1 päev");
    Button salvestusnupp=new Button("Salvesta");
    Button lugemisnupp=new Button("Loe");
    public void start(Stage stage){
       VBox vb=new VBox();
       HBox hb=new HBox();
       hb.getChildren().addAll(tfHunte, tfJaneseid);
       HBox nupud=new HBox();
       nupud.getChildren().addAll(nupp1, salvestusnupp, lugemisnupp);
       vb.getChildren().addAll(hb, nupud);
       Group juur=new Group(vb);
       stage.setScene(new Scene(juur));
       stage.show();
       salvestusnupp.setOnAction((event) -> salvesta());
    }
    void salvesta(){
       try{
         Properties prop=new Properties();
         prop.put("hunte", String.valueOf(hunte));
         prop.put("janeseid", String.valueOf(janeseid));
         FileOutputStream fos=new FileOutputStream("andmed.txt");
         prop.store(fos, "Metsaandmed");
         fos.close();
       }catch(IOException ex){
         ex.printStackTrace();
       }
    }
}