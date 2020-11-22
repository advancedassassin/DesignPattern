package factory.abstractfactory.corrected.phone;

import factory.abstractfactory.corrected.phone.AbstractPhone;

/**
 * @ClassName MiPhone
 * @Description 描述一下该类用途
 * @Author Duxin Yuan
 * @Date 2020/11/22 21:49
 * @Version 1.0
 **/
public class MiPhone implements AbstractPhone {
    public MiPhone() {
        this.make();
    }
    public void make() {
        // TODO Auto-generated method stub
        System.out.println("make xiaomi phone!");
    }
}
