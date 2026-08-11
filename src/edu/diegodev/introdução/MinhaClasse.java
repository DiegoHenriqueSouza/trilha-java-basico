package edu.diegodev.introdução;

public class MinhaClasse {

    public static void main(String[] args) {

        int senha = 8485224;

        String stringSenha = senhaForte(senha);

        System.out.println(stringSenha);

    }

    public static String senhaForte (int senha) {

        return String.valueOf(senha);

    }

}
