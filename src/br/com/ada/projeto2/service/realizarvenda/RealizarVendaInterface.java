package br.com.ada.projeto2.service.realizarvenda;

import br.com.ada.projeto2.entity.Pessoa;
import br.com.ada.projeto2.entity.Produto;
import br.com.ada.projeto2.entity.Venda;

import java.time.LocalDateTime;

public interface RealizarVendaInterface {

    public Venda iniciarVenda(LocalDateTime data, Pessoa cliente);
    public void adicionarItem(Produto produto);
    public void finalizarVenda(Venda venda);
}