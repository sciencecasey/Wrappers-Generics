package genericsExamples;

// Use a wildcard.
class Stats5<T extends Number> {
   T[] nums; // array of Number or subclass

   // Pass the constructor a reference to
   // an array of type Number or subclass.
   Stats5(T[] o) {
      this.nums = o;
   }

   // Return type double in all cases.
   double average() {
      double sum = 0.0;

      for (int i = 0; i < this.nums.length; i++)
         sum += this.nums[i].doubleValue();

      return sum / this.nums.length;
   }

   // // This won�t work!
   // // Determine if two averages are the same.
   // // Works only with other Stats objects whose type is the same as the
   // invoking object
   //    boolean sameAvg(Stats<T> ob) {
   //       return (average() == ob.average());
   //    }

   // Determine if two averages are the same. // Notice the use of the wildcard.
   boolean sameAvg(Stats5<?> ob) {
      return (average() == ob.average());
   }

}

// Demonstrate wildcard.
class WildcardDemo {
   public static void main(String args[]) {
      Integer inums[] = { 1, 2, 3, 4, 5 };
      Stats5<Integer> iob = new Stats5<Integer>(inums);
      double v = iob.average();
      System.out.println("iob average is " + v);

      Double dnums[] = { 1.1, 2.2, 3.3, 4.4, 5.5 };
      Stats5<Double> dob = new Stats5<Double>(dnums);
      double w = dob.average();
      System.out.println("dob average is " + w);

      Float fnums[] = { 1.0F, 2.0F, 3.0F, 4.0F, 5.0F };
      Stats5<Float> fob = new Stats5<Float>(fnums);
      double x = fob.average();
      System.out.println("fob average is " + x);

      // See which arrays have same average.
      System.out.print("Averages of iob and dob ");
      if (iob.sameAvg(dob))
         System.out.println("are the same.");
      else
         System.out.println("differ.");

      System.out.print("Averages of iob and fob ");
      if (iob.sameAvg(fob))
         System.out.println("are the same.");
      else
         System.out.println("differ.");
   }
}
