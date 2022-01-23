import java.util.Scanner;

public class Palindrome {
    boolean isPalindrome(String text){
        int length = text.length()-1;
        int x=0;
        while(text.length() - 1 > x) {
            if(text.charAt(length) != text.charAt(x)) {
                return false;
            }
            length--;
            x++;
        }
        return true;
    }
    public static void main(String [] args){
        Palindrome pn = new Palindrome();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write a word: ");
        String text = scanner.nextLine();
        while(!text.matches("[a-zA-Z]+")){
            System.out.println("Please enter letters only !");
            text = scanner.nextLine();
        }
        if(pn.isPalindrome(text)){
            System.out.println("Word " + text + " is palindrome.");
        } else {
            System.out.println("Word " + text + " is not palindrome.");
        }
    }
}
