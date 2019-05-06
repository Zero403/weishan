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
@TableName("organise")
public class Organise extends Model<Organise> {

    private static final long serialVersionUID = 1L;

	@TableId(value="oid", type= IdType.AUTO)
	private Integer oid;
	private String oname;
	private String odesc;



	public String getDticket() {
		return dticket;
	}

	public void setDticket(String dticket) {
		this.dticket = dticket;
	}

	private String dticket;

	public Integer getOid() {
		return oid;
	}

	public void setOid(Integer oid) {
		this.oid = oid;
	}

	public String getOname() {
		return oname;
	}

	public void setOname(String oname) {
		this.oname = oname;
	}

	public String getOdesc() {
		return odesc;
	}

	public void setOdesc(String odesc) {
		this.odesc = odesc;
	}

	@Override
	protected Serializable pkVal() {
		return this.oid;
	}

}
