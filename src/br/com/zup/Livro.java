package br.com.zup;

//Atributos
public class Livro {
    private String codigoISBN;//chave para pesquizar
    private String nomeLivro;
    private String autor;
    private String editora;
    private double precoLivro;

    //Constructores
    public Livro() {

    }

    public Livro(String codigoISBN,String nomeLivro, String autor, String editora,  double precoLivro) {
        this.codigoISBN = codigoISBN;
        this.nomeLivro = nomeLivro;
        this.autor = autor;
        this.editora = editora;
        this.precoLivro = precoLivro;
    }

    //Getter & Setter


    public String getCodigoISBN() {
        return codigoISBN;
    }

    public void setCodigoISBN(String codigoISBN) {
        this.codigoISBN = codigoISBN;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

        public double getPrecoLivro() {
        return precoLivro;
    }

    public void setPrecoLivro(double precoLivro) {
        this.precoLivro = precoLivro;
    }

    //toString

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("Código ISBN: " + codigoISBN);
        retorno.append("Nome do Livro: " + nomeLivro);
        retorno.append("Autor do Livro: "+autor);
        retorno.append("Editora: "+editora);
        retorno.append("Preço do livro: "+precoLivro);
        return retorno.toString();
    }
}