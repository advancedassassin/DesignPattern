package proxy.dynamicproxy;

// 目标对象要实现的接口
public interface ITeacherDao {
    void teach();// 授课方法

    void sayHello(String name);
}
