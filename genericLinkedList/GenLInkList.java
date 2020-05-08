package genericLinkedList;

/**
 * @author CaseyJayne
 * drive the generic linked list
 */
public class GenLInkList {
   public static void main(String [] args){
      
      //create an integer list
      DLL<Integer> intll = new DLL<>();
      // Insert 1 as first position
      intll.append(1);
      // Insert 10 at the end
      intll.append(10);
      // insert 5 in second position
      intll.InsertAfter(intll.getHead().getNext(), 5);
      System.out.println("Created Integer list is: ");
      intll.printlist();
      
      //create double list
      DLL<Double> doubLL = new DLL<>();
      //push new item
      doubLL.push(6.0);
      //push item ahead of first item
      doubLL.push(2.0);
      //place item at end of list
      doubLL.append(12.0);
      //print list
      System.out.println("\n");
      System.out.println("Created Double list is: ");
      doubLL.printlist();
      
      //create string list
      DLL<String> stringLL = new DLL<>();
      stringLL.push("Dog");
      stringLL.InsertAfter(stringLL.getHead(), "Cat");
      stringLL.append("Horse");
      System.out.println("\n");
      System.out.println("Created String list is: ");
      stringLL.printlist();
      
   }
 }
