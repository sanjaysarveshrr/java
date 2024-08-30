package Practice;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collections;

public class DistinctDigitsInArray {
    public int[] common_digits(int[] nums) {
            HashSet<Integer> digits = new HashSet<>();

            for (int num : nums) {
                while (num > 0) {
                    int digit = num % 10;
                    digits.add(digit);
                    num /= 10;
                }
            }

            ArrayList<Integer> res = new ArrayList<>(digits);
            Collections.sort(res);  // Sort the digits

            int[] result = new int[res.size()];
            for (int i = 0; i < res.size(); i++) {
                result[i] = res.get(i);
            }

            return result;
        }

        public static void main(String[] args) {
            DistinctDigitsInArray solution = new DistinctDigitsInArray();

            int[] nums = {131, 11, 48};
            int[] result = solution.common_digits(nums);

            for (int digit : result) {
                System.out.print(digit + " ");
            }
        }
    }

