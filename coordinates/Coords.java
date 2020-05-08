package coordinates;

public class Coords<T extends TwoD> {
   T[] coords;
   
   public Coords(T[] o) {
      //this.coords = {o.w, o.h};
      this.coords = o;
   }
   
   public static void showXY(Coords<?> c) {
      System.out.println("X Y Coordinates: ");
      System.out.println(c.coords[0] + " " + c.coords[1]);
      System.out.println();
   }

}
