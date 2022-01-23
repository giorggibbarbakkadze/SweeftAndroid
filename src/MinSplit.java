import java.util.Scanner;

public class MinSplit {
    static int[] arrAmount = {1, 5, 10, 20, 50};
    static int amountLength = arrAmount.length;


    int minSplit(int amount) {
        int counter = 0;
        for (int i = amountLength - 1; i > 0 ; i--) {
            while (amount >= arrAmount[i]){
                amount -=arrAmount[i];
                counter ++;
            }
            if (amount < 5){
                while (amount != 0){
                    amount -= 1;
                    counter++;
                }

            }
        }
        return counter;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount of monet in georgian 'tetri': ");
        while (!scanner.hasNextInt()) {
            System.out.print("Input is not a number.\n" +
                    "Please enter the correct value: ");
            scanner.nextLine();
        }
        int amountInput = scanner.nextInt();
        MinSplit min = new MinSplit();
        System.out.print("It takes " + min.minSplit(amountInput) + " coins to break down " + amountInput + " tetri.");




    }
}
