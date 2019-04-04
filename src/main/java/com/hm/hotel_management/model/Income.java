package com.hm.hotel_management.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * 收入实体类
 */
@Entity
@Table(name = "Income")
public class Income {

    @Id
    private Integer id;

    /**
     * 客房号
     */
    @Column(name = "room_no")
    private  String roomNo;


    /**
     * 金额
     */
    @Column
    private float incoming;

    /**
     * 结算日期
     */
    @Column(name = "logout_date")
    private Date logoutDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }


    public float getIncoming() {
        return incoming;
    }

    public void setIncoming(float incoming) {
        this.incoming = incoming;
    }

    public Date getLogoutDate() {
        return logoutDate;
    }

    public void setLogoutDate(Date logoutDate) {
        this.logoutDate = logoutDate;
    }
}
