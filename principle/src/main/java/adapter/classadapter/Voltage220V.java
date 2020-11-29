package adapter.classadapter;

/**
 * @ClassName Voltage220V
 * @Description 被适配的类
 * @Author Duxin Yuan
 * @Date 2020/11/29 22:47
 * @Version 1.0
 **/
public class Voltage220V {
    // 输出220v电压
    public int output220V(){
        int source = 220;
        System.out.println("电压"+source+"伏");
        return source;
    }
}
