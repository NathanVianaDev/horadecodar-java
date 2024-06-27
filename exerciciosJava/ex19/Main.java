package ex19;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        double num1 = scanner.nextDouble();scanner.nextLine();

        System.out.println("Digite o segundo numero: ");
        double num2 = scanner.nextDouble();scanner.nextLine();

        System.out.println("Digite o terceiro numero: ");
        double num3 = scanner.nextDouble();scanner.nextLine();

        if (num1 < (num2 + num3) && num2 < (num1 + num3) && num3 < (num2 + num1)){
            System.out.println("Foi possível formar um triângulo! ");
            return;
        }
        System.out.println("Não foi possível formar um triângulo! ");

        scanner.close();
    }
}