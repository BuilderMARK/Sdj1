import java.util.Scanner;

public class Lektion2_6
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.println("skriv 2 tal : ");
    int tal1= scanner.nextInt();
    int tal2 = scanner.nextInt();
    System.out.println("De to valgte tal er :" +  tal1 +" " +  tal2);
    double sum = tal1+tal2;
    System.out.println("summen er: " + sum+ " Skriv et tal du gerne vil gange din sum med");
    int tal3=scanner.nextInt();
    int gange = tal3;
    System.out.println("summen er nu :" + sum*tal3);
  }
}
