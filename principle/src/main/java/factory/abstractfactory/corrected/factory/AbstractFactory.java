package factory.abstractfactory.corrected.factory;

import factory.abstractfactory.corrected.pc.AbstractPC;
import factory.abstractfactory.corrected.phone.AbstractPhone;

public interface AbstractFactory {
    AbstractPhone makePhone();
    AbstractPC makePC();
}