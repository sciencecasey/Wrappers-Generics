package genericsExamples;

// Use a generic constructor.
class GenCons {
   private double val;
   
  //if a number is passed to 
   <T extends Number> GenCons(T arg) {
      this.val = arg.doubleValue();
   }
   //try casting a string
   GenCons(String arg){
         try {
            this.val = Double.valueOf(arg);
         } catch(NumberFormatException e) {
            System.out.println("Invalid String input");
            this.val = -1;
         }
      }
   GenCons(){
      this.val = -1;
   }

   void showval() {
      System.out.println("val: " + this.val);
   }
}

class GenConsDemo {
   public static void main(String args[]) {

      GenCons test = new GenCons(100);
      GenCons test2 = new GenCons(123.5F);
      GenCons test3 = new GenCons();
      GenCons test4 = new GenCons("invalid");
      GenCons test5 = new GenCons("10");

      test.showval();
      test2.showval();
      test3.showval();
      test4.showval();
      test5.showval();
   }
}
