package br.com.zup;

public class Venda {
    private int tipovenda;
    private Livro livro;

    public Venda() {
    }

    public Venda(int tipovenda) {
        this.tipovenda = tipovenda;
    }

    public int getTipovenda() {
        return tipovenda;
    }

    public void setTipovenda(int tipovenda) {
        this.tipovenda = tipovenda;
    }
    //Métodos
    //Acréscimo de 10% na compra a prazo
    public double venderAPrazo (){
        double novoValor = livro.getPrecoLivro() * 1.1;
        livro.setPrecoLivro(novoValor);
        return novoValor;
    }
    //Desconto de 5% na compra a vista
    public double venderAVista(){
        double novoValor = livro.getPrecoLivro() * 0.95;
        livro.setPrecoLivro(novoValor);
        return novoValor;
    }

}
