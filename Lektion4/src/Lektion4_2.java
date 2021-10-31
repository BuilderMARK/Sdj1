import java.util.Scanner;

public class Lektion4_2
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    int sum = 0;
    for (int i = 0; i < 5; i++)
    {
      System.out.println("Type an integer: ");
      int value = input.nextInt();
      sum += value;
    }
    System.out.println("the sum is " + sum);
  }
}
