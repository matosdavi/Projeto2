package br.com.ada.projeto2.main;

import br.com.ada.projeto2.entity.Produto;

import java.util.ArrayList;

public class mainProduto {

    public static void main(String[] args) {

        Produto arroz = new Produto("Arroz 1kg", 9.99, 50, "001");
        Produto feijao = new Produto("Feijão 1kg", 9.29, 45, "002");
        Produto macarrao = new Produto("Macarrão 500g", 4.19, 40, "003");

        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(arroz);
        produtos.add(feijao);
        produtos.add(macarrao);

        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }
}