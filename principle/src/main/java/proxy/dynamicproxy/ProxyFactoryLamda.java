package proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

// 动态代理工厂类Lamda表达式
public class ProxyFactoryLamda {
    // 维护一个超类目标对象
    private Object target;

    // 构造器 对target初始化
    public ProxyFactoryLamda(Object target){
        this.target = target;
    }

    public Object getProxyInstance(){
        Object o = Proxy.newProxyInstance(
                // 指定当前目标对象使用的类加载器
                target.getClass().getClassLoader(),
                // 目标对象所实现的接口类型，使用泛型方法确认类型
                target.getClass().getInterfaces(),
                // 执行代理对象方法时候，会触发事件处理器里面的方法
                (proxy,method,args) -> {
                    System.out.println("JDK代理开始");
                    // 反射机制调用目标方法对象
                    Object returnValue = method.invoke(target, args);
                    System.out.println("JDK代理提交");
                    return returnValue;
                }
        );
        return o;
    }

}
