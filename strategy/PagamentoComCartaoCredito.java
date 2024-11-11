package strategy;

public class PagamentoComCartaoCredito implements PagamentoStrategy {
    private String numeroCartao;

    public PagamentoComCartaoCredito(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    @Override
    public void pagar(double valor) {
        System.out.println("Pagando R$ " + valor + " com cartão de crédito: " + numeroCartao);
    }
}

