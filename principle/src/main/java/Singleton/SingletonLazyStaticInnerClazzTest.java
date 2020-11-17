package Singleton;

/**
 * @ClassName SingleLazyStaticInnerClassTest
 * @Description 单例-懶汉式-静态内部类
 * @Author Duxin Yuan
 * @Date 2020/11/17 15:49
 * @Version 1.0
 **/
public class SingletonLazyStaticInnerClazzTest {


    public static void main(String[] args) {
        SingletonLazyStaticInnerClazz instance1 = SingletonLazyStaticInnerClazz.getInstance();
        SingletonLazyStaticInnerClazz instance2 = SingletonLazyStaticInnerClazz.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }

}


class SingletonLazyStaticInnerClazz {

    private SingletonLazyStaticInnerClazz() {}

    private static class SingletonLazyStaticInnerClazzInstance{
        private static final SingletonLazyStaticInnerClazz INSTANCE = new SingletonLazyStaticInnerClazz();
    }

    public static SingletonLazyStaticInnerClazz getInstance() {
        return SingletonLazyStaticInnerClazzInstance.INSTANCE;
    }

}