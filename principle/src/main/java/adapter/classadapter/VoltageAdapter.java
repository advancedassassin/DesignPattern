package adapter.classadapter;

/**
 * @ClassName VoltageAdapter
 * @Description 描述一下该类用途
 * @Author Duxin Yuan
 * @Date 2020/11/29 23:04
 * @Version 1.0
 **/
public class VoltageAdapter extends Voltage220V implements IVoltage5V {
    public int output5V() {
        // 获取220v电压
        int sourceV = super.output220V();
        // 转换成5v
        int dstV = sourceV/44;
        return dstV;
    }
}
