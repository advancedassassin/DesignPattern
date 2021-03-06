package prototype.deepclone.deepmethod2recommended;

import prototype.deepclone.deepmethod2recommended.DeepCloneTarget;
import prototype.deepclone.deepmethod2recommended.DeepPrototype;

import java.io.IOException;

/**
 * @ClassName Client
 * @Description 描述一下该类用途
 * @Author Duxin Yuan
 * @Date 2020/11/24 10:56
 * @Version 1.0
 **/
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {

        DeepPrototype deepPrototype = new DeepPrototype();

        deepPrototype.setName("张三");
        deepPrototype.setDeepCloneTarget(new DeepCloneTarget("李四","李四的类"));
        // 方式1 完成浅拷贝
        DeepPrototype clone = deepPrototype.deepClone();

        System.out.println("原型.name="+deepPrototype.getName()+";原型.deepCloneTarget="+deepPrototype.getDeepCloneTarget().hashCode());
        System.out.println("clone.name="+clone.getName()+";clone.deepCloneTarget="+clone.getDeepCloneTarget().hashCode());

    }

}
