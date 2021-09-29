package chap3_4;

public class Person {
    // 方法的创建
    // 修饰符：public private Protected
    // 静态属性static
    // 返回类型
    // 方法名称
    // 参数（） (类型 变量名）
    // 实现方法{}
    public INvwa getPerson(String type){
        INvwa iNvwa=null;
        if(type.equals("W")){
            iNvwa=new Woman();
            System.out.println("创建了女人");
        }
        else if(type.equals("M")){
            iNvwa=new Man();
            System.out.println("创建了男人");
        }
        else {
            iNvwa=new Robot();
            System.out.println("创建了机器人");
        }
        return iNvwa;
    }

}
