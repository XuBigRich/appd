package vo;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Roles entity. @author MyEclipse Persistence Tools
 */

public class Roles implements java.io.Serializable {

	// Fields

	private Long rid;
	private String name;
	private String des;


	private Set funs=new HashSet(0);
	
	/** default constructor */
	public Roles() {
	}

	/** full constructor */
	public Roles(String name, String des) {
		this.name = name;
		this.des = des;
	}

	// Property accessors

	public Long getRid() {
		return this.rid;
	}

	public void setRid(Long rid) {
		this.rid = rid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDes() {
		return this.des;
	}

	public void setDes(String des) {
		this.des = des;
	}

	public Set getFuns() {
		return funs;
	}

	public void setFuns(Set funs) {
		this.funs = funs;
	}


}