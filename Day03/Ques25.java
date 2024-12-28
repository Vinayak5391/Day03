 import java.util.Scanner;
 class Ques25{

    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

         System.out.println("Enter array size:");
        int size = sc.nextInt();

        int[] arr = new int[size];
        
		System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) 
		{
            arr[i] = sc.nextInt();
        }

         System.out.println("Enter Starting index :");
		 int starting = sc.nextInt();

		  System.out.println("Enter Endindex :");
		  int Ending = sc.nextInt();


          int copyArray [] = new int[Ending-starting+1];

		  for (int i=starting;i<= Ending;i++)
		  {
             copyArray[i-starting] =  arr[i];
		  }
		  System.out.print("copyArray");
            for(int num : copyArray)
            {
			System.out.print(num + " ");
            }
			sc.close();
    }
}

/*Question 24:
 Copy Elements Using Index Range
 Write a program to copy elements from index 2 to 4 of the array
 {10, 20, 30, 40, 50, 60} into a new array. The resulting array 
 should be {30, 40, 50}.*/
