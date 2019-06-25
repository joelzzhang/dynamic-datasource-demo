package com.group.demo.dal.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "cm_monitor")
public class Monitor implements Serializable {
    /**
     * 自增ID
     */
    @Id
    @GeneratedValue(generator = "JDBC")
    private Long id;

    /**
     * cron表达式
     */
    @Column(name = "cron_expression")
    private String cronExpression;

    /**
     * 定时任务名称
     */
    @Column(name = "task_name")
    private String taskName;

    /**
     * 任务调用地址
     */
    @Column(name = "task_address")
    private String taskAddress;

    /**
     * 请求方法：GET/POST
     */
    @Column(name = "request_method")
    private String requestMethod;

    /**
     * 状态：1-启用，0-禁用
     */
    private Boolean status;

    /**
     * 创建日期
     */
    @Column(name = "create_date")
    private Date createDate;

    /**
     * 修改日期
     */
    @Column(name = "modify_date")
    private Date modifyDate;

    /**
     * 获取自增ID
     *
     * @return id - 自增ID
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置自增ID
     *
     * @param id 自增ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取cron表达式
     *
     * @return cron_expression - cron表达式
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
     * 获取定时任务名称
     *
     * @return task_name - 定时任务名称
     */
    public String getTaskName() {
        return taskName;
    }

    /**
     * 设置定时任务名称
     *
     * @param taskName 定时任务名称
     */
    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    /**
     * 获取任务调用地址
     *
     * @return task_address - 任务调用地址
     */
    public String getTaskAddress() {
        return taskAddress;
    }

    /**
     * 设置任务调用地址
     *
     * @param taskAddress 任务调用地址
     */
    public void setTaskAddress(String taskAddress) {
        this.taskAddress = taskAddress;
    }

    /**
     * 获取请求方法：GET/POST
     *
     * @return request_method - 请求方法：GET/POST
     */
    public String getRequestMethod() {
        return requestMethod;
    }

    /**
     * 设置请求方法：GET/POST
     *
     * @param requestMethod 请求方法：GET/POST
     */
    public void setRequestMethod(String requestMethod) {
        this.requestMethod = requestMethod;
    }

    /**
     * 获取状态：1-启用，0-禁用
     *
     * @return status - 状态：1-启用，0-禁用
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * 设置状态：1-启用，0-禁用
     *
     * @param status 状态：1-启用，0-禁用
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * 获取创建日期
     *
     * @return create_date - 创建日期
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 设置创建日期
     *
     * @param createDate 创建日期
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取修改日期
     *
     * @return modify_date - 修改日期
     */
    public Date getModifyDate() {
        return modifyDate;
    }

    /**
     * 设置修改日期
     *
     * @param modifyDate 修改日期
     */
    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "id=" + id +
                ", cronExpression='" + cronExpression + '\'' +
                ", taskName='" + taskName + '\'' +
                ", taskAddress='" + taskAddress + '\'' +
                ", requestMethod='" + requestMethod + '\'' +
                ", status=" + status +
                ", createDate=" + createDate +
                ", modifyDate=" + modifyDate +
                '}';
    }
}