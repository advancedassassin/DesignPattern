package Singleton;

/**
 * @ClassName SingletonLazyDoubleCheckTest
 * @Description 单例-懒汉式-双重检查(既能解决线程安全问题，又可解决效率问题)
 * @Author Duxin Yuan
 * @Date 2020/11/15 19:33
 * @Version 1.0
 **/
public class SingletonLazyDoubleCheckTest {

    public static void main(String[] args) {
        SingletonLazyDoubleCheck instance1 = SingletonLazyDoubleCheck.getInstance();
        SingletonLazyDoubleCheck instance2 = SingletonLazyDoubleCheck.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }



}



class SingletonLazyDoubleCheck {
    // 注意volatile让其他线程可见，将修改立即更新到主存
    private static volatile SingletonLazyDoubleCheck singletonLazyDoubleCheck;

    private SingletonLazyDoubleCheck(){}

    public static SingletonLazyDoubleCheck getInstance(){
        // 这个if判断是是挡住与第一个线程进入执行new时的时差较大的线程
        if (singletonLazyDoubleCheck == null){
            // 下面同步代码块，只有一个线程能够进去new  SingletonLazyDoubleCheck，当第一个线程new完成后，
            // 第二个线程（与第一个线程进入执行new时的时差非常小的线程）进去就会发现singletonLazyDoubleCheck ！= null从而不会new了
            // 这个if判断是是挡住与第一个线程进入执行new时的时差非常小的线程
            synchronized (SingletonLazyDoubleCheck.class){
                if (singletonLazyDoubleCheck == null){
                    singletonLazyDoubleCheck = new SingletonLazyDoubleCheck();
                }
            }
        }
        return singletonLazyDoubleCheck;
    }


}
