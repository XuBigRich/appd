package vo;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Itemfile entity. @author MyEclipse Persistence Tools
 */

public class Itemfile implements java.io.Serializable {

	// Fields

	private Long ifid;
	private Long iid;
	private Long pid;
	private String fn;
	private String txt;
	private String tp;
	private BigDecimal siz;
	private Date tim;

	// Constructors

	/** default constructor */
	public Itemfile() {
	}

	/** full constructor */
	public Itemfile(Long iid, Long pid, String fn, String txt, String tp,
			BigDecimal siz, Date tim) {
		this.iid = iid;
		this.pid = pid;
		this.fn = fn;
		this.txt = txt;
		this.tp = tp;
		this.siz = siz;
		this.tim = tim;
	}

	// Property accessors

	public Long getIfid() {
		return this.ifid;
	}

	public void setIfid(Long ifid) {
		this.ifid = ifid;
	}

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

	public String getFn() {
		return this.fn;
	}

	public void setFn(String fn) {
		this.fn = fn;
	}

	public String getTxt() {
		return this.txt;
	}

	public void setTxt(String txt) {
		this.txt = txt;
	}

	public String getTp() {
		return this.tp;
	}

	public void setTp(String tp) {
		this.tp = tp;
	}

	public BigDecimal getSiz() {
		return this.siz;
	}

	public void setSiz(BigDecimal siz) {
		this.siz = siz;
	}

	public Date getTim() {
		return this.tim;
	}

	public void setTim(Date tim) {
		this.tim = tim;
	}

}