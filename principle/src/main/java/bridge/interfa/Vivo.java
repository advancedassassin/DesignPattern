package bridge.interfa;

/**
 * @ClassName Vivo
 * @Description 描述一下该类用途
 * @Author Duxin Yuan
 * @Date 2020/12/13 12:12
 * @Version 1.0
 **/
public class Vivo implements Brand {
    @Override
    public void call() {
        System.out.println("Vivo打电话");
    }

    @Override
    public void on() {
        System.out.println("Vivo开机");
    }

    @Override
    public void off() {
        System.out.println("Vivo关机");
    }
}
