package DesignTasks.TwoSum;

/*
Задача 1:
 Сумма двух(Two Sum): Дан массив целых чисел nums и целое число target. Найдите два числа в массиве так, чтобы их сумма была равна target. Верните их индексы.
 Вы можете предположить, что каждый вход будет иметь ровно одно решение, и вы не можете использовать один и тот же элемент дважды. Вы можете вернуть ответ в любом порядке.
 Вход: nums = [2, 7, 11, 15], target = 9 Выход: [0, 1] Выход объяснение: nums[0] + nums[1] == 9, мы возвращаем [0, 1].
*/

import org.junit.jupiter.api.Test;


import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class TwoSumHashMap {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numbers = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numbers.containsKey(complement)) {
                return new int[]{
                        numbers.get(complement), i
                };

            }
            numbers.put(nums[i], i);
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);

        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }

    @Test
    public void testExampleCase() {
        int[] nums = {1, 2, 3, 15};
        int target = 3;
        int[] expected = {0, 1};

        assertArrayEquals(expected, twoSum(nums, target));
    }

    @Test
    public void testNegativeNumbers() {
        int[] nums = {-3, 4, 3, 90};
        int target = 0;
        int[] expected = {0, 2};

        assertArrayEquals(expected, twoSum(nums, target));
    }
}

