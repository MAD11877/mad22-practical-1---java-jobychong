import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {

    System.out.print("Please enter your weight in kg: ");
    Scanner in = new Scanner(System.in);
    double weight = in.nextDouble();

    System.out.print("Please enter your height in m: ");
    double height = in.nextDouble();

    System.out.println("Your height is "+ height + "m");
    System.out.println("Your weight is "+ weight + "kg");
  }
}
