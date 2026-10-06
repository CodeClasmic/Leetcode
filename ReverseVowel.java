class Solution {

    public String reverseVowels(String s) {

        // Convert the string to a character array for easy manipulation

        char[] chars = s.toCharArray();

        // A list to store the vowels

        List<Character> vowels = new ArrayList<>();

        

        // Step 1: Collect all vowels in the string

        for (char c : chars) {

            if (isVowel(c)) {

                vowels.add(c);

            }

        }

        

        // Step 2: Reverse the list of vowels

        Collections.reverse(vowels);

        

        // Step 3: Traverse the string again and replace vowels with the reversed vowels

        int vowelIndex = 0;

        for (int i = 0; i < chars.length; i++) {

            if (isVowel(chars[i])) {

                chars[i] = vowels.get(vowelIndex++);

            }

        }

        

        // Convert the character array back to a string and return

        return new String(chars);

    }

    

    // Helper method to check if a character is a vowel

    private boolean isVowel(char c) {

        return "aeiouAEIOU".indexOf(c) != -1;

    }

}

        
    
