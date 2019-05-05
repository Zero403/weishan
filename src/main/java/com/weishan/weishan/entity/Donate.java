package com.weishan.weishan.entity;

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
	private Integer did;
	private Integer uid;
	private Date dtime;
	private Integer dmoney;


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
