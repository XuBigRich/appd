package vo;

/**
 * Accs entity. @author MyEclipse Persistence Tools
 */

public class Accs implements java.io.Serializable {

	// Fields

	private Long aid;
	private Long did;
	private Long rid;
	private String username;
	private String password;
	private String sex;
	private String tel;
	private Boolean stat;
	private String job;
	private String name;
	private String em;
	private String des;
	
	private Roles roles;
	private Dept dept;
	
	/** default constructor */
	public Accs() {
	}

	/** full constructor */
	public Accs(Long did, Long rid, String username, String password,
			String sex, String tel, Boolean stat, String job, String name,
			String em, String des) {
		this.did = did;
		this.rid = rid;
		this.username = username;
		this.password = password;
		this.sex = sex;
		this.tel = tel;
		this.stat = stat;
		this.job = job;
		this.name = name;
		this.em = em;
		this.des = des;
	}

	// Property accessors

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

	public Long getRid() {
		return this.rid;
	}

	public void setRid(Long rid) {
		this.rid = rid;
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

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public Boolean getStat() {
		return this.stat;
	}

	public void setStat(Boolean stat) {
		this.stat = stat;
	}

	public String getJob() {
		return this.job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEm() {
		return this.em;
	}

	public void setEm(String em) {
		this.em = em;
	}

	public String getDes() {
		return this.des;
	}

	public void setDes(String des) {
		this.des = des;
	}

	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	public Roles getRoles() {
		return roles;
	}

	public void setRoles(Roles roles) {
		this.roles = roles;
	}

}