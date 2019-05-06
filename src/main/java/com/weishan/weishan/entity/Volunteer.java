package com.weishan.weishan.entity;

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
@TableName("volunteer")
public class Volunteer extends Model<Volunteer> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
	private String vrealname;
	private String vidnum;
	private Integer vage;
	private Integer vgender;
	private Integer vfeature;
	private String vbusiness;
	private String vwork;
	private Integer pid;
	private String vdesc;
	private Integer uid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVrealname() {
        return vrealname;
    }

    public void setVrealname(String vrealname) {
        this.vrealname = vrealname;
    }

    public String getVidnum() {
        return vidnum;
    }

    public void setVidnum(String vidnum) {
        this.vidnum = vidnum;
    }

    public Integer getVage() {
        return vage;
    }

    public void setVage(Integer vage) {
        this.vage = vage;
    }

    public Integer getVgender() {
        return vgender;
    }

    public void setVgender(Integer vgender) {
        this.vgender = vgender;
    }

    public Integer getVfeature() {
        return vfeature;
    }

    public void setVfeature(Integer vfeature) {
        this.vfeature = vfeature;
    }

    public String getVbusiness() {
        return vbusiness;
    }

    public void setVbusiness(String vbusiness) {
        this.vbusiness = vbusiness;
    }

    public String getVwork() {
        return vwork;
    }

    public void setVwork(String vwork) {
        this.vwork = vwork;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getVdesc() {
        return vdesc;
    }

    public void setVdesc(String vdesc) {
        this.vdesc = vdesc;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    @Override
	protected Serializable pkVal() {
		return this.id;
	}

}
