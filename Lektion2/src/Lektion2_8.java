import java.util.Scanner;

public class Lektion2_8
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);

    System.out.println("I dag skal vi finde ud af dit navn, alder, og bopæl");
    System.out.println("Skriv dit navn: ");
    String name = scanner.nextLine();
    System.out.println("skriv din bopæl");
    String address = scanner.nextLine();
    System.out.println("Skriv din alder: ");
    int age = scanner.nextInt();
    System.out.println("Du hedder: " + name + " " + " Din alder er: " + age + " " + " Din bopæl er: " + address);
  }
}
