package test;

import java.io.*;
import javax.servlet.*;

public class NewFilter implements Filter {

    String filterInitParam;

    public void init(FilterConfig filterConfig) throws ServletException {
        filterInitParam = filterConfig.getInitParameter("filterInitParamName");
    }

    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain chain)
            throws IOException, ServletException {
        request.setAttribute("filterInitParamName", filterInitParam);
        chain.doFilter(request, response);
    }

    public void destroy() {
        // do nothing
    }
}
