import java.util.Scanner;

public class Lektion4_02
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    int sum = 0;
    for (int i = 0; i < 5; i++)
    {
      System.out.println("Type an integer");
      int value = scanner.nextInt();
      sum+= value;
    }
    System.out.println("The sum is " + sum);
  }
}
