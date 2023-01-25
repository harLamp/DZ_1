// Вычислить сумму чисел от 1 до n, вычислить n! произведение чисел от 1 до n.



import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
    Scanner iScanner = new Scanner(System.in);
    System.out.printf("n: ");
    int n = iScanner.nextInt();
    iScanner.close();
    for (int i = 1;i <= n; i++) {
        if (i != n) {
            System.out.print(i + "+");
        } else {
            System.out.print(i + "=");
        }
    }
    System.out.print(n*(n+1)/2);
    }
}