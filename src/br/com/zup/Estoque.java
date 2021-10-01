package br.com.zup;

import java.util.ArrayList;
import java.util.List;


public class Estoque {

    private List<Livro> listaDeLivros = new ArrayList<>();


    public Estoque() {

    }

    public Estoque(List<Livro> listaDeLivros) {
        this.listaDeLivros = listaDeLivros;
    }

    public List<Livro> getLivroslista() {
        return listaDeLivros;
    }

    public void cadastrarLivro(Livro novoLivro) {
        listaDeLivros.add(novoLivro);
    }

    public void consultaLivro(Livro consulta) {
        String verificar = consulta.getCodigoISBN();
    }

    public void retirarLivro(Livro retiraLivro) {
        listaDeLivros.remove(retiraLivro);
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("\n Quantidade de Livros: \t" + listaDeLivros.size());
        retorno.append("\n Catálogo de livros: \t" + listaDeLivros);
        return retorno.toString();
    }
}

