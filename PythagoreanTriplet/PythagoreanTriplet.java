//PythagoreanTriplet 
public class PythagoreanTriplet {
  public static void main(String[] args)
  {
    int a = args[1];
    int b = args[2];
    int c = args[3];
    if(a * a + b * b == c * c)
      System.out.println("true");
    System.out.println("false");
  }
}
