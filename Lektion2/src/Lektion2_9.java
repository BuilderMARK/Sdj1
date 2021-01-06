import java.util.Scanner;

public class Lektion2_9
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Skriv din radius: ");
    double radius = scanner.nextDouble();
    double diamenter = Math.pow(radius,2);
    double areal = Math.PI*Math.pow(radius,2);
    System.out.println("diamenteren er: " + diamenter);
    System.out.println("Arealet er: " + areal);

  }
}
