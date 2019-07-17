package com.group.demo;

import com.group.demo.controller.MonitorController;
import com.group.demo.dal.model.Job;
import com.group.demo.service.MonitorService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import tk.mybatis.spring.annotation.MapperScan;

import java.util.List;

/**
 * @author ：ZHANGZHE
 * @description：TODO
 * @date ：Created in 2019/6/25 15:47
 * @version: 1.1.0
 */
@SpringBootTest
@RunWith(SpringRunner.class)
@MapperScan({"com.group.demo.dal.mapper"})
public class MonitorTest {
    @Autowired
    private MonitorService monitorService;
    @Autowired
    private MonitorController monitorController;

    @Test
    public void testRead() {
        List<Job> list = monitorService.getMonitor();
        System.out.println(list.size()+"==============");
    }
    @Test
    public void testWrite() {
        String list = monitorService.insertMonitor();
        System.out.println(list+"==============");
    }
@Test
    public void testReadController() {
        List<Job> list = monitorController.getMonitor();
        System.out.println(list.size()+"==============");
    }
    @Test
    public void testWriteController() {
        String list = monitorController.insertMonitor();
        System.out.println(list+"==============");
    }


}
