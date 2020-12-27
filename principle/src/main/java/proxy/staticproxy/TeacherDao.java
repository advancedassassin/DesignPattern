package proxy.staticproxy;
// 目标对象
public class TeacherDao implements ITeacherDao {

    public void teach() {
        System.out.println(" 老师开始上课 ");
    }
}
