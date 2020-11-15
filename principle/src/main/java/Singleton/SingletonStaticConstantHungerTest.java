package Singleton;

/**
 * @ClassName SingletonStaticConstantHungerTest
 * @Description 静态常量饿汉式
 * @Author Duxin Yuan
 * @Date 2020/11/15 17:41
 * @Version 1.0
 **/
public class SingletonStaticConstantHungerTest {

    public static void main(String[] args) {
        SingletonStaticConstantHunger instance1 = SingletonStaticConstantHunger.getInstance();
        SingletonStaticConstantHunger instance2 = SingletonStaticConstantHunger.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }

}

class SingletonStaticConstantHunger{

    // 1、构造器，外部不能new
    private SingletonStaticConstantHunger(){}

    // 2、本类内部创建对象实例
    private final static SingletonStaticConstantHunger SINGLETON_STATIC_CONSTANT_HUNGER = new SingletonStaticConstantHunger();

    // 3、提供一个公有静态方法，返回实例对象
    public static SingletonStaticConstantHunger getInstance(){
        return SINGLETON_STATIC_CONSTANT_HUNGER;
    }

}

