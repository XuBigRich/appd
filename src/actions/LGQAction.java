package actions;

import java.io.PrintWriter;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.opensymphony.xwork2.ActionSupport;

import dao.ILGQ;

public class LGQAction extends ActionSupport implements ServletRequestAware,
		ServletResponseAware{
	private HttpServletRequest req;
	private PrintWriter out;
	private ILGQ lgqdao;
	
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

	public ILGQ getLgqdao() {
		return lgqdao;
	}

	public void setLgqdao(ILGQ lgqdao) {
		this.lgqdao = lgqdao;
	}

}
	
	
