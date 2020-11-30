package adapter.objectadapter;

/**
 * @ClassName VoltageAdapter
 * @Description 描述一下该类用途
 * @Author Duxin Yuan
 * @Date 2020/11/29 23:04
 * @Version 1.0
 **/
public class VoltageAdapter implements IVoltage5V {

    private Voltage220V voltage220V;

    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    public int output5V() {
        int dstV = 0;

        if (null != voltage220V) {
            int sourceV = voltage220V.output220V();
            System.out.println("使用对象适配器适配");
            dstV = sourceV / 44;
            System.out.println("适配器适配完成，输出电压为"+dstV);
        }
        return dstV;
    }
}
