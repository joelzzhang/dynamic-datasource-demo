package com.group.demo.service;

import com.group.demo.dal.mapper.JobMapper;
import com.group.demo.dal.mapper.MonitorMapper;
import com.group.demo.dal.model.Job;
import com.group.demo.dal.model.Monitor;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ：ZHANGZHE
 * @description：TODO
 * @date ：Created in 2019/6/25 15:27
 * @version: 1.1.0
 */
@Service
public class MonitorService {
    @Resource
    private MonitorMapper monitorMapper;
    @Resource
    private JobMapper jobMapper;

    public String insertMonitor(){
        Monitor monitor = new Monitor();
        monitor.setCronExpression("0 0/2 * * * ?");
        monitor.setTaskName("task_three");
        monitor.setTaskAddress("http://127.0.0.1:80/getSchedule");
        monitor.setRequestMethod("GET");
        monitor.setStatus(false);
        monitorMapper.insertSelective(monitor);
        return "success";
    }

    public List<Job> getMonitor(){
        return jobMapper.selectAll();
    }

}
