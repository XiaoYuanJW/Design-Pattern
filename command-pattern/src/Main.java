import broker.Broker;
import command.Stock;
import service.impl.BugStock;
import service.impl.SellStock;

public class Main {
    public static void main(String[] args) {
        Stock stock = new Stock();
        SellStock sellStock = new SellStock(stock);
        BugStock bugStock = new BugStock(stock);

        Broker broker = new Broker();
        broker.takeOrder(sellStock);
        broker.takeOrder(bugStock);

        broker.placeOrders();
    }
}