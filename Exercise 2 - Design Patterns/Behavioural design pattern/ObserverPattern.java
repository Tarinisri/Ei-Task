//StockMarket is the subject that manages observers and notifies them of state changes.
//StockClient is the observer that reacts to updates from StockMarket.
//The client adds observers to the subject and sets the stock price, triggering notifications.

import java.util.ArrayList;
import java.util.List;

// Subject
class StockMarket {
    private List<Observer> observers = new ArrayList<>();
    private int stockPrice;

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void setStockPrice(int price) {
        stockPrice = price;
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(stockPrice);
        }
    }
}

// Observer
interface Observer {
    void update(int stockPrice);
}

// Concrete Observers
class StockClient implements Observer {
    private String name;

    public StockClient(String name) {
        this.name = name;
    }

    public void update(int stockPrice) {
        System.out.println(name + " notified. Stock price: " + stockPrice);
    }
}

// Client
public class ObserverPattern {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        stockMarket.addObserver(new StockClient("Client 1"));
        stockMarket.addObserver(new StockClient("Client 2"));

        stockMarket.setStockPrice(100);
    }
}
