package com.group.demo.config;

import com.group.demo.enums.DBTypeEnum;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author ：ZHANGZHE
 * @description：TODO
 * @date ：Created in 2019/6/25 14:34
 * @version: 1.1.0
 */
public class DBContextHolder {
    private static final ThreadLocal<DBTypeEnum> contextHolder = new ThreadLocal<>();
    private static final AtomicInteger counter = new AtomicInteger(-1);
    private static final int MAX_VALUE = 9999;

    public static void set(DBTypeEnum dbType) {
        contextHolder.set(dbType);
    }

    public static DBTypeEnum get() {
        return contextHolder.get();
    }

    public static void master() {
        set(DBTypeEnum.MASTER);
        System.out.println("切换到master");
    }

    public static void slave() {
        //  轮询
        int index = counter.getAndIncrement() % 2;
        if (counter.get() > MAX_VALUE) {
            counter.set(-1);
        }
        if (index == 0) {
            set(DBTypeEnum.SLAVE);
            System.out.println("切换到slave1");
        } else {
            set(DBTypeEnum.SLAVE);
            System.out.println("切换到slave2");
        }
    }
}
