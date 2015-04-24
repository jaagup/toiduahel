import java.io.*;
import java.util.*;
public class Andmed{
   private int hunte;
   private int janeseid;
   private ArrayList<AndmeteKuular> andmeteKuularid=new ArrayList<AndmeteKuular>();
   public Andmed(){loe();}
   public void uuedAndmed(int hunte, int janeseid){
      this.hunte=hunte; this.janeseid=janeseid;
      salvesta();
      for(AndmeteKuular ak: andmeteKuularid){ak.andmedMuutusid();}
   }
   public void lisaAndmeteKuular(AndmeteKuular ak){
      andmeteKuularid.add(ak);
   }
   public int huntideArv(){return hunte;}
   public int janesteArv(){return janeseid;}
   
   public void salvesta(){
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
   public void loe(){
       try{
         Properties prop=new Properties();
         prop.load(new FileInputStream("andmed.txt"));
         hunte=Integer.parseInt(prop.getProperty("hunte"));
         janeseid=Integer.parseInt(prop.getProperty("janeseid"));
       }catch(IOException ex){ex.printStackTrace();}
    }
}