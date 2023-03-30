package observerDesignPattern.observers;

import observerDesignPattern.observables.StocksObservable;

public class EmailAlertObserver implements NotificationAlertObserver {

    StocksObservable obj;
    String emailId;
    String prod;

    public EmailAlertObserver(StocksObservable obj, String emailId, String prod) {
        this.obj = obj;
        this.emailId = emailId;
        this.prod = prod;
    }

    @Override
    public void update() {
        sendEmailNotification(emailId, "product is in stock");

    }

    private void sendEmailNotification(String emailId, String productIsInStock) {
        System.out.println("email notification sent to :" + emailId + " for " + prod + " ");
    }
}
