    package Practice;
    import java.util.Arrays;
    public class FindClosestSumInArray {

            public static int threeSumClosest(int[] arr, int target) {
                Arrays.sort(arr);  // Sort the array
                int closestSum = Integer.MAX_VALUE / 2;  // Initialize with a large value to ensure it gets updated

                // Iterate through the array, considering each element as the first element of the triplet
                for (int i = 0; i < arr.length - 2; i++) {
                    int left = i + 1;  // Initialize the left pointer
                    int right = arr.length - 1;  // Initialize the right pointer

                    // Use two-pointer technique to find the closest sum
                    while (left < right) {
                        int currentSum = arr[i] + arr[left] + arr[right];  // Sum of the triplet

                        // If currentSum is closer to target than closestSum, update closestSum
                        if (Math.abs(currentSum - target) < Math.abs(closestSum - target) ||
                                (Math.abs(currentSum - target) == Math.abs(closestSum - target) && currentSum > closestSum)) {
                            closestSum = currentSum;
                        }

                        // Move pointers based on comparison with target
                        if (currentSum < target) {
                            left++;  // Move left pointer to the right to increase the sum
                        } else {
                            right--;  // Move right pointer to the left to decrease the sum
                        }
                    }
                }

                return closestSum;  // Return the closest sum found
            }

            public static void main(String[] args) {
                int[] arr1 = { -7, 9, 8, 3, 1, 1 };
                int target1 = 2;
                System.out.println(threeSumClosest(arr1, target1));  // Output: 2

                int[] arr2 = { 5, 2, 7, 5 };
                int target2 = 13;
                System.out.println(threeSumClosest(arr2, target2));  // Output: 14
            }
        }


