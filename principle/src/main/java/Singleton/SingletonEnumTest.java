package Singleton;

/**
 * @ClassName SingletonEnumTest
 * @Description 描述一下该类用途
 * @Author Duxin Yuan
 * @Date 2020/11/17 16:59
 * @Version 1.0
 **/
public class SingletonEnumTest {

    public static void main(String[] args) {
        SingletonEnum instance = SingletonEnum.INSTANCE;
        SingletonEnum instance2 = SingletonEnum.INSTANCE;

        System.out.println(instance == instance2);
        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());

        instance.sayOK();
    }

}

// 使用枚举能够实现单例
enum  SingletonEnum{
    INSTANCE;// 属性

    public void sayOK(){
        System.out.println("OK");
    }
}

