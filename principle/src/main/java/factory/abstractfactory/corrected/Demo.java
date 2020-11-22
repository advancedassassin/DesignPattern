package factory.abstractfactory.corrected;

import factory.abstractfactory.corrected.factory.AbstractFactory;
import factory.abstractfactory.corrected.factory.AppleFactory;
import factory.abstractfactory.corrected.factory.XiaoMiFactory;

/**
 * @ClassName Demo
 * @Description 描述一下该类用途
 * @Author Duxin Yuan
 * @Date 2020/11/22 21:57
 * @Version 1.0
 **/
public class Demo {
    public static void main(String[] arg) {
        AbstractFactory miFactory = new XiaoMiFactory();
        AbstractFactory appleFactory = new AppleFactory();
        miFactory.makePhone();            // make xiaomi phone!
        miFactory.makePC();                // make xiaomi PC!
        appleFactory.makePhone();        // make iphone!
        appleFactory.makePC();            // make MAC!
    }
}
