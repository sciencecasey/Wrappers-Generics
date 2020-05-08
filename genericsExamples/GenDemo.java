package genericsExamples;

// A simple generic class.
// Here, T is a type parameter that
// will be replaced by a real type
// when an object of type Gen is created.
class Gen1<T> {
   T ob; // declare an object of type T

   // Pass the constructor a reference to
   // an object of type T.
   Gen1(T o) {
      this.ob = o;
   }

   // Return ob.
   T getob() {
      return this.ob;
   }

   // Show type of T.
   void showType() {
      System.out.println("Type of T is " + this.ob.getClass().getName());
   }
}
//example hierarchy whereing GenBabe doesn't use the type param at all on its
//own but bc super uses it, it must specify
class GenBabe<T> extends Gen<T>{
   GenBabe(T o){
      super(o);
   }
}
// Demonstrate the generic class.
class GenDemo {
   public static void main(String args[]) {
      // Create a Gen reference for Integers.
      Gen1<Integer> iOb;

      // Create a Gen<Integer> object and assign its
      // reference to iOb. Notice the use of autoboxing
      // to encapsulate the value 88 within an Integer object.
      iOb = new Gen1<Integer>(88);
      GenBabe<Character> cOb = new GenBabe<Character>('c');
      
      // Show the type of data used by iOb.
      iOb.showType();
      ///cOb.showType(); //why doesn't this work? 
      cOb.getob();
      // Get the value in iOb. Notice that
      // no cast is needed.
      int v = iOb.getob();
      System.out.println("value: " + v);
      
      // iOb = new Gen<Double>(88.0); // Error!

      System.out.println();

      // Create a Gen object for Strings.
      Gen1<String> strOb = new Gen1<String>("Generics Test");

      // Show the type of data used by strOb.
      strOb.showType();

      // Get the value of strOb. Again, notice
      // that no cast is needed.
      String str = strOb.getob();
      System.out.println("value: " + str);

   }
}
