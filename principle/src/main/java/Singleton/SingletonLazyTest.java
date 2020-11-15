package Singleton;

/**
 * @ClassName SingletonLazyTest
 * @Description 单例-懒汉式（线程不安全）
 * @Author Duxin Yuan
 * @Date 2020/11/15 19:10
 * @Version 1.0
 **/
public class SingletonLazyTest {

    public static void main(String[] args) {
        SingletonLazy instance1 = SingletonLazy.getInstance();
        SingletonLazy instance2 = SingletonLazy.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }

}


class SingletonLazy {

    private SingletonLazy(){}

    private static SingletonLazy SINGLETON_LAZY;

    public static SingletonLazy getInstance() {
        if (SINGLETON_LAZY == null) {
            SINGLETON_LAZY = new SingletonLazy();
        }
        return SINGLETON_LAZY;
    }


}
