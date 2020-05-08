package maps;

import java.util.Scanner;

/**
 * @author CaseyJayne
 *
 */
public class RunContacts {

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      
      System.out.println("Please enter the contact list file location: ");
      String inFile = in.nextLine().strip();
      System.out.println("Reading the input");
      //create ContactList object
      ContactList myList = new ContactList(inFile);
      //read in the list
      myList.readList();
      int input;
      String name = null;
      try {
         do {
            System.out.println();
            System.out.println("Please select from the following: ");
            System.out.println("\t1.Delete a contact");
            System.out.println("\t2.Add a contact");
            System.out.println("\t3.Display a contact");
            System.out.println("\t4.Display all contacts");
            System.out.println("\t5.Save list to file");
            System.out.println("\t0.Quit program");
            System.out.println("Please enter an integer 0-5 to select: ");
            input = in.nextInt();
            //loop through options
            switch(input) {
               case 1: //delete
                  System.out.println("Enter the lastname of the contact to "
                        + "delete: ");
                  System.out.println();
                  name = in.next();
                  myList.deleteContact(name);
                  break;
               case 2: //add contact
                  System.out.println("Enter the lastname of the contact to"
                        + " add: ");
                  System.out.println();
                  String lName = in.next();
                  System.out.println("Enter firstname: ");
                  System.out.println();
                  String fName = in.next();
                  System.out.println("Enter the phone number as "
                        + "digits only: ");
                  System.out.println();
                  long number = in.nextLong();
                  System.out.println("Enter the email: ");
                  System.out.println();
                  String email = in.next();
                  System.out.println("Adding contact " +lName);
                  myList.addContact(fName, lName,
                        number, email);
                  break;
               case 3: //display contact
                  System.out.println("Enter the last name of the contact to "
                        + "display: ");
                  System.out.println();
                  name = in.next();
                  System.out.println(myList.printContact(name));
                  break;
               case 4: //print list
                  myList.printContactList();
                  break;
               case 5: //write list
                  myList.saveList();
                  break;
         }}while(input !=0);
      }catch(Exception except) {
         //invalid input possible
         System.out.println("Exception: " + except.getMessage() + "\n" 
               + except.getStackTrace());
      }
      
      System.out.println("Thank you!");
      in.close();
      
   }

}
