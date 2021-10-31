import java.util.Scanner;

public class Lektion4_3
{
  public static void main(String[] args)
  {

    Scanner input = new Scanner(System.in);
    int NumberString = 0;
    for (int i = 0; i < 6; i++)
    {
      System.out.println("Type a word");
      NumberString += input.nextLine().length();
    }

    System.out.println("totalt number of Characters : " + NumberString);

  }
}
