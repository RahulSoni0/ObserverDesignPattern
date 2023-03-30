package observerDesignPattern;

import observerDesignPattern.observables.IpadStockObservableImlp;
import observerDesignPattern.observables.IphoneStockObservableImpl;
import observerDesignPattern.observables.StocksObservable;
import observerDesignPattern.observers.EmailAlertObserver;
import observerDesignPattern.observers.MobileAlertObserver;
import observerDesignPattern.observers.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {

        StocksObservable iphoneStockObservable = new IphoneStockObservableImpl();
        StocksObservable ipadStockObservable = new IpadStockObservableImlp();

        NotificationAlertObserver o1 = new MobileAlertObserver(ipadStockObservable, "Ipadmobile_number12345", ipadStockObservable.getProd());
        NotificationAlertObserver o2 = new MobileAlertObserver(ipadStockObservable, "Ipadmobile_number09876", ipadStockObservable.getProd());
        NotificationAlertObserver o3 = new EmailAlertObserver(ipadStockObservable, "Ipadhello@gmail.com", ipadStockObservable.getProd());
        NotificationAlertObserver o4 = new EmailAlertObserver(ipadStockObservable, "Ipadtestdev@gmail.com", ipadStockObservable.getProd());

        ipadStockObservable.addSubscribers(o1);
        ipadStockObservable.addSubscribers(o2);
        ipadStockObservable.addSubscribers(o3);
        ipadStockObservable.addSubscribers(o4);

        NotificationAlertObserver o5 = new MobileAlertObserver(iphoneStockObservable, "Iphonemobile_number12345", iphoneStockObservable.getProd());
        NotificationAlertObserver o6 = new MobileAlertObserver(iphoneStockObservable, "Iphonemobile_number09876", iphoneStockObservable.getProd());
        NotificationAlertObserver o7 = new EmailAlertObserver(iphoneStockObservable, "Iphonehello@gmail.com", iphoneStockObservable.getProd());
        NotificationAlertObserver o8 = new EmailAlertObserver(iphoneStockObservable, "Iphonetestdev@gmail.com", iphoneStockObservable.getProd());

        iphoneStockObservable.addSubscribers(o5);
        iphoneStockObservable.addSubscribers(o6);
        iphoneStockObservable.addSubscribers(o7);
        iphoneStockObservable.addSubscribers(o8);


        iphoneStockObservable.setStock(10);
        ipadStockObservable.setStock(1);
        iphoneStockObservable.setStock(5);


    }
}
