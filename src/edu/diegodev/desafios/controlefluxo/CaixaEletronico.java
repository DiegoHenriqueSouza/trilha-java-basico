package edu.diegodev.desafios.controlefluxo;

public class CaixaEletronico {

    /*
    Exercicio basico De Condicional Simples com If e Else
     */

    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 20.0;

        if (valorSolicitado < saldo) { // Verifica se(if) valorSolicitado é menor que o saldo
            saldo -= valorSolicitado;
            System.out.println("Novo saldo: R$" + saldo);
        }else { // Se(if) não imprime Saldo Insuficiente
            System.out.println("Saldo insuficiente");
        }
    }

}
