package edu.diegodev.desafios.controlefluxo;

public class SistemaMedida {

    /*
     Demonstração de estrutura condicional com switch(case) usando break para parar a verificação.
     */

    public static void main(String[] args) {

        String sigla = "A";

//        if (sigla == "P") {
//            System.out.println("PEQUENO");
//        } else if (sigla == "M") {
//            System.out.println("MÉDIO");
//        } else {
//            System.out.println("GRANDE");
//        }

        switch (sigla){
            case "P":
                System.out.println("PEQUENO");
                break;
            case "M":
                System.out.println("MÉDIO");
                break;
            case "G":
                System.out.println("GRANDE");
                break;
            default:
                System.out.println("OPÇÃO INVÁLIDA");
        }


    }

}
