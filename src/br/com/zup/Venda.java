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


}
