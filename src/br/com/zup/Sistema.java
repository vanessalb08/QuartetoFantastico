package br.com.zup;

import java.util.Scanner;

public class Sistema {

    private static Scanner capturarDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    public static void menu() {
        System.out.println("\n*** Bem vindo à livraria Cara de Livro ***");
        System.out.println("\t\tTOP STOKE SYSTEM");
        System.out.println("Digite [1] para cadastrar um livro ao estoque.");
        System.out.println("Digite [2] para vender um livro.");
        System.out.println("Digite [3] para verificar um livro no estoque.");
        System.out.println("Digite [4] para sair do sistema.");
    }

    public static Livro cadastrarLivros(){
        System.out.println("=================================================================");
        String codigoISBN = capturarDados("Digite o Código do livro(ISBN): ").nextLine();
        String nomeDoLivro = capturarDados("Digite o Nome do livro: ").nextLine();
        String autor = capturarDados("Digite o autor do livro: ").nextLine();
        String editora = capturarDados("Digite a editora do livro: ").nextLine();
        double precoLivro = capturarDados("Digite o preço do livro").nextDouble();
        Livro livrocadastrado = new Livro(codigoISBN,nomeDoLivro,autor,editora,precoLivro);
        System.out.println("====================================================================");
        System.out.println("Já tiramos o livro no deposito!!!");
        System.out.println("=====================================================================");
        System.out.println(livrocadastrado);
        return livrocadastrado;
    }

    public static Cliente cadastrarCliente(){
        String nome = capturarDados("Digite o nome do cliente.").nextLine();
        String cpf = capturarDados("Digite o CPF do cliente.").nextLine();
        String telefone = capturarDados("Digite o telefone do cliente.").nextLine();
        Cliente cliente = new Cliente(nome,cpf,telefone);
        System.out.println("Cliente cadastrado com sucesso!");
        return cliente;
    }

    //Cadastrar funcionário responsável pela venda
    public static Funcionario cadastrarFuncionario(){
        System.out.println("------------------------------------------");
        String nomeFuncionario = capturarDados("Digite o nome do funcionário que realizou a venda:").nextLine();
        String cpfFuncionario = capturarDados("Digite o cpf do funcionário:").nextLine();
        String telefoneFuncionario = capturarDados("Digite o telefone do cpf").nextLine();

        Funcionario funcionario = new Funcionario(nomeFuncionario,cpfFuncionario,telefoneFuncionario);
        System.out.println("Funcionário cadastrado");
        System.out.println(funcionario);
        return funcionario;
    }


}
