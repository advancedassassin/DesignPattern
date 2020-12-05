package adapter.springmvcadapter;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName DispatchServlet
 * @Description 描述一下该类用途
 * @Author Duxin Yuan
 * @Date 2020/12/5 22:12
 * @Version 1.0
 **/
public class DispatchServlet {

    private static List<HandlerAdapter> handlerAdapters = new ArrayList<>();

    //无参构造器初始化的时候添加进入全部handlerAdapter,聚合
    public DispatchServlet() {
        handlerAdapters.add(new AnnotatiionHandlerAdapter());
        handlerAdapters.add(new SimpleHandlerAdapter());
        handlerAdapters.add(new HttpHandlerAdapter());
    }

    public void doDispatch() throws Exception{
        // 此处模拟springmvc从request中取handle对象
        // 适配器可以获取到希望的controller，
        HttpController httpController = new HttpController();
        SimpleController simpleController = new SimpleController();
        AnnotationController annotationController = new AnnotationController();

        // 得到对应的适配器
        HandlerAdapter adapter = getHandlerAdapter(httpController);
        adapter.handler(httpController);
    }

    private HandlerAdapter getHandlerAdapter(Controller controller) throws Exception{
        // 遍历，进入的Controller和适配器匹配就返回适配器，根据得到的controller（handler），返回对应的适配器
        for (HandlerAdapter handlerAdapter : this.handlerAdapters) {
            if (handlerAdapter.supports(controller)) {
                return handlerAdapter;
            }
        }
        // 否则就抛异常
        throw new Exception("No adapter for handler [" + controller  +
                "]: The DispatcherServlet configuration needs to include a HandlerAdapter that supports this handler");
    }


    public static void main(String[] args) throws Exception {
        new DispatchServlet().doDispatch();
    }
}
