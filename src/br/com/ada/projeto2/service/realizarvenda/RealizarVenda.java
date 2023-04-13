package br.com.ada.projeto2.service.realizarvenda;

import br.com.ada.projeto2.entity.Item;
import br.com.ada.projeto2.entity.Pessoa;
import br.com.ada.projeto2.entity.Produto;
import br.com.ada.projeto2.entity.Venda;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class RealizarVenda implements RealizarVendaInterface {

    private Map<String, Item> carrinhoDeCompras;

    @Override
    public Venda iniciarVenda(LocalDateTime dataVenda, Pessoa cliente) {

        carrinhoDeCompras = new HashMap<>();

        Venda venda = new Venda();
        venda.setDataVenda(dataVenda);
        venda.setCliente(cliente);

        return venda;
    }

    @Override
    public void adicionarItem(Produto produto) {

        Item item = new Item();
        item.setProduto(produto);
        item.setQtdCompra(1);

        Item itemCarrinho = carrinhoDeCompras.get(produto.getCodigo());

        if (itemCarrinho == null) {
            carrinhoDeCompras.put(produto.getCodigo(), item);
        } else {
            itemCarrinho.setQtdCompra(item.getQtdCompra() + 1);
        }
    }

    @Override
    public void finalizarVenda(Venda venda) {

        venda.setListaItens(carrinhoDeCompras.values().stream().toList());

//        double valorTotal = 0;
//
//        for (Item item : carrinhoDeCompras.values()) {
//
//            valorTotal += item.getQtdCompra() * item.getProduto().getPreco();
//        }
    }
}