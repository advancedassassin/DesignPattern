package factory.abstractfactory.corrected.factory;

import factory.abstractfactory.corrected.pc.AbstractPC;
import factory.abstractfactory.corrected.pc.MAC;
import factory.abstractfactory.corrected.phone.AbstractPhone;
import factory.abstractfactory.corrected.phone.IPhone;

/**
 * @ClassName AppleFactory
 * @Description 描述一下该类用途
 * @Author Duxin Yuan
 * @Date 2020/11/22 21:55
 * @Version 1.0
 **/
public class AppleFactory implements AbstractFactory {
    public AbstractPhone makePhone() {
        return new IPhone();
    }
    public AbstractPC makePC() {
        return new MAC();
    }
}
