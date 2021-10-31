import java.util.Scanner;

public class Lektion4_4
{
  public static void main(String[] args)
  {
    String good = "Godt klaret";
    Scanner input = new Scanner(System.in);
    System.out.println("Skriv et tal mellem 12 og 25 for at slukke programmet");
    while (input.nextInt() < 10 || input.nextInt() >=25)
    {
      System.out.println("outside the range");
    }

  }
}
