package ex3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();scanner.nextLine();


        System.out.println("Olá, " + nome + ", sua idade é " + idade + " anos");

        scanner.close();

    }
}