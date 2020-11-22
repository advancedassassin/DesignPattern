package factory.abstractfactory.corrected.factory;

import factory.abstractfactory.corrected.pc.AbstractPC;
import factory.abstractfactory.corrected.pc.MiPC;
import factory.abstractfactory.corrected.phone.AbstractPhone;
import factory.abstractfactory.corrected.phone.MiPhone;

/**
 * @ClassName XMFactory
 * @Description 描述一下该类用途
 * @Author Duxin Yuan
 * @Date 2020/11/22 21:54
 * @Version 1.0
 **/
public class XiaoMiFactory implements AbstractFactory{
    public AbstractPhone makePhone() {
        return new MiPhone();
    }
    public AbstractPC makePC() {
        return new MiPC();
    }
}
