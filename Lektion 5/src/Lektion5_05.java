import java.util.Scanner;

public class Lektion5_05
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    int[] array = new int[10];
    int hojeste = array[0];
    int nexthojeste = array[0];
    System.out.println("skriv 10 tal");
    for (int i = 0; i < array.length; i++)
    {

      array[i]= scanner.nextInt();
    }
    for (int i = 0; i < array.length; i++)
    {
      if (array[i]>hojeste){
        nexthojeste=hojeste;
        hojeste= array[i];
      } else if (array[i] > nexthojeste){
        nexthojeste = array[i];
      }
    }
    System.out.println("Det anden Højeste tal er: " + nexthojeste + " og det højeste tal er: " + hojeste);
  }
}
