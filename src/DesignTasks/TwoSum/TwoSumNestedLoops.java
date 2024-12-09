package DesignTasks.TwoSum;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TwoSumNestedLoops {
    public static int[] twoSum(int[] nums, int target) {
        // Проходим по всем элементам массива
        for (int i = 0; i < nums.length; i++) {
            // Вложенный цикл начинается со следующего элемента после `i`
            for (int j = i + 1; j < nums.length; j++) {
                // Если сумма элементов nums[i] и nums[j] равна target, возвращаем их индексы
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
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
