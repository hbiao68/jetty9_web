package hb.test.jetty;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;
 
 
public class JettyStarter {
 
    public static void main(String[] args) throws Exception {
         
        // 服务器的监听端口
        Server server = new Server(8080);
         
        // 关联一个已经存在的上下文
        WebAppContext context = new WebAppContext();
         
        // 设置描述符位置
        context.setDescriptor("./web/WEB-INF/web.xml");
         
        // 设置Web内容上下文路径
        context.setResourceBase("./web");
         
        // 设置上下文路径
        context.setContextPath("/myproject");
        context.setParentLoaderPriority(true);
  
        server.setHandler(context);
  
        // 启动
        server.start();
        server.join();
    }
 
}