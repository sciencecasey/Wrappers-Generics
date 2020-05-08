package genericsExamples;

// Stats attempts (unsuccessfully) to
// create a generic class that can compute
// the average of an array of numbers of
// any given type.
//
// The class contains an error!
class Stats2<T> {
   T[] nums; // nums is an array of type T

   // Pass the constructor a reference to
   // an array of type T.
   Stats2(T[] o) {
      this.nums = o;
   }

   // Return type double in all cases.
   double average() {
      double sum = 0.0;
      
    //this only works if we make T a number! 
      //we can use any type so we need to make this numbers only
      //shown in BoundsDemo.java
      //for (int i = 0; i < this.nums.length; i++)
         //sum += this.nums[i].doubleValue(); // Error!!!

      return sum / this.nums.length;
   }
}