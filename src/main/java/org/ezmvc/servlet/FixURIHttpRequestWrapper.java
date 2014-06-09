/**
 * 
 */
package org.ezmvc.servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

/**
 * @author Eric
 *
 */
public class FixURIHttpRequestWrapper extends HttpServletRequestWrapper {
	
	public FixURIHttpRequestWrapper(HttpServletRequest request) {
		super(request);
	}
	
	@Override
	public String getRequestURI() {
		return "/ezDistpatch";
	}
	
	public String getRealRequestURI(){
		return super.getRequestURI();
	}
	
	 public String getServletPath() {
		 return "/ezDistpatch";
	 }
}
