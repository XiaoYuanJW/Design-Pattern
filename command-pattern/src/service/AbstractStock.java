package service;

import command.Command;
import domain.Stock;

/**
 * AbstractStock
 *
 * @author YuanJW
 * @date 2023/06/03
 */
public abstract class AbstractStock implements Command {

    protected Stock stock;

    public AbstractStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public abstract void execute();
}
