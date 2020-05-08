package genericsExamples;

// A nongeneric class can be the superclass
// of a generic subclass.

// A nongeneric class.
class NonGen {
   int num;

   NonGen(int i) {
      this.num = i;
   }

   int getnum() {
      return this.num;
   }
}

// A generic subclass.
class Gen5<T> extends NonGen {
   T ob; // declare an object of type T

   // Pass the constructor a reference to
   // an object of type T.
   Gen5(T o, int i) {
      super(i);
      this.ob = o;
   }

   // Return ob.
   T getob() {
      return this.ob;
   }
}

// Create a Gen object.
class HierDemo2 {
   public static void main(String args[]) {

      // Create a Gen object for String.
      Gen5<String> w = new Gen5<String>("Hello", 47);

      System.out.print(w.getob() + " ");
      System.out.println(w.getnum());
   }
}
