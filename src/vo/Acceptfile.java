package vo;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Acceptfile entity. @author MyEclipse Persistence Tools
 */

public class Acceptfile implements java.io.Serializable {

	// Fields

	private Long afid;
	private Long pid;
	private String fn;
	private String txt;
	private String tp;
	private BigDecimal siz;
	private Date tim;

	// Constructors

	/** default constructor */
	public Acceptfile() {
	}

	/** full constructor */
	public Acceptfile(Long pid, String fn, String txt, String tp,
			BigDecimal siz, Date tim) {
		this.pid = pid;
		this.fn = fn;
		this.txt = txt;
		this.tp = tp;
		this.siz = siz;
		this.tim = tim;
	}

	// Property accessors

	public Long getAfid() {
		return this.afid;
	}

	public void setAfid(Long afid) {
		this.afid = afid;
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