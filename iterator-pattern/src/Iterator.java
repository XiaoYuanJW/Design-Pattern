/**
 * Iterator
 *
 * @author YuanJW
 * @date 2023/06/03
 */
public interface Iterator<E> {
    /**
     * 判断迭代是否包含更多元素
     *
     * @return
     */
    boolean hasNext();

    /**
     * 返回迭代中的下一个元素
     *
     * @return
     */
    E next();
}
