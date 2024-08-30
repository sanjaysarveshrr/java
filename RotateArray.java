package Practice;
import java.util.*;

public class RotateArray {

        // Function to rotate the array to the left by k steps
        public static void rotateLeft(int[] arr, int k) {
            int n = arr.length;
            k = k % n; // Effective rotations if k is larger than n

            // Reverse the entire array
            reverse(arr, 0, n - 1);

            // Reverse the first k elements
            reverse(arr, 0, k - 1);

            // Reverse the remaining elements
            reverse(arr, k, n - 1);
        }

        // Utility function to reverse a portion of the array from index start to end
        private static void reverse(int[] arr, int start, int end) {
            while (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Reading input
            int n = scanner.nextInt(); // Size of array
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            int k = scanner.nextInt(); // Number of rotations

            // Rotate the array
            rotateLeft(arr, k);

            // Print the rotated array
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();

            scanner.close();
        }
    }


