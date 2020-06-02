package actions;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.hibernate.FetchMode;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

import tools.DateConverter;
import vo.*;

import com.opensymphony.xwork2.ActionSupport;

import dao.IXHZ;
import dao.impl.XHZDao;

public class XHZAction extends ActionSupport implements ServletRequestAware,ServletResponseAware {

	private HttpServletRequest req;
	private PrintWriter out;
	private IXHZ xhzdao;
	private Sena sena;
	private List qhs;
	private Accs acc;
	private Accs user;
	private List menu;
	private List u;
	private List parents;
	private List sbzh;
	private List jsdw;
	private List xmlx;
	private List bzjlx;
	private Project project =new Project();;
	private Money money;
	private List xm;
	//===============================================================
	//===============================================================
	//申报账号
	public String beforeSenaReg(){
	   qhs=xhzdao.findByHQL("from Base b where pbid=3");
		return "apply";
	}
	//注册
	public String senaReg(){
			u=xhzdao.findByHQL("from Accs a where username='"+sena.getUsername()+"'");
			if(u.size()>0){
			addFieldError("txt", "该账号已经存在<br>");
			return "error";
			}else{
				u=xhzdao.findByHQL("from Sena s where username='"+sena.getUsername()+"'");
				if(u.size()>0){
					addFieldError("txt", "账号审核中。。。。<br>");
					return "error";
				}else{
					sena.setStat(false);
					sena.setTim(new Date());
					xhzdao.save(sena);
					addFieldError("err", "注册成功<br>");
					return "error";
				}
			}
	}
	//登陆
	public String login(){
		try {
			xhzdao.findByHQL("from Accs a where username='"+acc.getUsername()+"' and password='"+acc.getPassword()+"'");
			u=xhzdao.findByHQL("from Accs a where username='"+acc.getUsername()+"'");
		    user=(Accs)u.get(0);
			req.getSession().setAttribute("user",user);
			return "main";
		} catch (Exception e) {
			e.printStackTrace();
			addFieldError("err", "账号或密码错误");
			return "error";
		}
	}
	//菜单
	public String findMenu(){
		Accs u=(Accs)req.getSession().getAttribute("user");
		DetachedCriteria dc = DetachedCriteria.forClass(Roles.class);
		dc.add(Restrictions.eq("rid", u.getRid()));
		dc.setFetchMode("funs", FetchMode.JOIN);
		Roles rol=(Roles)xhzdao.findByDetached(dc).get(0);//包含有当前角色具有  的  角色表 和权限表
		menu=xhzdao.findByHQL("from Funs f where pfid=0");
		
		for(int i=0;i<menu.size();i++){
			Funs p=(Funs)menu.get(i);//p是大菜单
			p.setChild(new HashSet(0));
			Iterator funs=rol.getFuns().iterator();//funs遍历出所有小菜单
			while(funs.hasNext()){
				Funs f=(Funs)funs.next();  //f只是具有小菜单
				if(f.getPfid().longValue()==p.getFid().longValue())p.getChild().add(f);
				if(!menu.contains(p))menu.add(p);
				
			}
		}
		System.out.println(menu.toString());
		return "menu";
	}
	//进度上报
	public String findProject(){
		return "";
	}
	//项目验收
	public String allYan(){
		return "";
	}
	//日常督察
	public String riChang(){
		return "";
	}

