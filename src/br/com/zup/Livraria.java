package br.com.zup;




public class Livraria {
    private Cliente cliente;
    private Funcionario funcionario;
    private Venda vendaAtual;
    private Estoque estoqueAtual;

    public Livraria() {
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

    public Venda getVendaAtual() {
        return vendaAtual;
    }

    public void setVendaAtual(Venda vendaAtual) {
        this.vendaAtual = vendaAtual;
    }

    public Estoque getEstoqueAtual() {
        return estoqueAtual;
    }

    public void setEstoqueAtual(Estoque estoqueAtual) {
        this.estoqueAtual = estoqueAtual;
    }

    //Métodos
    public void cadastrarCliente(Cliente novoCliente) {
        this.cliente = novoCliente;
    }

    public void cadastrarFucnionario(Funcionario novoFuncionario) {
        this.funcionario = novoFuncionario;
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("\nCliente: \t"+getCliente());
        retorno.append("\nFuncionario responsavel: \t"+getFuncionario());
        retorno.append("\nVenda: " +getVendaAtual());
        retorno.append("\nEstoque: "+getEstoqueAtual());
        return retorno.toString();
    }




}
