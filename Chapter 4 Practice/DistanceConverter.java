public class DistanceConverter
{
   public static final int TOFEET = 3;
   public static final int TOINCHES = 12;   
   public static void main(String[] args)
   {
      double yards = 3.5;
      double feet = yards * TOFEET;
      double inches = feet * TOINCHES;
      
      System.out.println(yards + "yards are " + feet + " feet");
      System.out.println(yards + "yards are " + inches + " inches");
   }
}
