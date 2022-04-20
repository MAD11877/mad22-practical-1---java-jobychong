import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {

    System.out.println("Please enter your weight in kg: ");
    Scanner in = new Scanner(System.in);
    double weight = in.nextDouble();

    System.out.println("Please enter your height in m: ");
    double height = in.nextDouble();

    //To calculate BMI
    double bmi = (weight)/(height*height);

    System.out.println("Your BMI is: "+ bmi);
  }
}
