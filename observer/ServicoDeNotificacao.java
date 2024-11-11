package observer;

public class ServicoDeNotificacao implements Observer {
    private String nome;

    public ServicoDeNotificacao(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(String mensagem) {
        System.out.println(nome + " recebeu a mensagem de notificação: " + mensagem);
    }
}
