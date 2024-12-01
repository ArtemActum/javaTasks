package HomeWork3.Task3;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void removeEvenNumbers(List<Integer> list) {
        list.removeIf(num -> num % 2 == 0);
    }
}
