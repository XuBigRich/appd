package vo;

import java.util.Date;

import tools.DateConverter;

/**
 * Project entity. @author MyEclipse Persistence Tools
 */

public class Project implements java.io.Serializable {

	// Fields

	private Long pid;
	private Long tid;//��Ŀ����
	private Long cid;//��������
	private Long fdid;//�ؼ���Ŀ
	private Long cdid;//�м���Ŀ
	private Long bid;//���赥λ
	private Long vid;
	private Long sid;
	private Long aid;//����������
	private Long stat;
	private Long kid;
	private String mary;
	private String name;//��Ŀ����
	private String pno;
	private String year;//�ϱ����
	private String ress;//��Ŀ��ַ
	private String lat;//γ��
	private String lon;//����
	private Date star;//Ԥ�ƿ���ʱ��
	private Date en;//Ԥ�ƽ���ʱ��
	private Long total;//Ͷ�ʽ��
	private String detail;
	private Long mon;//�������
	private String head;//��Ŀ������
	private String mob;//�����˵绰
	private String des;//��Ŀ�ſ�
	public DateConverter  dc;

	// Constructors

	/** default constructor */
	public Project() {
		
	}

	/** full constructor */
	public Project(Long tid, Long cid, Long fdid, Long cdid, Long bid,
			Long vid, Long sid, Long aid, Long stat, Long kid, String mary,
			String name, String pno, String year, String ress, String lat,
			String lon, Date star, Date en, Long total, String detail,
			Long mon, String head, String mob, String des) {
		this.tid = tid;
		this.cid = cid;
		this.fdid = fdid;
		this.cdid = cdid;
		this.bid = bid;
		this.vid = vid;
		this.sid = sid;
		this.aid = aid;
		this.stat = stat;
		this.kid = kid;
		this.mary = mary;
		this.name = name;
		this.pno = pno;
		this.year = year;
		this.ress = ress;
		this.lat = lat;
		this.lon = lon;
		this.star = star;
		this.en = en;
		this.total = total;
		this.detail = detail;
		this.mon = mon;
		this.head = head;
		this.mob = mob;
		this.des = des;
	}

	// Property accessors

	public Long getPid() {
		return this.pid;
	}

	public void setPid(Long pid) {
		this.pid = pid;
	}

	public Long getTid() {
		return this.tid;
	}

	public void setTid(Long tid) {
		this.tid = tid;
	}

	public Long getCid() {
		return this.cid;
	}

	public void setCid(Long cid) {
		this.cid = cid;
	}

	public Long getFdid() {
		return this.fdid;
	}

	public void setFdid(Long fdid) {
		this.fdid = fdid;
	}

	public Long getCdid() {
		return this.cdid;
	}

	public void setCdid(Long cdid) {
		this.cdid = cdid;
	}

	public Long getBid() {
		return this.bid;
	}

	public void setBid(Long bid) {
		this.bid = bid;
	}

	public Long getVid() {
		return this.vid;
	}

	public void setVid(Long vid) {
		this.vid = vid;
	}

	public Long getSid() {
		return this.sid;
	}

	public void setSid(Long sid) {
		this.sid = sid;
	}

	public Long getAid() {
		return this.aid;
	}

	public void setAid(Long aid) {
		this.aid = aid;
	}

	public Long getStat() {
		return this.stat;
	}

	public void setStat(Long stat) {
		this.stat = stat;
	}

	public Long getKid() {
		return this.kid;
	}

	public void setKid(Long kid) {
		this.kid = kid;
	}

	public String getMary() {
		return this.mary;
	}

	public void setMary(String mary) {
		this.mary = mary;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPno() {
		return this.pno;
	}

	public void setPno(String pno) {
		this.pno = pno;
	}

	public String getYear() {
		return this.year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getRess() {
		return this.ress;
	}

	public void setRess(String ress) {
		this.ress = ress;
	}

	public String getLat() {
		return this.lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getLon() {
		return this.lon;
	}

	public void setLon(String lon) {
		this.lon = lon;
	}

	public Date getStar() {
		return this.star;
	}

	public void setStar(Date star) {
		this.star = star;
	}

	public Date getEn() {
		return this.en;
	}

	public void setEn(Date en) {
		this.en = en;
	}

	public Long getTotal() {
		return this.total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public String getDetail() {
		return this.detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public Long getMon() {
		return this.mon;
	}

	public void setMon(Long mon) {
		this.mon = mon;
	}

	public String getHead() {
		return this.head;
	}

	public void setHead(String head) {
		this.head = head;
	}

	public String getMob() {
		return this.mob;
	}

	public void setMob(String mob) {
		this.mob = mob;
	}

	public String getDes() {
		return this.des;
	}

	public void setDes(String des) {
		this.des = des;
	}

}