package com.lqyfby.app.led.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 诊室基础信息实体
 * */
public class ClinicRoom implements Serializable {
    //诊室编号(eg:211、A211)
    private String roomId;
    //诊室抬头(eg:消化内科10诊室)
    private String roomTitle;
    //诊室所属led编号
    private String ledId;
    //启用标识(Y、N)
    private String useFlag;
    //led备注信息
    private String ledRemark;
    //诊室和科室对应关系
    private String deptNos;
    private Date instDate;
    private Date updtDate;
}
