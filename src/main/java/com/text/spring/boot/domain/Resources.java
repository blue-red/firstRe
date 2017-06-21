package com.text.spring.boot.domain;

import javax.persistence.*;

/**
 * Created by jack.wang on 2017/6/20.
 */
@Entity
@Table(name = "resources")
public class Resources {

    @GeneratedValue
    @Id
    @Column(name = "res_id")
    private Long resId;

    @Column(name = "res_type")
    private String resType;

    @Column(name = "res_title")
    private String resTitle;

    @Column(name = "res_uuid")
    private String resUuid;

    public Long getResId() {
        return resId;
    }

    public void setResId(Long resId) {
        this.resId = resId;
    }

    public String getResType() {
        return resType;
    }

    public void setResType(String resType) {
        this.resType = resType;
    }

    public String getResTitle() {
        return resTitle;
    }

    public void setResTitle(String resTitle) {
        this.resTitle = resTitle;
    }

    public String getResUuid() {
        return resUuid;
    }

    public void setResUuid(String resUuid) {
        this.resUuid = resUuid;
    }
}
