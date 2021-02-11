package controllers;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import beans.User;

@ManagedBean
@ViewScoped

public class FormController {
	public String onSubmit(User user) {
		
		FacesContext context = FacesContext.getCurrentInstance();
		user = context.getApplication().evaluateExpressionGet(context, "#{user}", User.class);
		
		System.out.println("You click the submit button");

		// Put the user object into the POST request
		FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("user", user);
		
		return "TestResponse.xhtml";
	}
	
	public String onFlash(User user) {
		
		FacesContext context = FacesContext.getCurrentInstance();
		user = context.getApplication().evaluateExpressionGet(context, "#{user}", User.class);

		// Put the user object into the POST request
		FacesContext.getCurrentInstance().getExternalContext().getFlash().put("user", user);
		
		return "TestResponse2.xhtml";
		
	}
}
