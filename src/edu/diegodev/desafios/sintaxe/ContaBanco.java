package edu.diegodev.desafios.sintaxe;

import java.math.BigDecimal;
import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) {
    // Importando a Classe Scanner para receber informações pelo terminal
        Scanner scanner = new Scanner(System.in);
    // Exibindo mensagens para o usuario
        System.out.println("===== CRIANDO SUA CONTA NA DIOBANK");
        System.out.println("Por favor, Digite o numero da conta");
    // Obtendo pela Scanner, os valores digitados no terminal
        int numeroConta = Integer.parseInt(scanner.nextLine());
        System.out.println("Por favor, Digite o numero da agencia");
        String numeroAgencia = scanner.nextLine();
        System.out.println("Por favor, Digite seu Nome");
        String nomeCliente = scanner.nextLine();
        System.out.println("Qual seu saldo ?");
        BigDecimal saldo = new BigDecimal(scanner.nextLine());
    //  Exibir a mensagem conta criada
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo R$" + saldo + " já está disponível para saque.");

    }
}
