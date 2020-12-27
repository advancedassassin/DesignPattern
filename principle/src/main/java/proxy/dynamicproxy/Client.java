package proxy.dynamicproxy;

public class Client {

    public static void main(String[] args) {
        TeacherDao teacherDao = new TeacherDao();

       // ProxyFactory proxyFactory = new ProxyFactory(teacherDao);

        ProxyFactoryLamda proxyFactory = new ProxyFactoryLamda(teacherDao);
        // 注意强转成接口，而非目标对象
        ITeacherDao teacherDaoProxyInstance = (ITeacherDao)proxyFactory.getProxyInstance();
        // class com.sun.proxy.$Proxy0内存中动态生成了代理对象
        System.out.println(teacherDaoProxyInstance.getClass());

        teacherDaoProxyInstance.sayHello("zhangsan");

        teacherDaoProxyInstance.teach();
    }
}
