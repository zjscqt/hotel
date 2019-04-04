package com.hm.hotel_management.model;

import com.hm.hotel_management.enums.RoomStatus;
import com.hm.hotel_management.enums.RoomType;

import javax.persistence.*;
import java.util.Date;

/**
 * 客房实体类
 */
@Entity
@Table(name = "room")
public class Room {

    @Id
    @Column
    private Integer id;

    /**
     * 客房号
     */
    @Column(name = "room_no")
    private String roomNo;

    /**
     * 客房类型
     */
    @Column(name = "room_type")
    private RoomType roomType;

    /**
     * 入住日期
     */
    @Column(name = "check_in_date")
    private Date checkInDate;

    /**
     * 退房日期
     */
    @Column(name = "check_out_date")
    private Date checkOutDate;

    /**
     * 客房状态
     */
    @Column(name = "room_status")
    private RoomStatus roomStatus;

    /**
     * 床id
     */
    @Column(name = "bed_id")
    private Integer bedId;

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

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public Date getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(Date checkInDate) {
        this.checkInDate = checkInDate;
    }

    public Date getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(Date checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public RoomStatus getRoomStatus() {
        return roomStatus;
    }

    public void setRoomStatus(RoomStatus roomStatus) {
        this.roomStatus = roomStatus;
    }

    public Integer getBedId() {
        return bedId;
    }

    public void setBedId(Integer bedId) {
        this.bedId = bedId;
    }
}
