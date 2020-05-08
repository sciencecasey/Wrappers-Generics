package maps;

/**
 * @author CaseyJayne
 * Class creates Contacts with firstName, lastName, phoneNumber, and email
 */
public class Contact {
   private String firstName;
   private String lastName;
   private long phoneNumber;
   private String email;
   
   /**
    * @param firstName set firstname as string
    * @param lastName set lastname as string
    * @param phoneNumber set phone number as integer (7-12 digits)
    * @param email set email as string
    */
   public Contact(String firstName, String lastName, long phoneNumber, 
            String email) {
      //set each via setters
      setFirstName(firstName);
      setLastName(lastName);
      setPhoneNumber(phoneNumber);
      setEmail(email);
   }
   //default constructor
   public Contact() {
      //set all to null via primary constructor
      this(null, null, -1, null);
   }

   /**
    * @return the firstName
    */
   public String getFirstName() {
      return this.firstName;
   }

   /**
    * @param firstName the firstName to set
    */
   private void setFirstName(String firstName) {
      this.firstName = firstName;
   }

   /**
    * @return the lastName
    */
   public String getLastName() {
      return this.lastName;
   }

   /**
    * @param lastName the lastName to set
    */
   private void setLastName(String lastName) {
      this.lastName = lastName;
   }

   /**
    * @return the phoneNumber
    */
   public long getPhoneNumber() {
      return this.phoneNumber;
   }

   /**
    * @param phoneNumber2 the phoneNumber to set
    */
   private void setPhoneNumber(long phoneNumber) {
         this.phoneNumber = phoneNumber;
   }

   /**
    * @return the email
    */
   public String getEmail() {
      return this.email;
   }

   /**
    * @param email as a string
    */
   private void setEmail(String email) {
      this.email = email;
   }
}
