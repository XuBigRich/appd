package vo;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Funs entity. @author MyEclipse Persistence Tools
 */

public class Funs implements java.io.Serializable {

	// Fields

	private Long fid;
	private Long pfid;
	private String uri;
	private String des;
	
	private  Set child;
	
	private Set roles=new HashSet(0);

	// Constructors

	/** default constructor */
	public Funs() {
	}

	/** full constructor */
	public Funs(Long pfid, String uri, String des) {
		this.pfid = pfid;
		this.uri = uri;
		this.des = des;
	}

	// Property accessors

	public Long getFid() {
		return this.fid;
	}

	public void setFid(Long fid) {
		this.fid = fid;
	}

	public Long getPfid() {
		return this.pfid;
	}

	public void setPfid(Long pfid) {
		this.pfid = pfid;
	}

	public String getUri() {
		return this.uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public String getDes() {
		return this.des;
	}

	public void setDes(String des) {
		this.des = des;
	}

	public Set getRoles() {
		return roles;
	}

	public void setRoles(Set roles) {
		this.roles = roles;
	}

	public Set getChild() {
		return child;
	}

	public void setChild(Set child) {
		this.child = child;
	}


	@Override
	public String toString() {
		return "Funs{" +
				"fid=" + fid +
				", pfid=" + pfid +
				", uri='" + uri + '\'' +
				", des='" + des + '\'' +
				", child=" + child +
				", roles=" + roles +
				'}';
	}
}