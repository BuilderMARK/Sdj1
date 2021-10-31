import java.util.Scanner;

public class Lektion3_4
{
  public static void main(String[] args)
  {
    Scanner a = new Scanner(System.in);
    Scanner b = new Scanner(System.in);
    Scanner c = new Scanner(System.in);

    System.out.println("Indtast A værdien");
    int ascanner = a.nextInt();

    System.out.println("Intast B værdien");
    int bscanner = b.nextInt();

    System.out.println("Indtast C værdien");
    int cscanner = c.nextInt();

    System.out.println("Tak, påbegynder udregningen");
    System.out.println("Loading..............");
    double D = Math.pow(bscanner,2)-4*ascanner*cscanner;
    System.out.println(D);

    if (D<0){
      System.out.println("No solutions");
    }
    else if(D==0)
    {
    System.out.println("One solution");
  }
    else
      System.out.println("2 solution");
  }
}

