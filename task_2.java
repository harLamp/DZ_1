// Вывести все простые числа от 1 до 1000.

import java.util.Scanner;

public class task_2 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите число, до которого должны быть вычислены простые числа: ");
        int input = iScanner.nextInt();    
        iScanner.close();
        for (int i = 1; i < input; i++) {        
            System.out.print(i + ", ");
        }
    }
}
