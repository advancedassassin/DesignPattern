package prototype.deepclone.deepmethod2recommended;

import java.io.Serializable;

/**
 * @ClassName DeepCloneTarget
 * @Description 描述一下该类用途
 * @Author Duxin Yuan
 * @Date 2020/11/24 14:42
 * @Version 1.0
 **/
public class DeepCloneTarget implements Serializable,Cloneable {

    private static final long serialVersionUID = 1L;

    private String cloneName;

    private String cloneClass;

    public DeepCloneTarget(String cloneName, String cloneClass) {
        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }

    // 类属性都是String类，我们这里用默认的clone完成浅拷贝即可
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
