package com.hm.hotel_management.enums;

/**
 * 床类型
 */
public enum  BedType {

    THREE_PEOPLE("三人间"),

    TWO_PEOPLE("双人间"),

    ONE_PEOPLE("单人间");

    private String name;
    BedType(String name){
        this.name=name;
    }
}
