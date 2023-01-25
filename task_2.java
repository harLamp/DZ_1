// Вывести все простые числа от 1 до 1000.

import java.util.Scanner;

public class task_2 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите число, до которого должны быть вычислены простые числа: ");
            int input = iScanner.nextInt();
            int count = 0;    
            // loop through the numbers one by one
            for (int i = 2; i < input; i++) {    
            boolean isPrimeNumber = true;    
// check to see if the number is prime
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isPrimeNumber = false;
                        break; // exit the inner for loop
                    }
                }    
                // print the number if prime
            if (isPrimeNumber) {
                count++;
                System.out.print(i + ", ");
    
                }
    
            }
        System.out.println("Count: " + count);
        iScanner.close();
    }
}
    


