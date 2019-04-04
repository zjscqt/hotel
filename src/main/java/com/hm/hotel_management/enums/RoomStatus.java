package com.hm.hotel_management.enums;

/**
 * 客房状态
 */
public enum  RoomStatus {

    EMPT(0),

    CHECKIN(1),

    UNUSER(2);

    private Integer code;

    RoomStatus(Integer code){
        this.code=code;
    }



}
