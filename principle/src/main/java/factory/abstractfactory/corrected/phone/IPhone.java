package factory.abstractfactory.corrected.phone;

/**
 * @ClassName IPhone
 * @Description 描述一下该类用途
 * @Author Duxin Yuan
 * @Date 2020/11/22 21:56
 * @Version 1.0
 **/
public class IPhone implements AbstractPhone {
    public IPhone() {
        this.make();
    }
    public void make() {
        // TODO Auto-generated method stub
        System.out.println("make iphone!");
    }
}
