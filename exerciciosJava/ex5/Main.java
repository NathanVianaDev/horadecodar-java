package ex5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor: ");
        int num = scanner.nextInt();scanner.nextLine();

        if (num < 0 ){
            System.out.println("Valor negativo");
        } else if (num == 0) {
            System.out.println("Valor neutro");
        } else if (num > 1) {
            System.out.println("Valor positivo");
        }

        scanner.close();
    }
}
