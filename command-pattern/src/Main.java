import domain.Stock;
import invoker.Invoker;
import service.BuyStock;
import service.SellStock;

public class Main {
    public static void main(String[] args) {
        Stock stock = new Stock();
        SellStock sellStock = new SellStock(stock);
        BuyStock buyStock = new BuyStock(stock);

        Invoker invoker = new Invoker();
        invoker.takeCommand(sellStock);
        invoker.takeCommand(buyStock);

        invoker.placeCommand();
    }
}