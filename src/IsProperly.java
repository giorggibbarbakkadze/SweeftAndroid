import java.util.Scanner;

public class IsProperly {
    boolean isProperly(String sequence) {
        int length = sequence.length();
        int counter = 0;
        for (int i = 0; i < length; i++) {
            char y = sequence.charAt(i);
            if (y == '(') {
                counter++;
            } else {
                counter--;
            }
            if (counter < 0){
                return false;
            }
        }
        return counter == 0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the sequence of parenthesis: ");
        String sequence = scanner.nextLine();
        IsProperly z = new IsProperly();
        if (z.isProperly(sequence)) {
            System.out.println("The sequence of parenthesis," + " '"  + sequence + "' " + " is entered correctly.");
        }
        else {
            System.out.println("The sequence of parenthesis" + " '" + sequence +  "' " + " is entered incorrectly.");
        }
    }
}
