package observer;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeNotificacoes {
    private List<Observer> observers = new ArrayList<>();

    public void adicionarObservador(Observer observer) {
        observers.add(observer);
    }

    public void removerObservador(Observer observer) {
        observers.remove(observer);
    }

    public void notificarObservadores(String mensagem) {
        for (Observer observer : observers) {
            observer.atualizar(mensagem);
        }
    }
}
