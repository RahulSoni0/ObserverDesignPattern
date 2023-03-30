package observerDesignPattern.observables;

import observerDesignPattern.observers.NotificationAlertObserver;

public interface StocksObservable {

    void addSubscribers(NotificationAlertObserver obj);

    void removeSubscribers(NotificationAlertObserver obj);

    void notifySubscribers();

    int getStock();
    String getProd();

    void setStock(int stock);

}
