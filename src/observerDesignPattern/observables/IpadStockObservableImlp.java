package observerDesignPattern.observables;

import observerDesignPattern.observers.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IpadStockObservableImlp implements StocksObservable {
    List<NotificationAlertObserver> objList = new ArrayList<>();
    int stock;
    private String prod = "Ipad";

    @Override
    public String getProd() {
        return prod;
    }

    @Override
    public void addSubscribers(NotificationAlertObserver obj) {
        objList.add(obj);
    }

    @Override
    public void removeSubscribers(NotificationAlertObserver obj) {
        objList.remove(obj);

    }

    @Override
    public void notifySubscribers() {

        for (NotificationAlertObserver o : objList) {
            o.update();
        }

    }

    @Override
    public int getStock() {
        return stock;
    }

    @Override
    public void setStock(int newStock) {
        if (stock == 0 && newStock != 0) {
            notifySubscribers();
        }
        stock = stock + newStock;
    }
}
