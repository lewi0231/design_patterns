package factorymethod;

public class Main {
    public static void main(String[] args) {
        Shape square = ShapeFactory.getShape("factorymethod.Square");
        System.out.println(square.getType());
    }
}
