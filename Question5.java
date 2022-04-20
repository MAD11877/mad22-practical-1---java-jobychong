import java.util.Scanner;
import java.util.*;

public class Question5
{
  public static void main(String[] args)
  {
    System.out.print("Enter your input: ");
    Scanner in = new Scanner(System.in);
    int input = in.nextInt();

    List<Integer> list=new ArrayList<Integer>(); 

    for(int x = 1; x <= input; x++)
      {
        System.out.print("Enter number "+ x + ": ");
        int numbers = in.nextInt();
        list.add(numbers);
      }

    System.out.print(list);
     int maxVal=0, count=0, maxCount=0;

        for(int i=0;i<input;i++)
        {
            count = 0;
            for(int j=0;j<input;j++)
            {
                if(list[i] == list[j])
                {
                    count++;
                }
            }
            if (count > maxCount) {
                        maxCount = count;
                        maxVal = list[i];
                   }
        }

        System.out.println("\nThe mode is "+maxVal+" as there are "+maxCount + " of the number " + maxVal );
  }
}
