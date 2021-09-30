package br.com.zup;
import java.util.ArrayList;
import java.util.List;


public class Estoque {

    private List<Livro> listaDeLivros = new ArrayList<>();


    public Estoque() {

    }

    public List<Livro> getLivroslista() {
        return listaDeLivros;
    }

    public void cadastrarLivro(Livro novolivro) {
        listaDeLivros.add(novolivro);
    }



    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("\n Quantidade de Livros: \t"+listaDeLivros.size());
        retorno.append("\n Catálogo de livros: \t"+listaDeLivros);
        return retorno.toString();
    }
}

