package service;

import command.Stock;

/**
 * AbstractStock
 *
 * @author YuanJW
 * @date 2023/06/02
 */
public abstract class AbstractStock implements Order {

    protected Stock stock;

    protected AbstractStock(Stock stock) {
        this.stock = stock;
    }

    public abstract void execute();
}
