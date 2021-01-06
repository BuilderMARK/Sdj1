import java.util.Scanner;

public class Lektion5_03
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);

    int [] tal = new int[5];

    for (int i = 0; i < tal.length; i++)
    {
      System.out.println("Skriv et tal");
      scan.nextInt();
    }

    //summen og gennemsit
    int sum = 0 ;
    for (int value:tal){
      sum+=value;}

    System.out.println("summen er: " + sum);
    System.out.println("gemmensnittet er: "+ sum/ tal.length);

    //Højeste værdig i arrayet

    int højeste = tal[0];
    for (int i = 0; i < tal.length; i++)
    {
      if (tal[i] > højeste)
        højeste = tal[i];
    }
      System.out.println("Det højeste tal er: " + højeste);

      //find det laveste tal i et array

      int laveste = tal[0];
      for (int j = 0; j < tal.length; j++)
      {
        if (tal[j]<laveste)
          laveste=tal[j];
      }

        System.out.println("Det laveste tal er: " + laveste);

  }
}