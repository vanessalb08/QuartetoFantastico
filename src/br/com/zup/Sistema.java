package br.com.zup;

import java.util.Scanner;

public class Sistema {

    private static Scanner capturarDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    public static void menu() {
        System.out.println("*** Bem vindo à livraria Cara de Livro ***");
        System.out.println("TOP STOKE SYSTEM");
        System.out.println("Digite 1 para cadastrar um livro ao estoque.");
        System.out.println("Digite 2 para vender um livro.");
        System.out.println("Digite 3 para verificar um livro no estoque.");
        System.out.println("Digite 4 para sair do sistema.");
    }

}
