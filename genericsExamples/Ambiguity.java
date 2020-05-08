package genericsExamples;

// Ambiguity caused by erasure on
// overloaded methods.
class MyGenClass<T, V> {
   T ob1;
   V ob2;

   // ...

   // These two overloaded methods are ambiguous
   // and will not compile.
   void set(T o) {
      this.ob1 = o;
   }

//   void set(V o) {
//      ob2 = o;
//   }

}

public class Ambiguity {

   public static void main(String[] args) {
      //now both params are the same
      MyGenClass<String, String> obj = new MyGenClass<String, String>();
      obj.set("Hello");
   }

}