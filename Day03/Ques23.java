import java.util.ArrayList;
import java.util.List;

public class Ques23
	{
    public static void main(String[] args)
		{
          int[] arr = {1, 2, 3, 4, 5, 6};

          List<Integer> evenList = new ArrayList<>();
        List<Integer> oddList = new ArrayList<>();

         for (int num : arr) {
            if (num % 2 == 0) {
                evenList.add(num);   
            } else 
				{
                oddList.add(num);    
				}
        }

         int[] evenArr = new int[evenList.size()];
        int[] oddArr = new int[oddList.size()];

          for (int i = 0; i < evenList.size(); i++)
			  {
            evenArr[i] = evenList.get(i);
        }

        for (int i = 0; i < oddList.size(); i++) 
			{
            oddArr[i] = oddList.get(i);
        }

          System.out.print("Even numbers array: ");
        for (int num : evenArr) {
            System.out.print(num + " ");
        }

        System.out.println();  

        System.out.print("Odd numbers array: ");
        for (int num : oddArr) {
            System.out.print(num + " ");
        }
    }
}

/*Question 23:
  Copy Odd and Even Numbers Separately
 Write a program to copy the even numbers and odd numbers from 
 the array {1, 2, 3, 4, 5, 6} into new arrays and print the resulting array.
*/