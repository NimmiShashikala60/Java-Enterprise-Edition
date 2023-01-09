package Filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(urlPatterns = "/b")
public class FilterThree implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Filter Three Initialized");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Filter Three do Filter Method Invoked");
        String name = servletRequest.getParameter("name");
        if (name.equals("ijse")){
            filterChain.doFilter(servletRequest,servletResponse);
        }else {
            servletResponse.getWriter().write("<h1>Non Authenticated user</h1>");
        }
    }

    @Override
    public void destroy() {
        System.out.println("Filter Three Destroyed");
    }
}
