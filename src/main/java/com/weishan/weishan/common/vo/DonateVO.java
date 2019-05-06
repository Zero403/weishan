package com.weishan.weishan.common.vo;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.weishan.weishan.entity.Donate;

import java.util.Date;

/**
 * <p>
 *
 * </p>
 *
 * @author ${author}
 * @since 2019-05-04
 */
public class DonateVO extends Model<Donate> {

    private static final long serialVersionUID = 1L;

    /**
     * 捐赠
     */
    private Integer did;
    private Integer uid;

    public String getVrealname() {
        return vrealname;
    }

    public void setVrealname(String vrealname) {
        this.vrealname = vrealname;
    }

    private String vrealname;
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
