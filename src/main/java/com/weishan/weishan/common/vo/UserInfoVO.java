package com.weishan.weishan.common.vo;

/**
 * @Author: Ery
 * @Date: 2019/5/5 20:59
 * @Version null
 */
public class UserInfoVO {
    private String phone;
    private String headimg;
    private String username;
    private Integer attention;
    private Integer noticer;
    private Integer messagrs;
    private Integer organizations;
    private Integer medals;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getHeadimg() {
        return headimg;
    }

    public void setHeadimg(String headimg) {
        this.headimg = headimg;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAttention() {
        return attention;
    }

    public void setAttention(Integer attention) {
        this.attention = attention;
    }

    public Integer getNoticer() {
        return noticer;
    }

    public void setNoticer(Integer noticer) {
        this.noticer = noticer;
    }

    public Integer getMessagrs() {
        return messagrs;
    }

    public void setMessagrs(Integer messagrs) {
        this.messagrs = messagrs;
    }

    public Integer getOrganizations() {
        return organizations;
    }

    public void setOrganizations(Integer organizations) {
        this.organizations = organizations;
    }

    public Integer getMedals() {
        return medals;
    }

    public void setMedals(Integer medals) {
        this.medals = medals;
    }
}
