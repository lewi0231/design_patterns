package factorymethod;

public class ShapeFactory {

    public static Shape getShape(String shape){
        Shape shapeObject = null;

        switch(shape.toLowerCase()){
            case "square":
                shapeObject = new Square();
                break;
            case "rectangle":
                shapeObject = new Rectangle();
                break;
            case "triangle":
                shapeObject = new Triangle();
                break;

        }
        return shapeObject;

    }
}
