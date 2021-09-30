package br.com.zup;
import java.util.ArrayList;
import java.util.List;
public class Estoque {
    private Cliente cliente;
    private Funcionario funcionario;
    private int quantidadeDelivros;
    private List<Livro> listaDeLivros = new ArrayList<>();
   // private Livro livroEstoque;

    public Estoque() {
    }

    public Estoque(Cliente cliente, Funcionario funcionario, int quantidadeDelivros) {
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.quantidadeDelivros = quantidadeDelivros;
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
    public List<Livro> getLivroslista() {
        return listaDeLivros;
    }
    public void cadastrarLivro(Livro novolivro) {
        listaDeLivros.add(novolivro);
    }



    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("\nCliente" + cliente);
        retorno.append("\nFuncionário" + funcionario);
        retorno.append("\nQuantidade de Livros" + quantidadeDelivros);
        return retorno.toString();
    }
}

