import java.util.*;

class numberToWord {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        String s = Integer.toString(num);
        System.out.println(s.length());
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            switch (ch) {
                case '9':
                    System.out.print("NINE ");
                    break;
                case '8':
                    System.out.print("EIGHT ");
                    break;
                case '7':
                    System.out.print("SEVEN ");
                    break;
                case '6':
                    System.out.print("SIX ");
                    break;
                case '5':
                    System.out.print("FIVE ");
                    break;
                case '4':
                    System.out.print("FOUR ");
                    break;
                case '3':
                    System.out.print("THREE ");
                    break;
                case '2':
                    System.out.print("TWO ");
                    break;
                case '1':
                    System.out.print("ONE ");
                    break;
                case '0':
                    System.out.print("ZERO ");
                    break;
            }
        }
        sc.close();
    }
}
