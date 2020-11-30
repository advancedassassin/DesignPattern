package adapter.interfaceadapter.jdk8;

/**
 * @InterfaceName InterfaceSourceJDK8Default
 * @Description 这个有default方法的是JDK1.8之后的一个特质，实际上这个接口适配是不需要了
 * @Author Duxin Yuan
 * @Date 2020/11/30 17:40
 * @Version 1.0
 **/
public interface InterfaceSourceJDK8Default {

    default void function1(){
        System.out.println("默认方法1");
    }

    default void function2(){
        System.out.println("默认方法2");
    }

    public void function3();

    public void function4();

}
