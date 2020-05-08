package genericsExamples;

// Overriding a generic method in a generic class.
class GenOver<T> {
   T ob; // declare an object of type T

   // Pass the constructor a reference to
   // an object of type T.
   GenOver(T o) {
      this.ob = o;
   }

   // Return ob.
   T getob() {
      System.out.print("Gen's getob(): ");
      return this.ob;
   }
}

// A subclass of Gen that overrides getob().
class GenOver2<T> extends GenOver<T> {

   GenOver2(T o) {
      super(o);
   }

   // Override getob().
   T getob() {
      System.out.print("Gen2's getob(): ");
      return this.ob;
   }
}

// Demonstrate generic method override.
class OverrideDemo {
   public static void main(String args[]) {

      // Create a Gen object for Integers.
      var iOb = new GenOver<Integer>(88);

      // Create a Gen2 object for Integers.
      var iOb2 = new GenOver2<Integer>(99);

      // Create a Gen2 object for Strings.
      var strOb2 = new GenOver2<String>("Generics Test");

      System.out.println(iOb.getob());
      System.out.println(iOb2.getob());
      System.out.println(strOb2.getob());
   }
}
