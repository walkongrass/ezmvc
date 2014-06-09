/**
 * 
 */
package org.ezmvc.controller;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.ezmvc.servlet.FixURIHttpRequestWrapper;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


/**
 * 
 * @author Eric
 *
 */
@Controller
public class EzMvcDispatchController implements InitializingBean,BeanFactoryAware{
	private static final Log log = LogFactory.getLog(EzMvcDispatchController.class);
	
	private BeanFactory beanFactory;

	private String basePackage;
	
	private String defaultControllerName;
	
	private final HashMap<String, Object> beanCache = new HashMap<String, Object>();
	
	@RequestMapping(value="/ezDistpatch")
	public ModelAndView doDispatch(HttpServletRequest request,HttpServletResponse response) {
		HttpServletRequest realRequest = (HttpServletRequest)((FixURIHttpRequestWrapper)request).getRequest();
		log.info("requestURL:"+realRequest.getRequestURI());
		return null;
	}

	public void afterPropertiesSet() throws Exception {

	}

	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		this.beanFactory = beanFactory;
	}
	
	public void setBasePackage(String basePackage) {
		this.basePackage = basePackage;
	}

	public void setDefaultControllerName(String defaultControllerName) {
		this.defaultControllerName = defaultControllerName;
	}
	
	

}
