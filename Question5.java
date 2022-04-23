import java.io.*;
import java.util.Scanner;

public class Question5
{

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    //System.out.println("Enter the size of array : ");
    int number_of = in.nextInt();
    
    int arr[] = new int[number_of];
    
    //System.out.println("Enter the elements of array : ");
    for(int i=0;i<number_of;i++) {
      arr[i] = in.nextInt();
    }
    
    //System.out.println("Entered elements are : ");
    for(int i=0;i<number_of;i++) {
      //System.out.print(arr[i]+" ");
    }
    
    int maxVal=0, count=0, maxCount=0;
    
    for(int i=0;i<number_of;i++) {
      count = 0;
      for(int j=0;j<number_of;j++) {
        if(arr[i] == arr[j]) {
          count++;
        }
      }
      if (count > maxCount) {
                      maxCount = count;
                      maxVal = arr[i];
                 }
    }
    
    //System.out.println("\nThe mode is "+maxVal+" as there are "+maxCount + " of the number " + maxVal );
    System.out.println(maxVal);
  }
}
