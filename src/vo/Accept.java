package vo;

import java.util.Date;

/**
 * Accept entity. @author MyEclipse Persistence Tools
 */

public class Accept implements java.io.Serializable {

	// Fields

	private Long pid;
	private Long aid;
	private Long did;
	private Long wid;
	private Long stat;
	private String note;
	private Date tim;
	private String tel;
	private String per;
	private String noe;
	private String work;
	private String res;

	// Constructors

	/** default constructor */
	public Accept() {
	}

	/** full constructor */
	public Accept(Long aid, Long did, Long wid, Long stat, String note,
			Date tim, String tel, String per, String noe, String work,
			String res) {
		this.aid = aid;
		this.did = did;
		this.wid = wid;
		this.stat = stat;
		this.note = note;
		this.tim = tim;
		this.tel = tel;
		this.per = per;
		this.noe = noe;
		this.work = work;
		this.res = res;
	}

	// Property accessors

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

	public Long getStat() {
		return this.stat;
	}

	public void setStat(Long stat) {
		this.stat = stat;
	}

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Date getTim() {
		return this.tim;
	}

	public void setTim(Date tim) {
		this.tim = tim;
	}

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getPer() {
		return this.per;
	}

	public void setPer(String per) {
		this.per = per;
	}

	public String getNoe() {
		return this.noe;
	}

	public void setNoe(String noe) {
		this.noe = noe;
	}

	public String getWork() {
		return this.work;
	}

	public void setWork(String work) {
		this.work = work;
	}

	public String getRes() {
		return this.res;
	}

	public void setRes(String res) {
		this.res = res;
	}

}