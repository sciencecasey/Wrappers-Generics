package genericsExamples;

//use Gen<T> method in HierDemo

class GenStr extends Gen<String> {
   GenStr(String o){
      super(o);
   }
   //use bridge for the getob method
   //this has a different return type so compiler can resolve ambiguity from 
   //old ambiguous 
   String getob() {
      System.out.println("You called String getob(): ");
      return this.ob;
   }
}

public class BridgeDemo {

   public static void main(String[] args) {
      
      //create GenStr object
      //now we don't need a type parameter when we call it
      GenStr strOb = new GenStr("This is a String Test");
      
      System.out.println(strOb.getob()+ "\n" + strOb.getClass().getName());
      
   }

}
