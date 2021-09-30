package br.com.zup;

import java.util.List;
import java.util.Queue;

public class Estoque {

    private List listaDeLivros;
    private Cliente cliente;
    private Funcionario funcionario;
    private int quantidadeDelivros;

    public Estoque() {
    }

    public Estoque(List listaDeLivros, Cliente cliente, Funcionario funcionario, int quantidadeDelivros) {
        this.listaDeLivros = listaDeLivros;
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.quantidadeDelivros = quantidadeDelivros;
    }

    public List getListaDeLivros() {
        return listaDeLivros;
    }

    public void setListaDeLivros(List listaDeLivros) {
        this.listaDeLivros = listaDeLivros;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public int getQuantidadeDelivros() {
        return quantidadeDelivros;
    }

    public void setQuantidadeDelivros(int quantidadeDelivros) {
        this.quantidadeDelivros = quantidadeDelivros;
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("\nLista de livros: " + listaDeLivros);
        retorno.append("\nCliente" + cliente);
        retorno.append("\nFuncionário" + funcionario);
        retorno.append("\nQuantidade de Livros" + quantidadeDelivros);
        return retorno.toString();
    }
}

