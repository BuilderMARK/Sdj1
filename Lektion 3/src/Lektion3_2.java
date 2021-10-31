import java.util.Scanner;

public class Lektion3_2
{
  public static void main(String[] args)
  {
    Scanner dinalder = new Scanner(System.in);
    System.out.println("Skriv din alder her: ");
    int alder = dinalder.nextInt();
    String alder1 = "";
    if (alder < 0)
    {
      alder1="Forkert alder input";
    }

    else if (alder>=0 && alder<=12)
    {
      alder1="Du er et barn";
    }

    else if (alder>=12 && alder<=19 )
    {
      alder1 = "Du er en teenager";
    }
    else if (alder > 65 ){
      alder1="Du gamle";
    }
    System.out.println(alder1);
  }


}
