package br.com.zup;

public class Cliente extends Pessoa{
    private String telefone;

    public Cliente() {

    }

    public Cliente(String nome, String cpf, String telefone) {
        super(nome, cpf);
        this.telefone = telefone;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append(super.toString());
        retorno.append("\nNúmero de Telefone do Cliente: " + telefone);
        return retorno.toString();
    }
}
