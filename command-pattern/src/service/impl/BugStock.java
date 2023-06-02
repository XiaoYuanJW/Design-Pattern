package service.impl;

import command.Stock;
import service.AbstractStock;

/**
 * BugStock
 *
 * @author YuanJW
 * @date 2023/06/02
 */
public class BugStock extends AbstractStock {

    public BugStock(Stock stock) {
        super(stock);
    }

    @Override
    public void execute() {
        stock.buy();
    }
}
