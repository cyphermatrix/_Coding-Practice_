//Palindrome 
public class Palindrome {
  public static void main(String[] args)
  {
    if(isPalin(args[1]))
    System.out.println("true");
    System.out.println("false");
  }
  public static boolean isPalin(String a)
  {
    int n = a.length();
    for(int i = 0; i < n/2; i++)
    {
      if(a.charAt(i) != s.charAt(n-1-i))
      return false
    }
    return true;
  }
}
