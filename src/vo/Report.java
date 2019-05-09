package vo;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Report entity. @author MyEclipse Persistence Tools
 */

public class Report implements java.io.Serializable {

	// Fields

	private Long rid;
	private Long pid;
	private Long aid;
	private Long did;
	private Long wid;
	private Long tid;
	private Date retim;
	private String des;
	private String rea;
	private Long state;
	private BigDecimal num;
	private Date fintim;
	

	// Constructors	

	/** default constructor */
	public Report() {
	}

	/** full constructor */
	public Report(Long pid, Long aid, Long did, Long wid, Long tid, Date retim,
			String des, String rea, Long state, BigDecimal num, Date fintim) {
		this.pid = pid;
		this.aid = aid;
		this.did = did;
		this.wid = wid;
		this.tid = tid;
		this.retim = retim;
		this.des = des;
		this.rea = rea;
		this.state = state;
		this.num = num;
		this.fintim = fintim;
	}

	// Property accessors

	public Long getRid() {
		return this.rid;
	}

	public void setRid(Long rid) {
		this.rid = rid;
	}

	public Long getPid() {
		return this.pid;
	}

	public void setPid(Long pid) {
		this.pid = pid;
	}

	public Long getAid() {
		return this.aid;
	}

	public void setAid(Long aid) {
		this.aid = aid;
	}

	public Long getDid() {
		return this.did;
	}

	public void setDid(Long did) {
		this.did = did;
	}

	public Long getWid() {
		return this.wid;
	}

	public void setWid(Long wid) {
		this.wid = wid;
	}

	public Long getTid() {
		return this.tid;
	}

	public void setTid(Long tid) {
		this.tid = tid;
	}

	public Date getRetim() {
		return this.retim;
	}

	public void setRetim(Date retim) {
		this.retim = retim;
	}

	public String getDes() {
		return this.des;
	}

	public void setDes(String des) {
		this.des = des;
	}

	public String getRea() {
		return this.rea;
	}

	public void setRea(String rea) {
		this.rea = rea;
	}

	public Long getState() {
		return this.state;
	}

	public void setState(Long state) {
		this.state = state;
	}

	public BigDecimal getNum() {
		return this.num;
	}

	public void setNum(BigDecimal num) {
		this.num = num;
	}

	public Date getFintim() {
		return this.fintim;
	}

	public void setFintim(Date fintim) {
		this.fintim = fintim;
	}

}