package maps;

import java.io.*;
import java.util.*;

/**
 * @author CaseyJayne
 * create a TreeMap representation of a contact list.  Save it to a file or read
 * in from file.  
 */
public class ContactList extends Contact {

   private File fileLocation;
   private TreeMap<String, Contact> contactList = new TreeMap<String, Contact>();
   /**
    * @param fileLocation location of contactList file
    */
   public ContactList(String fileLocation) {
      setFileLocation(fileLocation);
   }
   /**
    * default constructor
    */
   public ContactList() {
      this.fileLocation = null;
   }
   /**
    * @param fileLoc string representation of file location to set as input
    * and output file
    */
   public void setFileLocation(String fileLoc) {
    //set fileLocation- catch NullPointers
      try {
         this.fileLocation = new File(fileLoc);
      } catch(Exception e) {
         System.out.println("Exception: " + e.getMessage() + "\n" 
               + e.getStackTrace());
      }
   }
   /**
    * @param lastName of the contact to delete from list
    */
   public void deleteContact(String lastName) {
      this.contactList.remove(lastName);
   }
   /**
    * add a contact to the TreeMap contactList
    * @param firstName contact's first name
    * @param lastName contact's last name
    * @param phoneNumber contact's phone number
    * @param email contact's email 
    */
   public void addContact(String firstName, String lastName, long phoneNumber, 
         String email) {
      //create contact object
      Contact contact = new Contact(firstName, lastName, phoneNumber, email);
      //add contact to list
      this.contactList.put(lastName, contact);
   }
   /**
    * @return the location of file as File object
    */
   public File getFileLocation() {
      return this.fileLocation;
   }
   /**
    * @return the contactList as a TreeMap
    */
   public TreeMap<String, Contact> getContactList() {
      return this.contactList;
   }
   /**
    * print a String representation of the whole Contact List
    */
   public void printContactList() {
      for(String k: this.contactList.keySet()) {
         System.out.println(printContact(k));
         System.out.println();
      }
   }
   /**
    * @param lastName return Contact associated with lastName
    * @return the Contact object associated with give lastName
    */
   public Contact getContact(String lastName) {
      return this.contactList.get(lastName);
   }
   /**
    * @param lastName contact associated with lastName
    * @return String of contact's first name, last name, phone number, and email
    */
   public String printContact(String lastName) {
      Contact contact = this.contactList.get(lastName);
      return contact.getLastName() + ", " + contact.getFirstName() +
         "\n" + contact.getPhoneNumber() + "\n" + contact.getEmail();
   }
   
   /**
    * save the contactList to fileLocation specified; if file exists already, it
    * is overwritten
    */
   @SuppressWarnings("rawtypes")
   public void saveList() {
      if(this.fileLocation.exists()) {
         System.out.println("Saving over existing file.");
      }
      else {
         System.out.println("Saving new file.");
      }
      //setup a printwriter for ContactList Output
      try(PrintWriter output = new PrintWriter(new FileWriter(this.fileLocation,
            false))){
         //loop through each contact and print them
         for(Map.Entry c: this.contactList.entrySet()) {
            Contact contact = this.contactList.get(c.getKey());
            //print out Lname, Fname, phone, email
            output.printf("%-15s %-15s %-10d %-20s %n", 
                  contact.getLastName()+",", 
                  contact.getFirstName(), contact.getPhoneNumber(), 
                  contact.getEmail());
         }
      }catch(IOException ioe) {
         System.out.println("IO Exception: " + ioe.getMessage() + "\n" + 
               ioe.getStackTrace());
      }
   }
   /**
    * read an already created contactList into a TreeMap object
    */
   public void readList() {
      if(!this.fileLocation.exists()) {
         System.out.println("No file found, try again");
      }
      else {
         System.out.println("File found, reading data");
         //setup a buffered reader
         try(BufferedReader readIn = new BufferedReader(
               new FileReader(this.fileLocation))){
            String line;
            //read in linewise until end of file
            while((line = readIn.readLine()) !=null) {
               //create new contact from formatted locations
               Contact newCont = new Contact(
                     line.substring(0, 15).strip(), 
                     line.substring(15, 30).strip(), 
                     Long.parseLong
                     (line.substring(30, 40).strip()),
                     line.substring(40).strip());
               //add the contact to the TreeMap
               this.contactList.put(newCont.getLastName(), newCont);
            }
         }catch(IOException ioe) {
            System.out.println("IO Exception: " + ioe.getMessage() + "\n" + 
                  ioe.getStackTrace());
         }
      }
   }
}
