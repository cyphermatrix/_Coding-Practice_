//Palindrome 
public class Palin {
  public static void main(String[] args)
  {
    if(isPalin)
    System.out.println("True");
    System.out.println("False");
  }
  public boolean isPalin(int a)
  {
    int num = a;
    int reverse = 0;
    int digit = 0;
    while(num > 0)
    {
      digit = num % 10;
      reverse = reverse * 10 + dig;
      num = num/10;
    }
    if(num == reverse)
    return true;
    return false;
  }
}
