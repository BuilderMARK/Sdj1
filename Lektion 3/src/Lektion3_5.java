import java.util.Scanner;

public class Lektion3_5
{
  public static void main(String[] args)
  {
    Scanner a = new Scanner(System.in);
    Scanner b = new Scanner(System.in);
    Scanner c = new Scanner(System.in);

    System.out.println("Indtast 1/3");
    int atal = a.nextInt();
    System.out.println("Indtast2/3");
    int btal = b.nextInt();
    System.out.println("Indtast 3/3");
    int ctal = c.nextInt();

    int low =0,mid =0, high =0;



    if (atal > btal)
    {
      if (atal > ctal)
      {
        high = atal;

        if (btal > ctal)
        {
          mid = btal;
          low = ctal;
        }
        else
        {
          mid = ctal;
          low = btal;
        }
      }
      else
      {
        mid = atal;
        high = ctal;
        low = btal;
      }
    }
    else
    {
      if (btal > ctal)
      {
        high = btal;
        if (atal > ctal)
        {
          mid = atal;
          low = ctal;
        }
        else
        {
          mid = ctal;
          low = atal;
        }
      }
      else
      {
        mid = btal;
        high = ctal;
        low = atal;
      }
    }
    System.out.println("The numbers sorted is from low to high " + low + ", " + mid + " and " + high);
  }
}
