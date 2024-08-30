package Practice;

public class prime {
        static class Solution {
            static int isPrime(int N) {
                // Handling edge cases
                if (N <= 1) {
                    return 0; // Not prime
                }
                if (N <= 3) {
                    return 1; // 2 and 3 are prime
                }
                if (N % 2 == 0 || N % 3 == 0) {
                    return 0; // Divisible by 2 or 3, not prime
                }

                // Check for numbers of the form 6k ± 1 up to sqrt(N)
                for (int i = 5; i * i <= N; i += 6) {
                    if (N % i == 0 || N % (i + 2) == 0) {
                        return 0; // Not prime
                    }
                }

                return 1; // Prime
            }
        }

        public static void main(String[] args) {
            // Example usage:
            int num = 29;
            for(int i=0;i<num;i++) {
                if (Solution.isPrime(i) == 1) {
                    System.out.println(i + " is prime");
                } else {
                    System.out.println(i + " is not prime");
                }
            }
        }
    }


