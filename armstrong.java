package Practice;
import java.util.*;

public class armstrong {

        static boolean isArmstrong(int N) {
            // Convert number to string to count digits
            String numStr = String.valueOf(N);
            int numDigits = numStr.length();

            int sum = 0;
            int originalN = N;

            // Compute sum of powers of digits
            while (N > 0) {
                int digit = N % 10;
                sum += (int) Math.pow(digit, numDigits);
                N /= 10;
            }

            // Check if sum equals the original number
            return sum == originalN;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            if (isArmstrong(num)) {
                System.out.println(num + " is an Armstrong number.");
            } else {
                System.out.println(num + " is not an Armstrong number.");
            }
        }
    }


