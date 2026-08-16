package edu.diegodev.desafios.controlefluxo;

public class ExemploFor {

    /*
    Exemplo de laço usando for para contar Carneirinhos até o João dormir
    Segundo exemplo do laço serve para imprimir o indice e o nome dos alunos nas suas devidas posições dentro do array
     */

    public static void main(String[] args) {
//        for (int carneirinhos = 1; carneirinhos <= 20; carneirinhos++){
//            System.out.println("Contando Carneirinhos...." + carneirinhos);
//        }
//        System.out.println("Joãozinho Dormiu");

        String alunos[] = {"Diego", "Renan", "Heloisa", "Marcos", "David", "Agnaldo"};

        for (int x = 0; x < alunos.length; x++){
            System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
        }

        //forma abreviada
        for(String aluno : alunos){
            System.out.println("Nome do aluno é " + aluno);
        }

    }

}
