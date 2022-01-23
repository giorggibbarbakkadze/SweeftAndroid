import java.util.Scanner;

public class CountVariants {
    int countVariants(int stairsCount) {
        int current = 1;
        int prev = 0;
        for (int i = 0; i < stairsCount-1; i++) {
            prev = current - prev;
            current = current + prev;
        }
        return current;
    }
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of stairs: ");
        while (!scanner.hasNextInt()){
            System.out.print("Input is not a integer.\n" +
                    "Please enter integer only: ");
            scanner.nextLine();
        }
        int stairsCount = scanner.nextInt();
        CountVariants c = new CountVariants();
        System.out.println("There are " + c.countVariants(stairsCount) + " possible ways to reach the " + stairsCount + " floor stairs.");
    }
}
