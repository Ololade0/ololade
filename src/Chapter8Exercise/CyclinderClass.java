package Chapter8Exercise;

public class CyclinderClass {
    public static void main(String[] args) {

          Cyclinder cyclinder = new Cyclinder();

          cyclinder.setRadius(-1);
          System.out.println("" + cyclinder.getRadius());

          cyclinder.setHeight(-4);
          System.out.println("" + cyclinder.getHeight());

          System.out.println("" + cyclinder.volume());
      }


}
