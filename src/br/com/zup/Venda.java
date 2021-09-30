package br.com.zup;

public class Venda {
    private Livro livro;

    public Venda() {

    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    //Métodos
    //Acréscimo de 10% na compra a prazo
    public double venderAPrazo (Livro livro){
        double novoValor = livro.getPrecoLivro() * 1.1;
        livro.setPrecoLivro(novoValor);
        return novoValor;
    }


    //Desconto de 5% na compra a vista
    public double venderAVista(Livro livro) {
        double novoValor = livro.getPrecoLivro() * 0.95;
        livro.setPrecoLivro(novoValor);
        return novoValor;
    }

}
