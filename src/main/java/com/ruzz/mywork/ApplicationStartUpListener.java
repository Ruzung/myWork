package com.ruzz.mywork;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class ApplicationStartUpListener implements ApplicationListener<ApplicationEvent>{

    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println("onApplicationEvent------执行");
        
    }

}
