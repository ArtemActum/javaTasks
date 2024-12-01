package HomeWork3.Task5;

import java.util.LinkedList;
import java.util.Queue;


public class ArrayRotation {

    public static int[] rotateArray(int[] arr, int n) {
        int length = arr.length;


        if (length == 0 || n == 0) {
            return arr;
        }


        n = n % length;


        Queue<Integer> queue = new LinkedList<>();
        for (int num : arr) {
            queue.add(num);
        }


        for (int i = 0; i < n; i++) {
            int num = queue.poll();
            queue.add(num);
        }


        int[] rotatedArray = new int[length];
        int index = 0;
        while (!queue.isEmpty()) {
            rotatedArray[index++] = queue.poll();
        }

        return rotatedArray;
    }
}
