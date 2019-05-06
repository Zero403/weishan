package com.weishan.weishan.entity;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author ${author}
 * @since 2019-05-04
 */
@TableName("project")
public class Project extends Model<Project> {

    private static final long serialVersionUID = 1L;

	@TableId(value="pid", type= IdType.AUTO)
	private Integer pid;
	private Date startdate;
	private Date enddate;
	private String location;
	private String linker;
	private Integer oid;
	private Integer type;
	private String pname;
	private String pdesc;
	private String img;
	private Integer contentnum;

	private String dtarget;
	private String dpurpose;
	private String dticket;
	private Integer dnum;
	private String uuid;
	private String entrytype;
	private String mailtitle;
	private String prequire;
	private String realm;
	private String pcontent;

	public Integer getContentnum() {
		return contentnum;
	}

	public void setContentnum(Integer contentnum) {
		this.contentnum = contentnum;
	}

	public String getDticket() {
		return dticket;
	}

	public void setDticket(String dticket) {
		this.dticket = dticket;
	}

	public Integer getDnum() {
		return dnum;
	}

	public void setDnum(Integer dnum) {
		this.dnum = dnum;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getEntrytype() {
		return entrytype;
	}

	public void setEntrytype(String entrytype) {
		this.entrytype = entrytype;
	}

	public String getMailtitle() {
		return mailtitle;
	}

	public void setMailtitle(String mailtitle) {
		this.mailtitle = mailtitle;
	}

	public String getPrequire() {
		return prequire;
	}

	public void setPrequire(String prequire) {
		this.prequire = prequire;
	}

	public String getRealm() {
		return realm;
	}

	public void setRealm(String realm) {
		this.realm = realm;
	}

	public String getPcontent() {
		return pcontent;
	}

	public void setPcontent(String pcontent) {
		this.pcontent = pcontent;
	}

	public String getPbase() {
		return pbase;
	}

	public void setPbase(String pbase) {
		this.pbase = pbase;
	}

	private String pbase;


	public Integer getOtype() {
		return otype;
	}

	public void setOtype(Integer otype) {
		this.otype = otype;
	}

	private String dpeople;
	private Integer otype;

	public String getDtarget() {
		return dtarget;
	}

	public void setDtarget(String dtarget) {
		this.dtarget = dtarget;
	}

	public String getDpurpose() {
		return dpurpose;
	}

	public void setDpurpose(String dpurpose) {
		this.dpurpose = dpurpose;
	}

	public String getDpeople() {
		return dpeople;
	}

	public void setDpeople(String dpeople) {
		this.dpeople = dpeople;
	}

	public String getDaset() {
		return daset;
	}

	public void setDaset(String daset) {
		this.daset = daset;
	}

	public String getDexec() {
		return dexec;
	}

	public void setDexec(String dexec) {
		this.dexec = dexec;
	}

	public Integer getLocationtype() {
		return locationtype;
	}

	public void setLocationtype(Integer locationtype) {
		this.locationtype = locationtype;
	}

	private String daset;
	private String dexec;
    /**
     * 转发次数
     */
	private Integer tranpondtimes;
	private Integer liketimes;
	private Integer locationtype;
    /**
     * 注意事项
     */
	private String attention;



	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public Date getStartdate() {
		return startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	public Date getEnddate() {
		return enddate;
	}

	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getLinker() {
		return linker;
	}

	public void setLinker(String linker) {
		this.linker = linker;
	}

	public Integer getOid() {
		return oid;
	}

	public void setOid(Integer oid) {
		this.oid = oid;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPdesc() {
		return pdesc;
	}

	public void setPdesc(String pdesc) {
		this.pdesc = pdesc;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public Integer getTranpondtimes() {
		return tranpondtimes;
	}

	public void setTranpondtimes(Integer tranpondtimes) {
		this.tranpondtimes = tranpondtimes;
	}

	public Integer getLiketimes() {
		return liketimes;
	}

	public void setLiketimes(Integer liketimes) {
		this.liketimes = liketimes;
	}

	public Integer getLotiontype() {
		return locationtype;
	}

	public void setLotiontype(Integer lotiontype) {
		this.locationtype = lotiontype;
	}

	public String getAttention() {
		return attention;
	}

	public void setAttention(String attention) {
		this.attention = attention;
	}

	@Override
	protected Serializable pkVal() {
		return this.pid;
	}

}
