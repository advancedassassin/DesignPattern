package adapter.interfaceadapter;

/**
 * @ClassName Client
 * @Description 描述一下该类用途
 * @Author Duxin Yuan
 * @Date 2020/11/30 17:37
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        new AbstractClass(){
            @Override
            public void function1() {
                System.out.println("重写function1");
            }
        };
    }
}
