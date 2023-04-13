package br.com.ada.projeto2.entity;

public class Produto {

    private String nome;
    private double preco;
    private int qtdEstoque;
    private String codigo;

    public Produto(String nome, double preco, int qtdEstoque, String codigo) {
        this.nome = nome;
        this.preco = preco;
        this.qtdEstoque = qtdEstoque;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Produto [" + "Nome: " + nome + " | Preço: R$" + preco + " | Quantidade em Estoque: " + qtdEstoque + "| Código: " + codigo + "]";
    }

}