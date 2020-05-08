package genericsExamples;

public class GenericArrayTutorial {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Integer[] iArr = {1,2,3,4,5};
      Character[] cArr = {'y', 'o', 'u', 't', 'u', 'b', 'e'};
      
      printMe(iArr);
      printMe(cArr);
   }
   
   //pass any type of array
   public static <T> void printMe(T[] array) {
      //for any type of data in an array
      for (T i: array) {
         //print data
         System.out.printf("%s", i);
      }
      System.out.println();
   }
   
}
