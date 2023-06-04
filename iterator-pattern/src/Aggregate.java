/**
 * Aggregate
 *
 * @author YuanJW
 * @date 2023/06/03
 */
public class Aggregate<E> implements Container{

    private Object[] items;

    public void setItems(Object[] items) {
        this.items = items;
    }

    @Override
    public Iterator iterator() {
        return new Itr();
    }

    private class Itr implements Iterator<E> {

        int index;

        @Override
        public boolean hasNext() {
            if (index < items.length) {
                return true;
            }
            return false;
        }

        @Override
        public E next() {
            if (this.hasNext()) {
                return (E) items[index++];
            }
            return null;
        }
    }
}
