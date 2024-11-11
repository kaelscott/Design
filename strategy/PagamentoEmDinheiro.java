package strategy;

public class PagamentoEmDinheiro implements PagamentoStrategy {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagando R$ " + valor + " em dinheiro.");
    }
}

