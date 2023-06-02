import service.ProxyShape;

public class Main {
    public static void main(String[] args) {
        ProxyShape proxyShape = new ProxyShape("circle");
        proxyShape.draw();

        proxyShape.draw();
    }
}