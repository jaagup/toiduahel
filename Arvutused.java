public class Arvutused{
   Andmed andmed=new Andmed();
   public void arvutaPaev(){
      if(andmed.huntideArv()<andmed.janesteArv()){
         andmed.uuedAndmed(andmed.huntideArv(), andmed.janesteArv()-andmed.huntideArv());
      }
   }
   public void looJuhuslikudAndmed(){
      andmed.uuedAndmed((int)(10*Math.random()), (int)(100*Math.random()));
   }
   public void lisaJanes(){
      andmed.uuedAndmed(andmed.huntideArv(), andmed.janesteArv()+1);
   }
}