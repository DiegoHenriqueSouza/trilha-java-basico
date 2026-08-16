package edu.diegodev.desafios.controlefluxo;

public class ExemploBreakContinue {

    /*
    Usando laço de repetição for e estrutura de decisao if
    que ao verificar durante o for o número igual a 3, com a condição break e continue as suas diferentes funcionalidades
     */

    public static void main(String[] args) {

        for (int numero = 1; numero <= 5; numero++){
            if (numero == 3){
                break; // Ao verificar o número igual a 3, ele para o sistema
            }
            System.out.println(numero);
        }

        for (int numero = 1; numero <= 5; numero ++){
            if (numero == 3){
                continue; // Ao verificar o número igual a 3 ele retorna para o laço.
            }
            System.out.println(numero);
        }

    }

}
