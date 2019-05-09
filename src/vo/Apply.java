package vo;

import java.util.Date;

/**
 * Apply entity. @author MyEclipse Persistence Tools
 */

public class Apply implements java.io.Serializable {

	// Fields

	private Long pid;
	private Long aaid;
	private Long did;
	private Long lastid;
	private Long curdid;
	private Long wid;
	private Date tim;

	// Constructors

	/** default constructor */
	public Apply() {
	}

	/** full constructor */
	public Apply(Long aaid, Long did, Long lastid, Long curdid, Long wid,
			Date tim) {
		this.aaid = aaid;
		this.did = did;
		this.lastid = lastid;
		this.curdid = curdid;
		this.wid = wid;
		this.tim = tim;
	}

	// Property accessors

	public Long getPid() {
		return this.pid;
	}

	public void setPid(Long pid) {
		this.pid = pid;
	}

	public Long getAaid() {
		return this.aaid;
	}

	public void setAaid(Long aaid) {
		this.aaid = aaid;
	}

	public Long getDid() {
		return this.did;
	}

	public void setDid(Long did) {
		this.did = did;
	}

	public Long getLastid() {
		return this.lastid;
	}

	public void setLastid(Long lastid) {
		this.lastid = lastid;
	}

	public Long getCurdid() {
		return this.curdid;
	}

	public void setCurdid(Long curdid) {
		this.curdid = curdid;
	}

	public Long getWid() {
		return this.wid;
	}

	public void setWid(Long wid) {
		this.wid = wid;
	}

	public Date getTim() {
		return this.tim;
	}

	public void setTim(Date tim) {
		this.tim = tim;
	}

}