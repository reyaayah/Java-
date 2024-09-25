
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.*;

public class MyServlet implements Servlet {
    ServletConfig config=null;

    @Override
    public void init(ServletConfig sc) throws ServletException {
        config =sc;
        System.out.println("in init");
       
    }

    @Override
    public ServletConfig getServletConfig() {
        return config;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter pw=res.getWriter();
        pw.println("<h1>hello from lifecycle servlet</h1>");
        System.out.println("in service");
        
    }
    @Override
    public String getServletInfo(){
        return "LifeCycleServlet";
    }

    @Override
    public void destroy() {
        System.out.println("in destroy");
    }

}
