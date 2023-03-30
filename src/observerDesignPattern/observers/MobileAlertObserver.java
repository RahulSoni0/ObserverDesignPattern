package observerDesignPattern.observers;

import observerDesignPattern.observables.StocksObservable;

public class MobileAlertObserver implements NotificationAlertObserver {


    StocksObservable obj;
    String mobileId;
    String prod;

    public MobileAlertObserver(StocksObservable obj, String mobileId, String prod) {
        this.obj = obj;
        this.mobileId = mobileId;
        this.prod = prod;
    }

    @Override
    public void update() {

        sendMobileNotification(mobileId, "product is in stock");

    }

    private void sendMobileNotification(String mobileId, String productIsInStock) {

        System.out.println("mobile notification sent to :" + mobileId + " for " + prod);
    }
}
