package edu.diegodev.desafios.controlefluxo;

import java.util.Random;

public class ExemploDoWhile {

    /*
    Executa pelo menos uma ligação com o uso do 'do While',
    e gera um número inteiro aleatório até 10
    o metodo boolean tocando só retorna true quando o número aleatório seja igual a 1
     */

    public static void main(String[] args) {
        System.out.println("Discando...");

        do {
            // executando repetidas vezes até alguem atender
            System.out.println("Telefone tocando");
        }while (tocando());

        System.out.println("Alo !!!");

    }

    private static boolean tocando(){
        boolean atendeu = new Random().nextInt(10) == 1;
        System.out.println("Atendeu? " + atendeu);
        // negando o ato de continuar tocando pós atendeu for == 1
        return ! atendeu;
    }

}
