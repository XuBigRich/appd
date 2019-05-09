package vo;

/**
 * Money entity. @author MyEclipse Persistence Tools
 */

public class Money implements java.io.Serializable {

	// Fields

	private Long pid;
	private Long total;//总投资
	private Long cou;//国家拨款
	private Long pro;//省拨款
	private Long city;//市拨款
	private Long dist;
	private Long com;

	// Constructors

	/** default constructor */
	public Money() {
	}

	/** full constructor */
	public Money(Long total, Long cou, Long pro, Long city, Long dist, Long com) {
		this.total = total;
		this.cou = cou;
		this.pro = pro;
		this.city = city;
		this.dist = dist;
		this.com = com;
	}

	// Property accessors

	public Long getPid() {
		return this.pid;
	}

	public void setPid(Long pid) {
		this.pid = pid;
	}

	public Long getTotal() {
		return this.total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public Long getCou() {
		return this.cou;
	}

	public void setCou(Long cou) {
		this.cou = cou;
	}

	public Long getPro() {
		return this.pro;
	}

	public void setPro(Long pro) {
		this.pro = pro;
	}

	public Long getCity() {
		return this.city;
	}

	public void setCity(Long city) {
		this.city = city;
	}

	public Long getDist() {
		return this.dist;
	}

	public void setDist(Long dist) {
		this.dist = dist;
	}

	public Long getCom() {
		return this.com;
	}

	public void setCom(Long com) {
		this.com = com;
	}

}