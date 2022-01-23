import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NotContains {
    static int [] array = {5, 1, 2, 3, 4, 6, 7, 8, 9, 11, 12, 13, 14, 15, -5, 6, -10, 0, 10, 70};
    static int length = array.length;

    int notContains(int[] array) {
        List<Integer> x = new ArrayList<>();
        for (int i = length - 1; i >= 0; i--) {
            if (array[i] > 0) {
                x.add(array[i]);
            }
        }
        int min = 1;
        while (x.contains(min)){
            min ++;
        }
        return min;
    }
    public static void main(String [] args){
        NotContains z = new NotContains();
        System.out.println("Given array is " + Arrays.toString(array) + ".");
        System.out.println("The Smallest positive integer that does not contain in the given array is " +z.notContains(array) + ".");
    }
}
