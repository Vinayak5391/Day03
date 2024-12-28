  import java.util.ArrayList;

public class Ques26 {
    public static void main(String[] args) {
           int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {3, 4, 5, 6, 7};

         ArrayList<Integer> commonList = new ArrayList<>();

         for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    if (!commonList.contains(array1[i])) {
                        commonList.add(array1[i]);
                    }
                }
            }
        }

          int[] commonArray = new int[commonList.size()];
        for (int i = 0; i < commonList.size(); i++) {
            commonArray[i] = commonList.get(i);
        }

           System.out.print("Common Elements: ");
        for (int num : commonArray) {
            System.out.print(num + " ");
        }
    }
}

/*Question 25: Copy Common Elements Between Two Arrays
 Write a program to copy the common elements between two 
 arrays {1, 2, 3, 4, 5} and {3, 4, 5, 6, 7} into a new array. 
 The resulting array should be {3, 4, 5}.*/
