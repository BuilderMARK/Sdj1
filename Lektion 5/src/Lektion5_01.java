import java.lang.reflect.Array;
import java.util.Scanner;

public class Lektion5_01
{
  public static void main(String[] args)
  {
    int sum = 0;
    Scanner store = new Scanner(System.in);
    System.out.println("Skriv hvor langt dit array skal være ");
     int n = store.nextInt();
     int a [] = new int[n];
    for (int i = 0; i < 10; i++)
    {
      a[i]= store.nextInt();
    }

    System.out.println("Dine 10 tal er: " + a);
  }

  @Override public String toString()
  {
    return super.toString();
  }
}
