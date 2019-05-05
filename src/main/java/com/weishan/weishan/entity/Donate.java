package com.weishan.weishan.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.util.Date;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author ${author}
 * @since 2019-05-04
 */
@TableName("donate")
public class Donate extends Model<Donate> {

    private static final long serialVersionUID = 1L;

    /**
     * 捐赠
     */
	@TableId(value="did", type= IdType.AUTO)
	private Integer did;
	private Integer uid;
	private Date dtime;
	private Integer dmoney;
	private Integer pid;
	private Integer dtype;

	public Integer getDtype() {
		return dtype;
	}

	public void setDtype(Integer dtype) {
		this.dtype = dtype;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public Integer getDid() {
		return did;
	}

	public void setDid(Integer did) {
		this.did = did;
	}

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public Date getDtime() {
		return dtime;
	}

	public void setDtime(Date dtime) {
		this.dtime = dtime;
	}

	public Integer getDmoney() {
		return dmoney;
	}

	public void setDmoney(Integer dmoney) {
		this.dmoney = dmoney;
	}


}
