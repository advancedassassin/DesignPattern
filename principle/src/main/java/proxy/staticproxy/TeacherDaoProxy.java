package proxy.staticproxy;
// 代理对象
public class TeacherDaoProxy implements ITeacherDao {

    // 目标对象，通过接口聚合进来
    private ITeacherDao iTeacherDaoTarget;

    // 构造器传入
    public TeacherDaoProxy(ITeacherDao iTeacherDaoTarget){
        this.iTeacherDaoTarget = iTeacherDaoTarget;
    }

    public void teach() {
        System.out.println(" 开始代理，前置操作 ");
        iTeacherDaoTarget.teach();
        System.out.println(" 后置操作 ");

    }
}
