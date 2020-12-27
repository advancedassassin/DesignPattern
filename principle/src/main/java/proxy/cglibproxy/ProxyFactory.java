package proxy.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class ProxyFactory implements MethodInterceptor {

    // 维护一个目标对象
    private Object target;

    // 构造器传入代理对象
    public ProxyFactory(Object target){
        this.target = target;
    }

    // 返回一个代理对象，是target目标对象的代理对象
    public Object getProxyInstance(){
        // 增强器工具类
        Enhancer enhancer = new Enhancer();
        // 设置父类
        enhancer.setSuperclass(target.getClass());
        // 设置回调函数
        enhancer.setCallback(this);
        // 创建子类对象，即代理对象
        return enhancer.create();
    }
    // 重新intercept方法， getProxyInstance会触发intercept，从而反射调目标对象方法
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib代理模式开始");
        Object returnValue = method.invoke(target, args);
        System.out.println("cglib代理提交");
        return returnValue;
    }
}
