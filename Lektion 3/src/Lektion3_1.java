import java.util.Scanner;

public class Lektion3_1
{
  public static void main(String[] args)
  {
    String karaterkon;
    Scanner scan = new Scanner(System.in);
    System.out.println("Skriv din karater: ");
    int karater = scan.nextInt();
    if (karater ==-3){
      karaterkon = "F";
    }
    else if (karater == 00){
      karaterkon = "Fx";
    }
    else if (karater==02){
      karaterkon= "E";
    }
    else if (karater==4){
      karaterkon="D";
    }
    else if (karater == 7){
      karaterkon="C";
    }
    else if (karater==10){
      karaterkon="B";
    }
    else if (karater==12){
      karaterkon="A+";
    }
    else  karaterkon= "Få dig et liv";
    System.out.println("Din karater er: " + karaterkon);
  }
}
