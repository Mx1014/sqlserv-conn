package com.energy.entity;


import lombok.Data;

import java.util.Date;

@Data
public class Device {

    private int id;
    private String code;
    private String name;
    private String parameterType;
    private String infoType;
    private String valueType;
    private String dataUpdateTime;
    private Date value;

}
