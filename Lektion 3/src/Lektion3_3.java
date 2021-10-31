import java.util.Scanner;

public class Lektion3_3
{
  public static void main(String[] args)
  {
    Scanner inputString = new Scanner(System.in);
    Scanner inputint = new Scanner(System.in);
    System.out.println("Type Gender  (M or F): ");
    String Gender = inputString.nextLine();
    System.out.println("Type Age");
    int Age = inputint.nextInt();

    char gender = Gender.charAt(0);
    if (gender == 'M' && Age >=18)
    {
      System.out.println("Man");
    }
    else if (gender == 'M' && Age <=18){
      System.out.println("boy");
    }
      else if (gender == 'F' && Age >=18){
      System.out.println("Woman");
    }
      else
      System.out.println("Girl");
  }
}
