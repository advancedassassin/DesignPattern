package bridge.interfa;

/**
 * @ClassName Apple
 * @Description 描述一下该类用途
 * @Author Duxin Yuan
 * @Date 2020/12/13 12:13
 * @Version 1.0
 **/
public class Apple implements Brand {
    @Override
    public void call() {
        System.out.println("Apple打电话");
    }

    @Override
    public void on() {
        System.out.println("Apple开机");
    }

    @Override
    public void off() {
        System.out.println("Apple关机");
    }
}
