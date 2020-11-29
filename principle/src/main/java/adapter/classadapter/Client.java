package adapter.classadapter;

/**
 * @ClassName Clietn
 * @Description 描述一下该类用途
 * @Author Duxin Yuan
 * @Date 2020/11/29 23:08
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        System.out.println("类适配器模式");
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter());
    }
}
