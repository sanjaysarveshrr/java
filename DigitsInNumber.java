package Practice;

public class DigitsInNumber {

        public int countDividingDigits(int N) { // code here
            int c=0;
            String n= String.valueOf(N);
            for(int i=0;i<n.length();i++){
                int digit = n.charAt(i) - '0';

                if(digit != 0 && (N % digit) == 0){
                    c++;
                }
            }
            return c;
        }

        public static void main(String[] args) {
            DigitsInNumber solution = new DigitsInNumber();

            // Test case
            int N = 12;

            System.out.println("Count for " + N + ": " + solution.countDividingDigits(N)); // Expected output: 2
        }
    }


