package br.com.zup;

public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("213-2","Book","Vanessa","Edipro",50);
        Livro livro2 = new Livro("213-2","Book","Vanessa","Edipro",50);
        Livraria topStoke  = new Livraria();
        Estoque estoque = new Estoque();
        Venda venda = new Venda();

        System.out.println(livro1);
        estoque.cadastrarLivro(livro1);
        System.out.println(estoque);
        System.out.println("---------------------");
        estoque.cadastrarLivro(livro2);
        System.out.println(estoque);
        System.out.println("---------------------");
        venda.venderAPrazo(livro1);
        System.out.println(livro1);
        venda.venderAVista(livro2);
        System.out.println(livro2);

    }
}
