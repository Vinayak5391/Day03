import java.util.Scanner;
class Ques24
{
	public static void main(String[] args) 
	{
       Scanner sc = new Scanner(System.in);

         System.out.println("Enter array size:");
        int size = sc.nextInt();

        int[] arr = new int[size];
        int[] copyarr = new int[size];

		System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) 
		{
            arr[i] = sc.nextInt();
        }

System.out.print("Copy Element are :");
	
for (int i=0;i<arr.length ;i++)
{
	  copyarr[i] = arr[i];
	  System.out.print(arr[i]);
}





   } 

}
/* Copy Array to Another Array
 Write a program to copy all the elements of one array {1, 2, 3, 4, 5} 
 into another array and print the new array.
*/
