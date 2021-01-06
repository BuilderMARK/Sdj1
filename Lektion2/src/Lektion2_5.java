import java.util.Scanner;

public class Lektion2_5
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.println("skriv 3 tal og vi udregner det for dig");
    int tal1=scanner.nextInt();
    int tal2=scanner.nextInt();
    int tal3=scanner.nextInt();
    System.out.println("De valgte tal er: " + tal1 + tal2 + tal3);
    double sum = tal1+tal2+tal3;
    System.out.println("Summen er : " + sum);
  }
}