	//项目立项
	public String allProject(){
		xm=xhzdao.findByHQL("from Project");
		return "allProject";
	}
	//项目申报前
	public String addProject(){
		project.setYear(new Date().getYear()+1900+"");
		qhs=xhzdao.findByHQL("from Base b where pbid=3");
		jsdw=xhzdao.findByHQL("from Dept d where tid=71");
		bzjlx=xhzdao.findByHQL("from Base b where pbid=10");
		xmlx=xhzdao.findByHQL("from Base b where pbid=1");
		return "addProject";
	}
	//项目提交
	public String saveProject(){
		if(project.getVid()==62){
			Dept shi=(Dept)xhzdao.findByHQL("from Dept d where d.tid=74").get(0);
			project.setCdid(shi.getDid());
		}else{
			Dept xian=(Dept)(xhzdao.findByHQL("from Dept d where d.tid=72 and d.bid="+project.getCid()).get(0));
			project.setFdid(xian.getDid());	
		}
		project.setSid(49L);
		project.setStat(57L);
		project.setKid(24L);
		String pno="p"+new Date().getYear()*1000000+xhzdao.findByHQL("select count(*) from Project").get(0);;
		project.setPno(pno);
		xhzdao.save(project);
		xhzdao.save(money);
		return "allProject";
	}
	//水质变化
	public String allWater(){
		return "";
	}
	//图片影像
	public String allPicture(){
		return "";
	}
	//效绩评估
//	public String allYan(){
//		return "";
//	}
	//项目查询
	public String allCha(){
		return "";
	}
	//项目跟踪统计
	public String zijin(){
		return "";
	}
	//申报立项统计
	public String lixiang(){
		return "";
	}
	//日常跟踪统计
	public String rcgzTJ(){
		return "";
	}
	//项目验收统计
	public String yanshou(){
		return "";
	}
	//用户管理
	public String allUser(){
		return "";
	}
	//角色-权限管理
	public String allRoles(){
		return "allroles";
	}
	//添加权限
	public String addRoles(){
		return "updroles";
	}
	//部门管理
	public String allDept(){
		return "";
	}
	//系统数据字典管理
	public String allbase(){
		return "";
	}
	//查看申报账号
	public String SenaReg(){
		sbzh=xhzdao.findByHQL("from Sena where sid='"+sena.getSid()+"'");
		sena=(Sena)sbzh.get(0);
	    qhs=xhzdao.findByHQL("from Base b where pbid=3");
		return "SenaReg";
	}
	//归档
	public void savauser(){
		//huoqu xinxi 
		long sid = sena.getSid();
		xhzdao.delete(sena);
		Accs tempAcc = new Accs();
		xhzdao.save(tempAcc);
		
		//TODO:删除sena将内容加入到accs
	}
	//删除申报账号
	public void delet(){
		xhzdao.delete(sena);
	}
	//申报账号管理
	public String senaManage(){
		sbzh=xhzdao.findByHQL("from Sena");
		return "sbzh";
	}
	//==========================================================
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
//=====================================================================
	public IXHZ getXhzdao() {
		return xhzdao;
	}

	public void setXhzdao(IXHZ xhzdao) {
		this.xhzdao = xhzdao;
	}
	public List getQhs() {
		return qhs;
	}
	public void setQhs(List qhs) {
		this.qhs = qhs;
	}
	public Sena getSena() {
		return sena;
	}
	public void setSena(Sena sena) {
		this.sena = sena;
	}
	public Accs getAcc() {
		return acc;
	}
	public void setAcc(Accs acc) {
		this.acc = acc;
	}
	public List getMenu() {
		return menu;
	}
	public void setMenu(List menu) {
		this.menu = menu;
	}
	public Accs getUser() {
		return user;
	}
	public void setUser(Accs user) {
		this.user = user;
	}
	public List getU() {
		return u;
	}
	public void setU(List u) {
		this.u = u;
	}
	public List getParents() {
		return parents;
	}
	public void setParents(List parents) {
		this.parents = parents;
	}
	public List getSbzh() {
		return sbzh;
	}
	public void setSbzh(List sbzh) {
		this.sbzh = sbzh;
	}
	public List getJsdw() {
		return jsdw;
	}
	public void setJsdw(List jsdw) {
		this.jsdw = jsdw;
	}
	public List getXmlx() {
		return xmlx;
	}
	public void setXmlx(List xmlx) {
		this.xmlx = xmlx;
	}
	public List getBzjlx() {
		return bzjlx;
	}
	public void setBzjlx(List bzjlx) {
		this.bzjlx = bzjlx;
	}
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
	public Money getMoney() {
		return money;
	}
	public void setMoney(Money money) {
		this.money = money;
	}
	public List getXm() {
		return xm;
	}
	public void setXm(List xm) {
		this.xm = xm;
	}




}
