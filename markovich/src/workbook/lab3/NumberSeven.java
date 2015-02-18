package workbook.lab3;

/**
 * Создайте число. Определите, является ли последняя цифра числа семеркой.
 */

public class NumberSeven {
    public static void main(String[] args) {
        int num = 7;
        if (num % 10 == 7) {
            System.out.println("Да, является.");
        } else {
            System.out.println("Нет, не является.");
        }
    }
}