package genericsExamples;

// Demonstrate a simple generic method.
class GenMethDemo {

   // Determine if an object is in an array.
   //t and v are the parameters
   //comparable is a java interface using compare-to
   //every V must be a type of T so that they can be compared
   //in the parameters we must have another variable representing these types 
   //T repped by x and array of V(type T) repped by y
   static <T extends Comparable<T>, V extends T> boolean isIn(T x, V[] y) {

      for (int i = 0; i < y.length; i++)
         if (x.equals(y[i]))
            return true;

      return false;
   }

   public static void main(String args[]) {

      // Use isIn() on Integers.
      Integer nums[] = { 1, 2, 3, 4, 5 };

      if (isIn(2, nums))
         System.out.println("2 is in nums");

      // GenMethDemo.<Integer, Integer>isIn(2, nums)

      if (!isIn(7, nums))
         System.out.println("7 is not in nums");

      System.out.println();

      // Use isIn() on Strings.
      String strs[] = { "one", "two", "three", "four", "five" };

      if (isIn("two", strs))
         System.out.println("two is in strs");

      if (!isIn("seven", strs))
         System.out.println("seven is not in strs");

      // Opps! Won't compile! Types must be compatible.
      //integer (nums::V) is not of type String::T even though both are comparable
      // if(isIn("two", nums))
      // System.out.println("two is in strs");
   }
}
