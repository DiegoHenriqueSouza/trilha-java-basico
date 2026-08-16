package edu.diegodev.desafios.controlefluxo;

public class ResultadoEscolar {
    /*
    Estrutura condicional composta usando Condição Ternária
     */
    public static void main(String[] args) {
        int nota = 3;

        //Condição ternária abaixo simplifica o uso de if e else.
        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota <7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);

    }
}
