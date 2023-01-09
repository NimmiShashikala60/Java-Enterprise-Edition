package Filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(urlPatterns = "/a")
public class Filterone implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Filter One Initialized");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Filter One do Filter Method Invoked");
        servletResponse.getWriter().print("<h1>Request Intercept By Filter One</h1>");
    }

    @Override
    public void destroy() {
        System.out.println("Filter One Destroyed");
    }
}
