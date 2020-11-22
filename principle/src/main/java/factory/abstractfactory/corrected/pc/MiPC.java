package factory.abstractfactory.corrected.pc;

import factory.abstractfactory.corrected.pc.AbstractPC;

/**
 * @ClassName MiPC
 * @Description 描述一下该类用途
 * @Author Duxin Yuan
 * @Date 2020/11/22 21:48
 * @Version 1.0
 **/
public class MiPC implements AbstractPC {

    public MiPC(){
        this.make();
    }

    public void make() {
        System.out.println("make xiaomi PC!");
    }
}
