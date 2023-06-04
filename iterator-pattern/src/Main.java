public class Main {
    public static void main(String[] args) {
        Aggregate aggregate = new Aggregate();

        aggregate.setItems(new Object[]{1, 2, 3});

        Iterator iterator = aggregate.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}