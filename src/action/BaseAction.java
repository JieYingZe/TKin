package action;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;



//import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;




import service.UserManager;

public class BaseAction extends ActionSupport{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public UserManager userService() {
        ServletContext servletContext = ServletActionContext.getServletContext();
        WebApplicationContext webApplicationContext= WebApplicationContextUtils.getRequiredWebApplicationContext(servletContext);
        return (UserManager)webApplicationContext.getBean("UserManager");    
    }
    public HttpServletRequest request(){
        return ServletActionContext.getRequest();
    }
    public HttpSession session(){
        return ServletActionContext.getRequest().getSession();
    }
    public ServletContext application(){
        return ServletActionContext.getServletContext();
    }
    public HttpServletResponse response(){
        return ServletActionContext.getResponse();
    }
	@Override
	public String execute() throws Exception {
		System.out.println("Base Action");
		return null;
	}
}
