package chap3_5;

public class Circle implements IShape{ //表明了实现几何模型的接口  但是要实现父类的cre方法
    //在这里重写父类接口的getChat方法
    public void draw() {
        System.out.println("绘制圆形");
    }
    public void erase() {
        System.out.println("擦除圆形");
    }
}
