package com.bd10.quartz.quartz;

import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerFactory;
import org.quartz.SimpleTrigger;
import org.quartz.impl.StdSchedulerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author 王青
 * @version V1.0
 * @Project: quartz
 * @Package com.bd10.quartz.quartz
 * @date 2020/1/12 19:15 星期日
 */
@Component
public class Test {

   /* public static void main(String[] args) throws  Exception{
        //要干的事情
        JobDetail  jobDetail=new JobDetail("a",MyJob.class);
        SimpleTrigger  trigger=new SimpleTrigger("t1",SimpleTrigger.REPEAT_INDEFINITELY,3000);
        trigger.setStartTime(new Date(System.currentTimeMillis()+2000));
        SchedulerFactory  factory=new StdSchedulerFactory();
        Scheduler  s1=factory.getScheduler();
        s1.scheduleJob(jobDetail,trigger);
        s1.start();
    }*/

    @Scheduled(cron = "0/2 * * * * ?")
    public   void   schedulerMethod(){
        System.out.println("这是要做的事情"+new  Date());
    }
}
