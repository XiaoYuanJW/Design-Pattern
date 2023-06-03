package service;

import domain.Stock;

/**
 * SellStock
 *
 * @author YuanJW
 * @date 2023/06/03
 */
public class SellStock extends AbstractStock {
    public SellStock(Stock stock) {
        super(stock);
    }

    @Override
    public void execute() {
        stock.sell();
    }
}
