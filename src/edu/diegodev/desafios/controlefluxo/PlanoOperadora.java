package edu.diegodev.desafios.controlefluxo;

public class PlanoOperadora {

    /*
    Estrutura condicional usando switch(case)
     */

    public static void main(String[] args) {

        String plano = "Total"; // Variavel plano guarda o tipo de plano de operadora

//        if (plano == "B"){ // EXEMPLO COM IF (se)
//            System.out.println("100 minutos de ligação");
//        } else if (plano == "M") {
//            System.out.println("100 minutos de ligação");
//            System.out.println("Whats e Instagram grátis");
//        } else if (plano == "T") {
//            System.out.println("100 minutos de ligação");
//            System.out.println("Whats e Instagram grátis");
//            System.out.println("5Gb Youtube");
//        }

        switch (plano){ /*Verifica em qual caso a variavel plano se encaixa e imprime todas as outras funcionalidades dos planos menores caso seja melhor que o basico.
         Evitando repetição de print.
        */
            case "Total":
                System.out.println("5Gb Youtube");
            case "Medio":
                System.out.println("Whats e Instagram grátis");
            case "Basico":
                System.out.println("100 minutos de ligação");
        }

    }

}
