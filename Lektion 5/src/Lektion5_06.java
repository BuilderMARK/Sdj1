import java.util.Scanner;

public class Lektion5_06
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Hvor stor skal dit array være");
    int store = scanner.nextInt();
    System.out.println("Dit Array er nu " + store + " Antal bredt");
    int nagativ = 0;
    int [] array = new int[store];
    for (int i = 0; i < array.length; i++)
    {
      System.out.println("Indtast negative og positive tal");
      array[i] = scanner.nextInt();

      if (array[i]<0){
        nagativ++;
      }


    }
    System.out.println("Nummeret af negative tal er: " + nagativ);
  }
}
