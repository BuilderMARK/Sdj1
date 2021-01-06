public class Lektion4_01
{
  public static void main(String[] args)
  {
    String hej = "Hello";
    int tal = 0;

    for (int i = 0; i < 5; i++)
    {
      tal++;
      System.out.println(hej + " " + tal);
    }
    tal=5;
    for (int i = 5; i > 0 ; i--)
    {
      tal--;
      System.out.println(hej + " " + tal);

    }
  }
}
