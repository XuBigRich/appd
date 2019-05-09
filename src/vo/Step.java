package vo;

import java.util.Date;

/**
 * Step entity. @author MyEclipse Persistence Tools
 */

public class Step implements java.io.Serializable {

	// Fields

	private Long sid;
	private Long pid;
	private Long bid;
	private Long aid;
	private Long did;
	private Long nid;
	private Date tim;
	private String txt;
	private Boolean tid;

	// Constructors

	/** default constructor */
	public Step() {
	}

	/** full constructor */
	public Step(Long pid, Long bid, Long aid, Long did, Long nid, Date tim,
			String txt, Boolean tid) {
		this.pid = pid;
		this.bid = bid;
		this.aid = aid;
		this.did = did;
		this.nid = nid;
		this.tim = tim;
		this.txt = txt;
		this.tid = tid;
	}

	// Property accessors

	public Long getSid() {
		return this.sid;
	}

	public void setSid(Long sid) {
		this.sid = sid;
	}

	public Long getPid() {
		return this.pid;
	}

	public void setPid(Long pid) {
		this.pid = pid;
	}

	public Long getBid() {
		return this.bid;
	}

	public void setBid(Long bid) {
		this.bid = bid;
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

	public Long getNid() {
		return this.nid;
	}

	public void setNid(Long nid) {
		this.nid = nid;
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

	public Boolean getTid() {
		return this.tid;
	}

	public void setTid(Boolean tid) {
		this.tid = tid;
	}

}