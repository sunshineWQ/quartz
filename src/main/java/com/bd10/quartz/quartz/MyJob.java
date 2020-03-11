package com.bd10.quartz.quartz;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.util.Date;

/**
 * @author 王青
 * @version V1.0
 * @Project: quartz
 * @Package com.bd10.quartz.quartz
 * @date 2020/1/12 19:14 星期日
 */
public class MyJob   implements Job{
    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("这是要做的事情"+new Date());
    }
}
