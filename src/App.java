import java.util.*;

public class App {
    // Write code that will:
    // 1. Store the following values in an ArrayList: 6, 3, 1, 2
    // The name of the ArrayList is up to you.
    // 2. Print the contents of your ArrayList using loops. This should work even if
    // I add more elements to your ArrayList. For example, I might add 7 to the
    // ArrayList and this should still work.

    public static void main(int[] args) throws Exception {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(6);
        numbers.add(3);
        numbers.add(1);
        numbers.add(2);

        for (int s : numbers)
            System.out.println(s);

    }

}
