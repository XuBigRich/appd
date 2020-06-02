package actions;

import java.io.PrintWriter;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.opensymphony.xwork2.ActionSupport;

import dao.IMJL;

public class MJLAction extends ActionSupport implements ServletRequestAware,
		ServletResponseAware{
	private HttpServletRequest req;
	private PrintWriter out;
	private IMJL mjldao;
	
	public void setServletRequest(HttpServletRequest arg0) {
		req=arg0;
	}

	public void setServletResponse(HttpServletResponse arg0) {
		try {
			arg0.setContentType("text/html;charset=utf-8");
			out=arg0.getWriter();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public IMJL getMjldao() {
		return mjldao;
	}

	public void setMjldao(IMJL mjldao) {
		this.mjldao = mjldao;
	}


	
	
}
