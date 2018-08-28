package com.lqyfby.app.led.model;

import java.io.Serializable;

/**
 * 病人挂号队列信息(提取自His数据),用于Led显示及MQ消息传输
 * */
public class PatientQueue implements Serializable {
    //病人挂号序号
    private String patGhNo;
    //病人姓名
    private String patName;
    //病人挂号医生编号
    private String patDocNo;
    //病人挂号医生姓名
    private String patDocName;
    //病人挂号科室编号
    private String patDeptNo;
    //病人挂号科室名称
    private String patDeptName;
    //病人挂号时间
    private String patGhDate;
    //病人预约就诊时间
    private String patJzDate;
}
