package maps;
import java.util.*;
public class MyMaps {

   @SuppressWarnings("rawtypes")
   public static void main(String[] args) {
      //Int keys and String values
      HashMap<Integer, String> products = new HashMap<Integer, String>();
      
      products.put(102, "Staples");
      products.put(100, "Paper Clips");
      products.put(103, "Rubber Bands");
      
      System.out.println("Hash Maps have no order: \n");
      
      //loop through each entry object in the entrySet of the HashMap
      for(Map.Entry product: products.entrySet()) {
         System.out.println(product.getKey() + " : " + 
               product.getValue());
         System.out.println();
      }
      
      System.out.println("\n\nProduct for code 100 is " +products.get(100));
         
      
      TreeMap<Integer, String> products2 = new TreeMap<Integer, String>();
      
      products2.put(102, "Staples");
      products2.put(100, "Paper Clips");
      products2.put(103, "Rubber Bands");
      
      System.out.println("\n\nTree Maps sort by key before they store: \n");
      
      //loop through each entry object in the entrySet of the HashMap
      for(Map.Entry product: products2.entrySet()) {
         System.out.println(product.getKey() + " : " + 
               product.getValue());
         System.out.println();
      }
      
      System.out.println("\n\nProduct for code 100 is " +products2.get(100));
         
      
      //3 entries:
      //Create a TreeMap that uses the KeyValue type "Office Product" object,
      //which we define
      
      TreeMap<Integer, OfficeProduct> products3 = 
            new TreeMap<Integer, OfficeProduct>();
      
      //create office products
      OfficeProduct p1 = new OfficeProduct(102, "Staples   ",
            2.95);
      OfficeProduct p2 = new OfficeProduct(100, "Paper Clips ",
            1.10);
      OfficeProduct p3 = new OfficeProduct(103, "Rubber Bands",
            1.00);
      
      //put the Office Product code as the Key Value and the whole object as key
      products3.put(p1.getProductCode(), p1);
      products3.put(p2.getProductCode(), p2);
      products3.put(p3.getProductCode(), p3);
      
      System.out.println("\n\nTree Maps can store onbject which call values via "
            + "getters and setters: \n");
      
      for(Map.Entry k: products3.entrySet()) {
         //create a variable storing the looped key (will change each time)
         //refer to the p as an OfficeProduct because the key is an OfficeProduct
         //object!!
         OfficeProduct p = products3.get(k.getKey());
         //use the methods from OfficeProduct object on the iteration!
         System.out.println(p.getProductCode() + " : " +
               p.getProductDescription() + " : " + + p.getProductPrice());
      }
      
   }

}
