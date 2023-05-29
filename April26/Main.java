class UserString {
    String s;

    public UserString() {
        s = "Mohitur";
    }

    public UserString(String s) {
        this.s = s;
    }

    int charCount() {
        return s.length();
    }

    int countVowel() {
        int p = s.length();
        int i = 0, count = 0;
        while (i < p) {

            if (s.charAt(i) == 'a' || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'e'
                    || s.charAt(i) == 'I'
                    || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'O' || s.charAt(i) == 'U'
                    || s.charAt(i) == 'u')
                count++;
            i++;
        }
        return count;
    }
}

public class Main {
    public static void main(String[] args) {
        UserString name = new UserString();
        UserString name2 = new UserString("Sayan");
        System.out.println("length of string :" + name.charCount());
        System.out.println("no of vowel :" + name.countVowel());
        System.out.println("length of string :" + name2.charCount());
        System.out.println("no of vowel :" + name2.countVowel());
    }
}
