package Practice;

import java.math.BigInteger;

public class AddBigInteger {
    public static void main(String[] args) {

        String str1 = "12345678901234567890";
        String str2 = "98765432109876543210";

        // Convert the strings to BigInteger
        BigInteger num1 = new BigInteger(str1);
        BigInteger num2 = new BigInteger(str2);

        // Add the numbers
        BigInteger sum = num1.add(num2);

        // Convert the result back to a string
        String result = sum.toString();

        System.out.println("The sum is: " + result); // Output: The sum is: 111111111011111111100
    }
}



