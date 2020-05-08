package genericsExamples;

class GenArrayOb<T extends Number>{
   T ob;
   
   T vals[]; //can declare a reference
   
   GenArrayOb(T o, T[] nums){
      this.ob = o;
      //we can assign reference to an already created array (nums)
      //array must be created in another class
      this.vals = nums;
      
      //can't actually create the array
      //this.vals = new T[0] becuase T is ambiguous
   }
   
   T getValue(int i){
      return this.vals[i];
   }
}

public class GenArrays {

   public static void main(String[] args) {
      Integer[] n = {1,2,3,4,5}; //won't compile unless typewrapper used
      GenArrayOb<Integer> iOb = new GenArrayOb<Integer>(50, n);
      
      System.out.println(iOb.getValue(0));
      //can't reate an array of the GenOb of specific parameter
      //GenArrayOb<Integer> gens[] = new GenArrayOb<Integer>[10];
      
      GenArrayOb<?> gens[] = new GenArrayOb<?>[10];
      //gens[0] = 10.0f;
      //gens[0] = 1;
      //gens = (GenArrayOb<Integer>) gens;
      
      GenArrayOb<Integer> intArray;
      //intarray = {1,2,3};
   }
   
   public <T> T[] arrayFill(T[] array, int size) {
      //can't create the array
      //array = new T[size];
      return array;
   }

}
