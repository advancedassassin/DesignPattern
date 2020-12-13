package bridge;

import bridge.abstr.UprightPhone;
import bridge.interfa.Vivo;

/**
 * @ClassName Client
 * @Description 描述一下该类用途
 * @Author Duxin Yuan
 * @Date 2020/12/13 12:18
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        UprightPhone vivoUprightPhone = new UprightPhone(new Vivo());
        vivoUprightPhone.call();
    }
}
