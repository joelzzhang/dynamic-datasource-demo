package com.group.demo.dal.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_job")
public class Job {
    /**
     * 任务id
     */
    @Column(name = "JOB_ID")
    private Long jobId;

    /**
     * spring bean名称
     */
    @Column(name = "BEAN_NAME")
    private String beanName;

    /**
     * 方法名
     */
    @Column(name = "METHOD_NAME")
    private String methodName;

    /**
     * 参数
     */
    @Column(name = "PARAMS")
    private String params;

    /**
     * cron表达式
     */
    @Column(name = "CRON_EXPRESSION")
    private String cronExpression;

    /**
     * 任务状态  0：正常  1：暂停
     */
    @Column(name = "STATUS")
    private String status;

    /**
     * 备注
     */
    @Column(name = "REMARK")
    private String remark;

    /**
     * 创建时间
     */
    @Column(name = "CREATE_TIME")
    private Date createTime;

    /**
     * 获取任务id
     *
     * @return JOB_ID - 任务id
     */
    public Long getJobId() {
        return jobId;
    }

    /**
     * 设置任务id
     *
     * @param jobId 任务id
     */
    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }

    /**
     * 获取spring bean名称
     *
     * @return BEAN_NAME - spring bean名称
     */
    public String getBeanName() {
        return beanName;
    }

    /**
     * 设置spring bean名称
     *
     * @param beanName spring bean名称
     */
    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }

    /**
     * 获取方法名
     *
     * @return METHOD_NAME - 方法名
     */
    public String getMethodName() {
        return methodName;
    }

    /**
     * 设置方法名
     *
     * @param methodName 方法名
     */
    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    /**
     * 获取参数
     *
     * @return PARAMS - 参数
     */
    public String getParams() {
        return params;
    }

    /**
     * 设置参数
     *
     * @param params 参数
     */
    public void setParams(String params) {
        this.params = params;
    }

    /**
     * 获取cron表达式
     *
     * @return CRON_EXPRESSION - cron表达式
     */
    public String getCronExpression() {
        return cronExpression;
    }

    /**
     * 设置cron表达式
     *
     * @param cronExpression cron表达式
     */
    public void setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
    }

    /**
     * 获取任务状态  0：正常  1：暂停
     *
     * @return STATUS - 任务状态  0：正常  1：暂停
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置任务状态  0：正常  1：暂停
     *
     * @param status 任务状态  0：正常  1：暂停
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取备注
     *
     * @return REMARK - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取创建时间
     *
     * @return CREATE_TIME - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}