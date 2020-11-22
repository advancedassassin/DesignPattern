package factory.abstractfactory.corrected.pc;

import static com.sun.javafx.css.SizeUnits.PC;

/**
 * @ClassName MAC
 * @Description 描述一下该类用途
 * @Author Duxin Yuan
 * @Date 2020/11/22 21:53
 * @Version 1.0
 **/
public class MAC implements AbstractPC {
    public MAC() {
        this.make();
    }
    public void make() {
        // TODO Auto-generated method stub
        System.out.println("make MAC!");
    }
}