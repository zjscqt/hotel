package com.hm.hotel_management.model;

import com.hm.hotel_management.enums.BedType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 床
 */
@Entity
@Table(name = "bed")
public class Bed {

    @Id
    private Integer id;

    /**
     * 房间号
     */
    @Column(name = "room_no")
    private Integer roomNo;

    /**
     * 床名称
     */
    @Column
    private String name;

    /**
     * 床类型
     */
    @Column(name = "bed_type")
    private BedType bedType;

    /**
     * 床型号
     */
    @Column
    private String size;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(Integer roomNo) {
        this.roomNo = roomNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BedType getBedType() {
        return bedType;
    }

    public void setBedType(BedType bedType) {
        this.bedType = bedType;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
