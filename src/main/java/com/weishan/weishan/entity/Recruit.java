package com.weishan.weishan.entity;

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
@TableName("recruit")
public class Recruit extends Model<Recruit> {

    private static final long serialVersionUID = 1L;

    /**
     * 招募流程
     */
	private Integer rid;
	private Integer pid;
	private String rtitle;
	private String rcontent;
	private String rimg;


	public Integer getRid() {
		return rid;
	}

	public void setRid(Integer rid) {
		this.rid = rid;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getRtitle() {
		return rtitle;
	}

	public void setRtitle(String rtitle) {
		this.rtitle = rtitle;
	}

	public String getRcontent() {
		return rcontent;
	}

	public void setRcontent(String rcontent) {
		this.rcontent = rcontent;
	}

	public String getRimg() {
		return rimg;
	}

	public void setRimg(String rimg) {
		this.rimg = rimg;
	}

	@Override
	protected Serializable pkVal() {
		return this.rid;
	}

}
