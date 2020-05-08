package collections;
import java.util.*;

public class Lists1 {

   public static void main(String[] args) {
      ArrayList<String> someQuotes = new ArrayList<String>();
      System.out.println("Arraylist: \n");
      someQuotes.add("A stitch in time saves nine.");
      someQuotes.add("A penny saved is a penny earned.");
      //shift the elements with this add
      someQuotes.add(0, "Got Java?");
      someQuotes.add("Today is the first day of the rest of your life");
      //remove and replace this with set:
      someQuotes.set(0, "Dogs eat Cats dine");
      someQuotes.remove(3);
      someQuotes.add(1, "Slow and steady wins the race");
      someQuotes.add(3, "Do unto others as you would have them do unto you");
      someQuotes.add("Time waits for no man");
      
      for(int i=0; i<someQuotes.size(); i++) {
         System.out.println(someQuotes.get(i));
         System.out.println();
      }
      
      System.out.println("\n\nNow Linked List: \n");
      LinkedList<String> someQuotes2 = new LinkedList<String>();
      
      someQuotes2.add("A stitch in time saves nine.");
      //pushes the others
      someQuotes2.addFirst("A penny saved is a penny earned.");
      //shift the elements with this add-- 
      //more effiecient than with ArrayList
      someQuotes2.add(0, "Got Java?");
      someQuotes2.addLast("Today is the first day of the rest of your life");
      //remove and replace "Got Java" this with set:
      someQuotes2.set(0, "Dogs eat Cats dine");
      someQuotes2.removeLast();
      someQuotes2.addLast("Do unto others as you would have them do unto you");
      
      for(String s: someQuotes2) {
         System.out.println(s);
         System.out.println();
      }
   }

}
