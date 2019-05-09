package vo;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Water entity. @author MyEclipse Persistence Tools
 */

public class Water implements java.io.Serializable {

	// Fields

	private Long wid;
	private Long pid;
	private BigDecimal cod;
	private BigDecimal am;
	private BigDecimal tp;
	private BigDecimal ph;
	private String des;
	private Date tim;

	// Constructors

	/** default constructor */
	public Water() {
	}

	/** full constructor */
	public Water(Long pid, BigDecimal cod, BigDecimal am, BigDecimal tp,
			BigDecimal ph, String des, Date tim) {
		this.pid = pid;
		this.cod = cod;
		this.am = am;
		this.tp = tp;
		this.ph = ph;
		this.des = des;
		this.tim = tim;
	}

	// Property accessors

	public Long getWid() {
		return this.wid;
	}

	public void setWid(Long wid) {
		this.wid = wid;
	}

	public Long getPid() {
		return this.pid;
	}

	public void setPid(Long pid) {
		this.pid = pid;
	}

	public BigDecimal getCod() {
		return this.cod;
	}

	public void setCod(BigDecimal cod) {
		this.cod = cod;
	}

	public BigDecimal getAm() {
		return this.am;
	}

	public void setAm(BigDecimal am) {
		this.am = am;
	}

	public BigDecimal getTp() {
		return this.tp;
	}

	public void setTp(BigDecimal tp) {
		this.tp = tp;
	}

	public BigDecimal getPh() {
		return this.ph;
	}

	public void setPh(BigDecimal ph) {
		this.ph = ph;
	}

	public String getDes() {
		return this.des;
	}

	public void setDes(String des) {
		this.des = des;
	}

	public Date getTim() {
		return this.tim;
	}

	public void setTim(Date tim) {
		this.tim = tim;
	}

}