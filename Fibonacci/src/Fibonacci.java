import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (pertenceFibonacci(numero)) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci!");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci!");
        }
    }

    public static boolean pertenceFibonacci(int num) {
        if (num < 0) {
            return false; 
        }

        int x = 0, y = 1;

        while (y < num) {
            int processamento = y;
            y = x + y;
            x = processamento;
        }

        return y == num;
    }
}
