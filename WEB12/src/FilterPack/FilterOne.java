package FilterPack;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class FilterOne
 */
public class FilterOne implements Filter {

    /**
     * Default constructor. 
     */
    public FilterOne() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
/*		System.out.println(((HttpServletRequest)request).getRequestURI());
		String url = ((HttpServletRequest)request).getRequestURI();
		if(url.equals("/WEB11/createOffer")) {
			System.out.println("Forbidden");
			
		}
		else {
			chain.doFilter(request, response);
		}*/
		System.out.println("Filtering"+((HttpServletRequest)request).getRequestURI());
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
