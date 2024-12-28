public class Ques27 {
    public static void main(String[] args) {
          int[] originalArray = {1, 2, 3, 4, 5, 6};

         int newSize = (originalArray.length + 1) / 2;  // This works even for arrays with odd length

         int[] newArray = new int[newSize];

         int j = 0;   
        for (int i = 0; i < originalArray.length; i += 2) {
            newArray[j] = originalArray[i];
            j++;
        }

         System.out.print("New Array: ");
        for (int num : newArray) {
            System.out.print(num + " ");
        }
    }
}

/*Question 26: Copy Elements Skipping Every Second Element
 Write a program to copy the elements of an array {1, 2, 3, 4, 5, 6}
 into a new array, skipping every second element. 
 The resulting array should be {1, 3, 5}.*/