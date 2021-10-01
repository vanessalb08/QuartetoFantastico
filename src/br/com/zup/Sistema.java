package br.com.zup;

import java.util.ArrayList;
import java.util.List;
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
        System.out.println("Digite [3] para exibir catálogo de livros");
        System.out.println("Digite [4] para sair do sistema.");
    }

    public static Livro cadastrarLivros() {


        System.out.println("=================================================================");
        String codigoISBN = capturarDados("Digite o Código do livro(ISBN): ").nextLine();
        String nomeDoLivro = capturarDados("Digite o Nome do livro: ").nextLine();
        String autor = capturarDados("Digite o autor do livro: ").nextLine();
        String editora = capturarDados("Digite a editora do livro: ").nextLine();
        double precoLivro = capturarDados("Digite o preço do livro").nextDouble();
        Livro livrocadastrado = new Livro(codigoISBN, nomeDoLivro, autor, editora, precoLivro);
        System.out.println("====================================================================");
        System.out.println("\t Livro Cadastrado ao Estoque!!!");
        System.out.println("=====================================================================");

        return livrocadastrado;
    }

    //Cadastrar Cliente pela venda
    public static Cliente cadastrarCliente() {
        System.out.println("=================================================================");
        String nome = capturarDados("Digite o nome do cliente.").nextLine();
        String cpf = capturarDados("Digite o CPF do cliente.").nextLine();
        String telefone = capturarDados("Digite o telefone do cliente.").nextLine();
        Cliente cliente = new Cliente(nome, cpf, telefone);
        System.out.println("=================================================================");
        System.out.println("\t\tCliente cadastrado com sucesso!");
        System.out.println("=================================================================");
        return cliente;
    }

    public static Venda realizarVendaAVista(Livro livro) {
        Venda novaVenda = new Venda();
        novaVenda.venderAVista(livro);
        return novaVenda;
    }

    public static Venda realizarVendaAPrazo(Livro livro) {
        Venda novaVenda = new Venda();
        novaVenda.venderAPrazo(livro);
        return novaVenda;
    }

    //Cadastrar funcionário responsável pela venda
    public static Funcionario cadastrarFuncionario() {
        System.out.println("=================================================================");
        String nomeFuncionario = capturarDados("Digite o nome do funcionário que realizou a venda:").nextLine();
        String cpfFuncionario = capturarDados("Digite o cpf do funcionário:").nextLine();
        String telefoneFuncionario = capturarDados("Digite o telefone do cpf").nextLine();

        Funcionario funcionario = new Funcionario(nomeFuncionario, cpfFuncionario, telefoneFuncionario);
        System.out.println("=================================================================");
        System.out.println("\t\tFuncionário cadastrado");
        System.out.println("=================================================================");
        System.out.println(funcionario);
        System.out.println("=================================================================");
        return funcionario;
    }

    public static List livrosNaLista() {
        List<Livro> livrosL = new ArrayList<>();
        System.out.println("*******************************************************");
        int numLivros = capturarDados("Digite o número de livros a cadastrar").nextInt();
        for (int i = 0; i < numLivros; i++) {
            livrosL.add(cadastrarLivros());

        }
        return livrosL;
    }

    public static Estoque criarEstoque() {
        Estoque estoque = new Estoque(livrosNaLista());
        return estoque;
    }

    public static void executar() {
        boolean menu = true;
        Livraria caraDeLivro = new Livraria();
        List<Estoque> topStoke = new ArrayList<>();

        while (menu) {
            menu();
            int opcaoDesejada = capturarDados("Digite a opção que deseja: ").nextInt();
            if (opcaoDesejada == 1) {
                Estoque estoque = criarEstoque();
                topStoke.add(estoque);

            } else if (opcaoDesejada == 2) {
                caraDeLivro.cadastrarCliente(cadastrarCliente());
                caraDeLivro.cadastrarFucnionario(cadastrarFuncionario());
                String pegarISBN = capturarDados("Digite o código ISBN do livro desejado").nextLine();
                System.out.println("[1] tipo de Venda a prazo 10% acréscimo");
                System.out.println("[2] tipo de Venda a vista 5% desconto");

                int tipoDeVenda = capturarDados("Indique o tipo de venda: ").nextInt();

                if (tipoDeVenda == 1) {
                    topStoke.
                } else if (tipoDeVenda == 2) {
                    caraDeLivro.setVendaAtual(realizarVendaAVista());
                }

            } else if (opcaoDesejada == 3) {
                System.out.println("\n====================================================");
                System.out.println("==============CATÁLOGO DE LIVROS====================");
                System.out.println(topStoke);
                System.out.println("\n====================================================");

            } else if (opcaoDesejada == 4) {
                menu = false;
                System.out.println("Obrigad@ por usar a Top Stoke System");
            } else {
                System.out.println("Por favor, digite uma opção do menu: ");
            }
        }

    }

}



