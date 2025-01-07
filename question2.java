// Author trisha

class question2 {
    public static void main(String[] args) {
        VowelsAndConsonants(args);               //Main method
    }

     static void VowelsAndConsonants(String[] args) {
        if (args.length == 0) {
            return;
        }                                //method for counting vowels and consonants in name
        String name = args[0];
        int vowel = 0;
        int consonant = 0;
        name = name.toLowerCase();
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowel++;
            } else {
                consonant++;
            }
        }
        System.out.println("Number of vowels are: " + vowel);
        System.out.println("Number of consonants are: " + consonant);
    }
}