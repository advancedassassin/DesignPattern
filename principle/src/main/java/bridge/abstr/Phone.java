package bridge.abstr;

import bridge.interfa.Brand;

/**
 * @ClassName Phone
 * @Description 抽象类，桥
 * @Author Duxin Yuan
 * @Date 2020/12/13 12:11
 * @Version 1.0
 **/
public abstract class Phone {

    // 聚合进来
    private Brand brand;

    public Phone(Brand brand){
        this.brand = brand;
    }

    void call(){
        brand.call();
    }

    void on(){
        brand.on();
    }

    void off(){
        brand.off();
    }
}
