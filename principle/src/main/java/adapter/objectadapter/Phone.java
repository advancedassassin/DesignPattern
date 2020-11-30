package adapter.objectadapter;

/**
 * @ClassName Phone
 * @Description 描述一下该类用途
 * @Author Duxin Yuan
 * @Date 2020/11/29 23:06
 * @Version 1.0
 **/
public class Phone {
    // 充电
    public void charging(IVoltage5V iVoltage5V){
        if (iVoltage5V.output5V() == 5) {
            System.out.println("转换后输出电压5v，可以充电");
        }else if (iVoltage5V.output5V() > 5){
            System.out.println("电压大于5v,不能充电");
        }
    }

}
