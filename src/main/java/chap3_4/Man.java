package chap3_4;

public class Man implements INvwa { //表明了实现女娲的接口  但是要实现父类的cre方法
    //在这里重写父类接口的getChat方法
    public void getChat(){
        System.out.println("创建了男人");
    }
}
