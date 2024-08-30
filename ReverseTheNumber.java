package Practice;

public class ReverseTheNumber {

        public long reverse_digit(long n) {
            // Code here
            String r = String.valueOf(n);
            StringBuilder reversedString = new StringBuilder();
            for (int i = r.length() - 1; i >= 0; i--) {
                char digit = r.charAt(i);
                reversedString.append(digit);
            }
            // Convert the reversed string back to a long
            return  Long.parseLong(reversedString.toString());
        }

        public static void main(String[] args) {
            ReverseTheNumber solution = new ReverseTheNumber();
            long n1 = 12345;
            long n2 = 1000;

            System.out.println("Reversed " + n1 + ": " + solution.reverse_digit(n1)); // Output: 54321
            System.out.println("Reversed " + n2 + ": " + solution.reverse_digit(n2)); // Output: 1
        }
    }


