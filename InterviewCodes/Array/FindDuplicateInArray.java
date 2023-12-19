package InterviewCodes.Array;

import java.util.Arrays;
// we can also use cyclic sort for this check sorting package
public class FindDuplicateInArray {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 20, 50, 50};
//        findDuplicate(arr);  //brute force approach         o(n^2)
        Arrays.sort(arr);
        int arr2[]=findDuplicateUsingSortedArray(arr);
        System.out.println(Arrays.toString(arr2)); //little optimized approach  o(n)
    }

    //Brute force
    //return will return only single value and if got our output it will directly terminate the loop so if we
    //want to return multiple value then we need to use another array or list to store multiple element.
    static void findDuplicate(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                }
            }
        }
    }

    static int[] findDuplicateUsingSortedArray(int arr[]) {
        int [] duplicate=new int[arr.length];
        int count=0;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] == arr[i + 1]) {
                duplicate[count]=arr[i];
                count++;
            }
        }
        // Create a new array with only the duplicates (if the original array size is not needed)
        int result[]=Arrays.copyOf(duplicate,count);
        return result;

    }
}
/*
import java.util.HashSet;

static int findDuplicates(int[] arr) {
       public int findDuplicate(int[] arr) {
         HashSet<Integer> seen = new HashSet<>();
        for (int num : arr) {
        if (!seen.add(num)) {
        return num;
        }
        }
       return -1;
    }
        }
*/   //optimised approach solves the problem in o(n) time complexity.

/*
* Certainly, here are several approaches you can use to find duplicates in an array:

Nested Loop (Brute Force):

Use two nested loops to compare each element with every other element in the array. If a match is found, it means there's a duplicate. This approach has a time complexity of O(n^2).
Sorting and Comparing Adjacent Elements:

Sort the array first and then compare adjacent elements. If adjacent elements are the same, they are duplicates. This approach has a time complexity depending on the sorting algorithm used (e.g., O(n log n)).
HashSet:

Use a HashSet to keep track of unique elements in the array. While iterating through the array, if you encounter an element that is already in the HashSet, it's a duplicate. This approach has a time complexity of O(n) on average.
HashMap or Counting Array:

Use a HashMap or a counting array to store the count of each element in the array. Elements with a count greater than 1 are duplicates.
Floyd's Tortoise and Hare (Cycle Detection):

Apply the Floyd's Tortoise and Hare algorithm to detect a cycle in the array. The start of the cycle corresponds to the duplicate value. This approach has a time complexity of O(n) and is suitable for arrays with a limited range of values.
Custom Data Structure (e.g., Bit Array):

Use custom data structures, such as a bit array, to keep track of the occurrence of each element. If an element is encountered more than once, it's a duplicate.
Using Bit Manipulation:

XOR all elements in the array. The result will be the XOR of all the elements, and the bits that are set in the result represent the bits that are different between the duplicates.
Using a Linked List and a Set:

Create a linked list where each node corresponds to an element in the array. Use a HashSet to check if an element has been visited or not. When you encounter a node that is already in the set, it's a duplicate.
The choice of approach depends on the specific requirements of your problem, the characteristics of your data, and the trade-off between time complexity and ease of implementation.

* */