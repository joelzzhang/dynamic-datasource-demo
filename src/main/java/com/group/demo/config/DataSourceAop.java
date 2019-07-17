package com.group.demo.config;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author ：ZHANGZHE
 * @description：TODO
 * @date ：Created in 2019/6/25 14:37
 * @version: 1.1.0
 */
@Aspect
@Component
public class DataSourceAop {

    @Pointcut("@annotation(com.group.demo.annotation.Slave) " +
            "|| execution(* com.group.demo.service..*.select*(..)) " +
            "|| execution(* com.group.demo.service..*.get*(..))")
    public void readPointcut() {
    }

    @Pointcut("@annotation(com.group.demo.annotation.Master) " +
            "|| execution(* com.group.demo.service..*.insert*(..)) " +
            "|| execution(* com.group.demo.service..*.add*(..)) " +
            "|| execution(* com.group.demo.service..*.update*(..)) " +
            "|| execution(* com.group.demo.service..*.edit*(..)) " +
            "|| execution(* com.group.demo.service..*.delete*(..)) " +
            "|| execution(* com.group.demo.service..*.remove*(..))")
    public void writePointcut() {
    }

    @Before("readPointcut()")
    public void read() {
        DBContextHolder.slave();
    }

    @Before("writePointcut()")
    public void write() {
        DBContextHolder.master();
    }
}
