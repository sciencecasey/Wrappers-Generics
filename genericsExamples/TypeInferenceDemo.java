package genericsExamples;

class MyClass5<T, V> {
   T ob1;
   V ob2;

   public MyClass5(T ob1, V ob2) {
      this.ob1 = ob1;
      this.ob2 = ob2;
   }

   public boolean isSame(MyClass5<T, V> o) {
      return ( (this.ob1 == o.ob1) && (this.ob2 == o.ob2));
   }
}

public class TypeInferenceDemo {
   public static void main(String[] args) {
      {
         // Prior to JDK 7
         MyClass5<Integer, String> mcOb = new MyClass5<Integer, String>(98,
               "A String");
      }

      {
         // After JDK 7
         MyClass5<Integer, String> mcOb = new MyClass5<>(98, "A String");

         if (mcOb.isSame(new MyClass5<>(98, "A String"))) {
            System.out.println("Same");
         }

         if (!mcOb.isSame(new MyClass5<>(99, "A String"))) {
            System.out.println("Not Same");
         }

         if (!mcOb.isSame(new MyClass5<>(98, "A Different String"))) {
            System.out.println("Not Same");
         }

      }
   }
}