package edu.diegodev.desafios.controlefluxo;

import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {

    /*
    Usando while para verificar ao chamar o metodo valorAleatorio que gera um número aleatório de 2 a 20
    e "Adiciona no carrinho" o seu valor, tudo é somado até que a mesada se esgote
     */

    public static void main(String[] args) {

        double mesada = 50.0;
        while (mesada > 0){
            Double valorDoce = valorAleatorio();
            if (valorDoce > mesada){
                valorDoce = mesada;
            }
            System.out.println("Doce do valor: " + valorDoce + " Adicionado no carrinho");
            mesada -= valorDoce;
        }
        System.out.println("Mesada:" + mesada);
        System.out.println("Joãozinho gastou toda sua mesada em doces");

    }

    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2,20);
    }

}
