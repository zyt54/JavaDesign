package chap3_5;

public class ShapeFactory {
    public IShape getShape(String type){
        IShape shape;
        if(type.equalsIgnoreCase("C")){
            shape= new Circle();
            System.out.println("创建了圆形");
        }else if(type.equalsIgnoreCase("R")){
            shape= new Rectangle();
            System.out.println("创建了矩形");
        }else {
            shape= new Triangle();
            System.out.println("创建了三角形");
        }
        return shape;
    }
}
