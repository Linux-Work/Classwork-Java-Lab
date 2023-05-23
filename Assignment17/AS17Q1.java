class UserString {
    private String str;
    
    public UserString(String str) {
        this.str = str;
    }

    public int countCharacters() {
        return str.length();
    }
    
    public int countWords() {
        String[] words = str.split("\\s+");
        return words.length;
    }
    
    public boolean compareStrings(String otherStr) {
        return str.equals(otherStr);
    }
    
    public String toUpperCase() {
        return str.toUpperCase();
    }
    
    public String toLowerCase() {
        return str.toLowerCase();
    }
    
    public String concatenate(String otherStr) {
        return str.concat(otherStr);
    }
    
    public boolean isPalindrome() {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
    
    public int findPosition(char c) {
        return str.indexOf(c);
    }
    
    public String makeSubstring(int start, int end) {
        return str.substring(start, end);
    }
    
    public boolean searchSubstring(String subStr) {
        return str.contains(subStr);
    }
    
    public String replaceSubstring(String oldStr, String newStr) {
        return str.replace(oldStr, newStr);
    }
    
    public String swapSubstrings(String str1, String str2, int start1, int end1, int start2, int end2) {
        String subStr1 = str1.substring(start1, end1 + 1);
        String subStr2 = str2.substring(start2, end2 + 1);
        str1 = str1.substring(0, start1) + subStr2 + str1.substring(end1 + 1);
        str2 = str2.substring(0, start2) + subStr1 + str2.substring(end2 + 1);
        return str1 + " " + str2;
    }
}
public class AS17Q1 {
    public static void main(String[] args) {
        UserString userStr = new UserString("Hello world");

        int charCount = userStr.countCharacters();
        System.out.println("Number of characters: " + charCount);

        int wordCount = userStr.countWords();
        System.out.println("Number of words: " + wordCount);

        boolean equalStrings = userStr.compareStrings("hello world");
        System.out.println("Are the strings equal? " + equalStrings);

        String upperCase = userStr.toUpperCase();
        System.out.println("Uppercase string: " + upperCase);

        String lowerCase = userStr.toLowerCase();
        System.out.println("Lowercase string: " + lowerCase);

        String concatenated = userStr.concatenate("!");
        System.out.println("Concatenated string: " + concatenated);

        boolean palindrome = userStr.isPalindrome();
        if(palindrome){
            System.out.println("The string is a palindrome.");
        }else{
            System.out.println("The string is not a palindrome.");
        }

        int position = userStr.findPosition('o');
        System.out.println("Position of 'o': " + position);

        String subString = userStr.makeSubstring(3, 7);
        System.out.println("Substring: " + subString);

        boolean contains = userStr.searchSubstring("world");
        if (contains) {
            System.out.println("The string contains 'world'.");
        } else {
            System.out.println("The string does not contain 'world'.");
        }

        String replaced = userStr.replaceSubstring("world", "Java");
        System.out.println("String after replacement: " + replaced);

        String str1 = "Java programming";
        String str2 = "is fun";
        String swapped = userStr.swapSubstrings(str1, str2, 6, 12, 0, 1);
        System.out.println("Swapped strings: " + swapped);
    }
}