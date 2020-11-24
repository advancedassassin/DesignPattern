package prototype.deepclone.deepmethod1;

import java.io.Serializable;

/**
 * @ClassName DeepPrototype
 * @Description 描述一下该类用途
 * @Author Duxin Yuan
 * @Date 2020/11/24 14:47
 * @Version 1.0
 **/
public class DeepPrototype implements Serializable, Cloneable {

    private String name;// String 属性

    private DeepCloneTarget deepCloneTarget;// 成员变量是一个类

    // 深拷贝 - 方式一使用手动clone方法
    @Override
    protected DeepPrototype clone() throws CloneNotSupportedException {
        DeepPrototype deep;
        // 先完成对基本数据类型和String类的拷贝
        deep = (DeepPrototype)super.clone();
        // 然后对成员变量是一个类的属性处理,进行拷贝
        deep.deepCloneTarget = (DeepCloneTarget)deepCloneTarget.clone();
        return deep;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DeepCloneTarget getDeepCloneTarget() {
        return deepCloneTarget;
    }

    public void setDeepCloneTarget(DeepCloneTarget deepCloneTarget) {
        this.deepCloneTarget = deepCloneTarget;
    }
}
