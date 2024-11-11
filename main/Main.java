package main;

import strategy.PagamentoEmDinheiro;
import strategy.PagamentoComCartaoCredito;
import strategy.PagamentoStrategy;
import observer.GerenciadorDeNotificacoes;
import observer.ServicoDeNotificacao;

public class Main {
    public static void main(String[] args) {
        // estrategias de pagamento
        PagamentoStrategy pagamentoCartao = new PagamentoComCartaoCredito("1234-5678-9876-5432");
        PagamentoStrategy pagamentoDinheiro = new PagamentoEmDinheiro();

        // pacientes
        Paciente paciente1 = new Paciente("João", pagamentoCartao);
        Paciente paciente2 = new Paciente("Maria", pagamentoDinheiro);

        // pagamentos
        paciente1.realizarPagamento(150.0);
        paciente2.realizarPagamento(200.0);

        // notificações
        GerenciadorDeNotificacoes gerenciadorDeNotificacoes = new GerenciadorDeNotificacoes();
        ServicoDeNotificacao servicoEmail = new ServicoDeNotificacao("notificação por email");
        ServicoDeNotificacao servicoSMS = new ServicoDeNotificacao("notificação por mensagem");

        // observadores
        gerenciadorDeNotificacoes.adicionarObservador(servicoEmail);
        gerenciadorDeNotificacoes.adicionarObservador(servicoSMS);

        // notificações
        gerenciadorDeNotificacoes.notificarObservadores("consulta as 10h.");
    }
}

