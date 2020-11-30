package adapter.interfaceadapter.jdk8;


/**
 * @ClassName Client
 * @Description 描述一下该类用途
 * @Author Duxin Yuan
 * @Date 2020/11/30 17:37
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        new AbstractClassJDK8Default(){
            @Override
            public void function4() {
                System.out.println(1);
            }
        };
    }
}
