package ex13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int valorTotal = 0;
        int media = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro: ");
        int num1 = scanner.nextInt();scanner.nextLine();
        System.out.println("Digite o segundo número inteiro: ");
        int num2 = scanner.nextInt();scanner.nextLine();

        for (int i = num1; i < num2; i++) {
            valorTotal += i;
            media++;
        }

        System.out.println("Média: " + (valorTotal / media) );

        scanner.close();

    }
}