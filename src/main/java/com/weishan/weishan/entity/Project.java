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
	private String contentnum;
    /**
     * 转发次数
     */
	private Integer tranpondtimes;
	private Integer liketimes;
	private Integer lotiontype;
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

	public String getContentnum() {
		return contentnum;
	}

	public void setContentnum(String contentnum) {
		this.contentnum = contentnum;
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
		return lotiontype;
	}

	public void setLotiontype(Integer lotiontype) {
		this.lotiontype = lotiontype;
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
