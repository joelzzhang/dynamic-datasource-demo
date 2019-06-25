package com.group.demo.config;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * @author ：ZHANGZHE
 * @description：TODO
 * @date ：Created in 2019/6/25 14:26
 * @version: 1.1.0
 */
public class MyRoutingDataSource extends AbstractRoutingDataSource{
    @Override
    protected Object determineCurrentLookupKey() {
        return DBContextHolder.get();
    }
}
