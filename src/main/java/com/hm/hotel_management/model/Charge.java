package com.hm.hotel_management.model;

import com.hm.hotel_management.enums.RoomType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 *定价
 */
@Entity
@Table(name = "charge")
public class Charge {

    @Id
    private Integer id;

    /**
     * 房间号
     */
    @Column(name = "room_no")
    private String roomNo;

    /**
     * 时间单位
     */
    @Column(name ="time_unit")
    private RoomType timeUnit;

    /**
     * 时间数量
     */
    @Column
    private Integer count;

    /**
     * 金额
     */
    @Column
    private float money;

    /**
     * 起始日期
     */
    @Column(name = "start_date")
    private Date startDate;

    /**
     * 截止日期
     */
    @Column(name = "end_date")
    private Date endDate;

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

    public RoomType getTimeUnit() {
        return timeUnit;
    }

    public void setTimeUnit(RoomType timeUnit) {
        this.timeUnit = timeUnit;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
