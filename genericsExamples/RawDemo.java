package genericsExamples;

// Demonstrate a raw type.
class GenRaw<T> {
   T ob; // declare an object of type T

   // Pass the constructor a reference to
   // an object of type T.
   GenRaw(T o) {
      this.ob = o;
   }

   // Return ob.
   T getob() {
      return this.ob;
   }
}

// Demonstrate raw type.
class RawDemo {
   public static void main(String args[]) {

      // Create a Gen object for Integers.
      var iOb = new GenRaw<Integer>(88);

      // Create a Gen object for Strings.
      var strOb = new GenRaw<String>("Generics Test");

      // Create a raw-type Gen object and give it
      // a Double value.
      //we didn't give a diamond operator so GenRaw doesn't have a type param
      GenRaw raw = new GenRaw(Double.valueOf(98.6));

      // Cast here is necessary because type is unknown.
      double d = (Double) raw.getob();
      System.out.println("value: " + d);

      // The use of a raw type can lead to run-time.
      // exceptions. Here are some examples.

      // The following cast causes a run-time error!
      // raw contains a Double value, not an integer value.
      // int i = (Integer) raw.getob(); // run-time error

      // This assigment overrides type safety.
      strOb = raw; // OK, but potentially wrong

      // Because strOb is of type Gen<String>, it is assumed to contain a String
      // However, after the assignment, the object referred to by strOb contains
      // a Double
      // Thus, at run time, when an attempt is made to assign the contents of
      // strOb to str,
      // a run-time error results because strOb now contains a Double .
      // String str = strOb.getob(); // run-time error

      // This assingment also overrides type safety.
      raw = iOb; // OK, but potentially wrong
      // raw now refers to an object that contains an Integer object,
      // but the cast assumes that it contains a Double
      // d = (Double) raw.getob(); // run-time error
   }
}
