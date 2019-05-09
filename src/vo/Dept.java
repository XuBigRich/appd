package vo;

/**
 * Dept entity. @author MyEclipse Persistence Tools
 */

public class Dept implements java.io.Serializable {

	// Fields

	private Long did;
	private Long pdid;
	private Long tid;
	private Long bid;
	private String name;
	private String ress;
	private String tel;
	private String tact;
	private String mob;

	// Constructors

	/** default constructor */
	public Dept() {
	}

	/** full constructor */
	public Dept(Long pdid, Long tid, Long bid, String name, String ress,
			String tel, String tact, String mob) {
		this.pdid = pdid;
		this.tid = tid;
		this.bid = bid;
		this.name = name;
		this.ress = ress;
		this.tel = tel;
		this.tact = tact;
		this.mob = mob;
	}

	// Property accessors

	public Long getDid() {
		return this.did;
	}

	public void setDid(Long did) {
		this.did = did;
	}

	public Long getPdid() {
		return this.pdid;
	}

	public void setPdid(Long pdid) {
		this.pdid = pdid;
	}

	public Long getTid() {
		return this.tid;
	}

	public void setTid(Long tid) {
		this.tid = tid;
	}

	public Long getBid() {
		return this.bid;
	}

	public void setBid(Long bid) {
		this.bid = bid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getMob() {
		return this.mob;
	}

	public void setMob(String mob) {
		this.mob = mob;
	}

}