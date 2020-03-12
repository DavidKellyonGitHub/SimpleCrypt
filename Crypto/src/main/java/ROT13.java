

public class ROT13  {
    char[] theLetters = new char[26];
    char[] allTheLetters = new char[52];

    public ROT13(Character cs, Character cf) {
    }

    public ROT13() {
    }


    public String crypt(String text) throws UnsupportedOperationException {
        return "";
    }

    public char[] makeLetters(){
        for (int i = 0;i<26;i++){
            this.theLetters[i] = (char) ('a' + i);
        }
        int counter = 0;
        for (int j = 0;j<2;j++){
            for(char letter : this.theLetters){
                this.allTheLetters[counter] = letter;
            }
        }
        System.out.println(allTheLetters);
        return this.allTheLetters;
    }
    public String encrypt(String text) {
        String resultString = "";
        makeLetters();
        char[] letters = text.toCharArray();
        for (char origLetter : letters) {
            int counter = 0;
            for (char letter : this.allTheLetters) {
                if (letter == origLetter) {
                    break;
                }
                counter++;
            }
            char encryptedLetter = this.allTheLetters[counter+13];
            resultString += encryptedLetter;
        }
        return resultString;
    }

    public String decrypt(String text) {
        return text;
    }

    public static String rotate(String s, Character c) {

        return "";
    }

}
