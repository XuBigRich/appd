package vo;

/**
 * Base entity. @author MyEclipse Persistence Tools
 */

public class Base implements java.io.Serializable {

	// Fields

	private Long bid;
	private Long pbid;
	private String code;
	private String name;
	private Byte dex;
	private String des;

	// Constructors

	/** default constructor */
	public Base() {
	}

	/** full constructor */
	public Base(Long pbid, String code, String name, Byte dex, String des) {
		this.pbid = pbid;
		this.code = code;
		this.name = name;
		this.dex = dex;
		this.des = des;
	}

	// Property accessors

	public Long getBid() {
		return this.bid;
	}

	public void setBid(Long bid) {
		this.bid = bid;
	}

	public Long getPbid() {
		return this.pbid;
	}

	public void setPbid(Long pbid) {
		this.pbid = pbid;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Byte getDex() {
		return this.dex;
	}

	public void setDex(Byte dex) {
		this.dex = dex;
	}

	public String getDes() {
		return this.des;
	}

	public void setDes(String des) {
		this.des = des;
	}

}