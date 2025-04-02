
package com.trilhajavabasico;

import java.util.Scanner;

// Classe ContaTerminal
// Esta classe é responsável por criar uma conta bancária simples
// e exibir as informações do cliente.
// Autor: Jorge Lucas   
// Data: 01/04/2025 
public class ContaTerminal {
    public static void main(String[] args) {
        int numeroConta;
        String numeroAgencia;
        String nomeCliente;
        double saldo;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Bem-vindo ao banco!");
            System.out.print("Por favor, digite o número da conta: ");
            numeroConta = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha
            System.out.print("Digite o número da Agência: ");
            numeroAgencia = scanner.nextLine();
            System.out.print("Digite o seu nome: ");
            nomeCliente = scanner.nextLine();
            System.out.print("Digite o saldo inicial: ");
            saldo = scanner.nextDouble();
        }

        System.out.println("Olá, " + nomeCliente + "! Obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é: " + numeroAgencia);
        System.out.println("Seu número de conta é: " + numeroConta);
        System.out.printf("Seu saldo é: R$ %.2f%n", saldo);
        System.out.println("Aproveite nossos serviços!");
        System.out.println("Se precisar de ajuda, entre em contato com nosso suporte.");
        System.out.println("Estamos aqui para ajudar você a alcançar seus objetivos financeiros.");
        System.out.println("Tenha um ótimo dia!");

    }
}