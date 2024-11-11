package main;

import strategy.PagamentoStrategy;

public class Paciente {
    private String nome;
    private PagamentoStrategy estrategiaDePagamento;

    public Paciente(String nome, PagamentoStrategy estrategiaDePagamento) {
        this.nome = nome;
        this.estrategiaDePagamento = estrategiaDePagamento;
    }

    public void realizarPagamento(double valor) {
        estrategiaDePagamento.pagar(valor);
    }
}
