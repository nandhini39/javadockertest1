public class AlphabetMultiplier {
    public static void main(String[] args) {
        // Loop through the English alphabet (A to Z)
        for (char letter = 'A'; letter <= 'Z'; letter++) {
            // Get the position of the letter in the alphabet (1 for A, 2 for B, ..., 26 for Z)
            int letterPosition = letter - 'A' + 1;
            
            // Print the alphabet letter and its multiplication with numbers from 1 to 10
            System.out.print(letter + ": ");
            for (int i = 1; i <=

