package com.lqyfby.app.led.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;

/**
 * 就诊区域Led基础信息实体
 * */
public class AreaLed implements Serializable {
    //led编号
    private String ledId;
    //led对用工作站IP地址
    private String ledStationIp;
    //当前led头部显示信息(eg:儿科门诊A区)
    private String ledTitle;
    //led描述信息
    private String ledDesc;
    //当前led诊室数量(eg:1—8)
    private int ledBlockNum;
    //工作模式(1-手动，2-自动)
    private String workType;
    //启用标识(Y、N)
    private String useFlag;
    //led备注信息
    private String ledRemark;
    private Date instDate;
    private Date updtDate;
    //当前led包含的诊室集合Integer决定诊室在Led中显示的位置
    private Map<Integer, ClinicRoom> clinicRoomMap;
}
