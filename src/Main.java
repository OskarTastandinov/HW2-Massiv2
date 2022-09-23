import java.sql.Array;
import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int[] expenses = generateRandomArray();
        System.out.println(Arrays.toString(expenses));
        System.out.println("Задание 1.0");
        int sum = 0;
        for ( int expense : expenses){
            sum = expense + expense;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");


        System.out.println("Задание 2");

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int expense : expenses){
            if (expense > max){
                expense = max;
            }
            if (expense < min){
                min = expense;
            }
        }

        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за день составила " + max + " рублей");
        System.out.println("Задание 3");

        double averageExp = sum / expenses.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageExp +  " рублей");

        System.out.println("Задание 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length -1; i >= 0; i--){
            System.out.print(reverseFullName[i]);
        }
    }



    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
            System.out.println();
        }
        return arr;
    }

}
