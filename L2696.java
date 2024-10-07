
//LeetCode->2969->Minimum String length after removing substrings ->

public class L2696 {
    public static int minLength(String s) {
        int writePtr = 0;
        char[] charArray = s.toCharArray();

        // Iterate over each character in the string
        for (int readPtr = 0; readPtr < s.length(); readPtr++) {
            // Write the current character to the current write position
            charArray[writePtr] = charArray[readPtr];

            // Check if we have a valid pattern to remove
            if (writePtr > 0 &&
                    (charArray[writePtr - 1] == 'A' ||
                            charArray[writePtr - 1] == 'C')
                    &&
                    charArray[writePtr] == charArray[writePtr - 1] + 1) {
                writePtr--;
            } else {
                writePtr++; // No match, so move the write pointer forward
            }
        }

        // The writePtr now represents the length of the remaining string
        return writePtr;
    }

    public static void main(String[] args) {
        String s = "ABACBC"; // Example input string
        int result = minLength(s);
        System.out.println("Minimum length of the modified string: " + result);
        // Output -> 4
    }
}

// ! Time Complexity = O(n)
// ! Space Complexity = O(n)