package HomeWork1;

public class LiveCoding {
    public static int sumArray(int[] array){
        int sum = 0;
        for (int num : array){
            sum = sum + num;
        }
        return sum;
    }

    public static String reverseString(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int result =sumArray(numbers);
        System.out.println("Сумма элементов массива: " + result);

        String original = "Hello, World!";
        String reversed = reverseString(original);
        System.out.println("Оригинальная строка: " + original);
        System.out.println("Перевернутая строка: " + reversed);

    }
}
