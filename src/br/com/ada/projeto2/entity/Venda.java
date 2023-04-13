package br.com.ada.projeto2.entity;

import java.time.LocalDateTime;
import java.util.List;

public class Venda {

    private LocalDateTime dataVenda;
    private List<Item> listaItens;
    private Pessoa cliente;

    public LocalDateTime getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(LocalDateTime dataVenda) {
        this.dataVenda = dataVenda;
    }

    public List<Item> getListaItens() {
        return listaItens;
    }

    public void setListaItens(List<Item> listaItens) {
        this.listaItens = listaItens;
    }

    public Pessoa getCliente() {
        return cliente;
    }

    public void setCliente(Pessoa cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Venda [" + "Data: " + dataVenda + "| Itens: " + listaItens + "| Cliente: " + cliente + "]";
    }
}