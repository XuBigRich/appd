package vo;

import java.util.Date;

/**
 * Sena entity. @author MyEclipse Persistence Tools
 */

public class Sena implements java.io.Serializable {

	// Fields

	private Long sid;
	private String unit;
	private Long bid;
	private String code;
	private String fade;
	private String ress;
	private String tel;
	private String tact;
	private String job;
	private String mob;
	private String em;
	private String username;
	private String password;
	private Date tim;
	private String des;
	private Boolean stat;

//	private Base base;
	
	
	/** default constructor */
	public Sena() {
	}

	/** full constructor */
	public Sena(String unit, Long bid, String code, String fade, String ress,
			String tel, String tact, String job, String mob, String em,
			String username, String password, Date tim, String des, Boolean stat) {
		this.unit = unit;
		this.bid = bid;
		this.code = code;
		this.fade = fade;
		this.ress = ress;
		this.tel = tel;
		this.tact = tact;
		this.job = job;
		this.mob = mob;
		this.em = em;
		this.username = username;
		this.password = password;
		this.tim = tim;
		this.des = des;
		this.stat = stat;
	}

	// Property accessors

	public Long getSid() {
		return this.sid;
	}

	public void setSid(Long sid) {
		this.sid = sid;
	}

	public String getUnit() {
		return this.unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public Long getBid() {
		return this.bid;
	}

	public void setBid(Long bid) {
		this.bid = bid;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getFade() {
		return this.fade;
	}

	public void setFade(String fade) {
		this.fade = fade;
	}

	public String getRess() {
		return this.ress;
	}

	public void setRess(String ress) {
		this.ress = ress;
	}

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getTact() {
		return this.tact;
	}

	public void setTact(String tact) {
		this.tact = tact;
	}

	public String getJob() {
		return this.job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getMob() {
		return this.mob;
	}

	public void setMob(String mob) {
		this.mob = mob;
	}

	public String getEm() {
		return this.em;
	}

	public void setEm(String em) {
		this.em = em;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getTim() {
		return this.tim;
	}

	public void setTim(Date tim) {
		this.tim = tim;
	}

	public String getDes() {
		return this.des;
	}

	public void setDes(String des) {
		this.des = des;
	}

	public Boolean getStat() {
		return this.stat;
	}

	public void setStat(Boolean stat) {
		this.stat = stat;
	}

//	public Base getBase() {
//		return base;
//	}
//
//	public void setBase(Base base) {
//		this.base = base;
//	}
	

}