package br.com.zup;

public class Funcionario extends Pessoa {
    private String codigoFuncionario;

    public Funcionario() {

    }

    public Funcionario(String nome, String cpf, String codigoFuncionario) {
        super(nome, cpf);
        this.codigoFuncionario = codigoFuncionario;
    }

    public String getCodigoFuncionario() {
        return codigoFuncionario;
    }

    public void setCodigoFuncionario(String codigoFuncionario) {
        this.codigoFuncionario = codigoFuncionario;
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append(super.toString());
        retorno.append("\nCódigo do Funcionário: \t" + codigoFuncionario);
        return retorno.toString();
    }
}
