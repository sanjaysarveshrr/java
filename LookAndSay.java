package Practice;

public class LookAndSay {
    public static void main(String[] args) {
        int numTerms = 10; // Number of terms to generate

        String currentTerm = "1"; // Start with the seed value "1"
        System.out.println("1"); // Print the first term

        for (int i = 2; i <= numTerms; i++) {
            currentTerm = generateNextTerm(currentTerm);
            System.out.println(currentTerm); // Print each term in the sequence
        }
    }

    // Function to generate the next term in the look and say sequence
    public static String generateNextTerm(String currentTerm) {
        StringBuilder nextTerm = new StringBuilder();
        char digit = currentTerm.charAt(0);
        int count = 1;

        for (int i = 1; i < currentTerm.length(); i++) {
            if (currentTerm.charAt(i) == digit) {
                count++;
            } else {
                nextTerm.append(count).append(digit);
                digit = currentTerm.charAt(i);
                count = 1;
            }
        }

        // Append the last sequence of digits
        nextTerm.append(count).append(digit);

        return nextTerm.toString();
    }
}

