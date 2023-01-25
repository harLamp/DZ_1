// Реализовать простой калькулятор (операции + - / * ).

import java.util.Scanner;
public class task_3 {
    public static void main(String[] args) {
      double num1;
      double num2;
      double ans;
      char op;
      Scanner iScanner = new Scanner(System.in);
      System.out.println("Введите первое число: ");
      num1 = iScanner.nextDouble();
      System.out.println("Введите второе число: ");
      num2 = iScanner.nextDouble();
      System.out.print("\nВведите оператор (+, -, *, /): ");
      op = iScanner.next().charAt(0);
      switch(op) {
         case '+': ans = num1 + num2; 
            break;
         case '-': ans = num1 - num2;
            break;
         case '*': ans = num1 * num2;
            break;
         case '/': ans = num1 / num2;
            break;
         default:  System.out.printf("Ошибка! Введите правильный оператор");
            return;
        }
    System.out.print("\nРезультат получается следующим образом:\n");
    System.out.printf(num1 + " " + op + " " + num2 + " = " + ans);
   }
}
    
