package it.unicas.products.interceptors;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

import it.unicas.products.action.LoginAction;

public class LoginInterceptor implements Interceptor {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroy() called");
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		System.out.println("init() called");
	}

	@Override
	public String intercept(ActionInvocation ai) throws Exception {
		// TODO Auto-generated method stub
		Object user = ServletActionContext.getRequest().getSession().getAttribute("loggedinUser");
		if(user == null) {
			if(ai.getAction().getClass().equals(LoginAction.class)) {
				return ai.invoke();
			}
			return "input";
		}
		return ai.invoke();
	}

}
