import java.util.Scanner;

public class Lektion2_7
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Hvad er dit navn ?");
    String name = scanner.nextLine();
    System.out.println("Hvor gamle er du ? ");
    int age = scanner.nextInt();
    System.out.println("Dit navn er: " + name + " " + " Din alder er: " + age);
  }
}
