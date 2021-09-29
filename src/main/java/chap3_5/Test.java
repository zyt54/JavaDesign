package chap3_5;

public class Test {
    public static void main(String[] args) {
        ShapeFactory shape=new ShapeFactory();
        IShape ishape;
        ishape =shape.getShape("C");
    }
}
