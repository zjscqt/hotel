package com.hm.hotel_management.enums;

/**
 * 房间类型
 */
public enum  RoomType {

    /**
     *小时房
     */
    HOUR("小时房"),

    /**
     * 日房
     */
    DAY("日房"),

    /**
     * 月房
     */
    MONTH("月房");

    private String name;
    RoomType(String name){
        this.name=name;
    }




}
