import observer.BinaryObserver;
import observer.HexObserver;
import observer.OctalObserver;
import subject.ConcreteSubject;

public class Main {
    public static void main(String[] args) {

        ConcreteSubject subject = new ConcreteSubject();

        BinaryObserver binaryObserver = new BinaryObserver(subject);
        HexObserver hexObserver = new HexObserver(subject);
        OctalObserver octalObserver = new OctalObserver(subject);

        System.out.println("First Number Change: 15");
        subject.setNumber(15);
        System.out.println("Second Number Change: 15");
        subject.setNumber(10);
    }
}