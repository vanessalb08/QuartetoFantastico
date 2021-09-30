package br.com.zup;

public class Livraria {
    private Cliente cliente;
    private Funcionario funcionario;

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

    //Métodps
    public void cadastrarCliente(Cliente novoCliente){
        this.cliente = novoCliente;
    }
    public void cadastrarFucnionario(Funcionario novoFuncionario){
        this.funcionario = novoFuncionario;
    }
}
