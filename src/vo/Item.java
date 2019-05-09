package vo;

import java.util.Date;

/**
 * Item entity. @author MyEclipse Persistence Tools
 */

public class Item implements java.io.Serializable {

	// Fields

	private Long iid;
	private Long pid;
	private Long wid;
	private String tact;
	private String dist;
	private String dname;
	private Date tim;
	private String txt;

	// Constructors

	/** default constructor */
	public Item() {
	}

	/** full constructor */
	public Item(Long pid, Long wid, String tact, String dist, String dname,
			Date tim, String txt) {
		this.pid = pid;
		this.wid = wid;
		this.tact = tact;
		this.dist = dist;
		this.dname = dname;
		this.tim = tim;
		this.txt = txt;
	}

	// Property accessors

	public Long getIid() {
		return this.iid;
	}

	public void setIid(Long iid) {
		this.iid = iid;
	}

	public Long getPid() {
		return this.pid;
	}

	public void setPid(Long pid) {
		this.pid = pid;
	}

	public Long getWid() {
		return this.wid;
	}

	public void setWid(Long wid) {
		this.wid = wid;
	}

	public String getTact() {
		return this.tact;
	}

	public void setTact(String tact) {
		this.tact = tact;
	}

	public String getDist() {
		return this.dist;
	}

	public void setDist(String dist) {
		this.dist = dist;
	}

	public String getDname() {
		return this.dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public Date getTim() {
		return this.tim;
	}

	public void setTim(Date tim) {
		this.tim = tim;
	}

	public String getTxt() {
		return this.txt;
	}

	public void setTxt(String txt) {
		this.txt = txt;
	}

}