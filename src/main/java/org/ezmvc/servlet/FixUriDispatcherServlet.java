/**
 * 
 */
package org.ezmvc.servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.DispatcherServlet;

/**
 * @author Eric
 *
 */
public class FixUriDispatcherServlet extends DispatcherServlet {
	
	@Override
	protected void doService(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		super.doService(new FixURIHttpRequestWrapper(request), response);
	}
}
