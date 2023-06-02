package service.impl;

import command.Stock;
import service.AbstractStock;

/**
 * SellStock
 *
 * @author YuanJW
 * @date 2023/06/02
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
