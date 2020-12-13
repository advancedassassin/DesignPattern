package bridge.abstr;

import bridge.interfa.Brand;

/**
 * @ClassName UprightPhone
 * @Description 描述一下该类用途
 * @Author Duxin Yuan
 * @Date 2020/12/13 12:16
 * @Version 1.0
 **/
public class UprightPhone extends Phone {
    public UprightPhone(Brand brand) {
        super(brand);
    }

    public void call(){
        super.call();
        System.out.println("直立手机");
    }

    public void on(){
        super.on();
        System.out.println("直立手机");
    }
    public void off(){
        super.off();
        System.out.println("直立手机");
    }
}
