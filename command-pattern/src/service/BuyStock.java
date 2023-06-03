package service;

import domain.Stock;

/**
 * BuyStock
 *
 * @author YuanJW
 * @date 2023/06/03
 */
public class BuyStock extends AbstractStock {

    public BuyStock(Stock stock) {
        super(stock);
    }

    @Override
    public void execute() {
        stock.buy();
    }
}
