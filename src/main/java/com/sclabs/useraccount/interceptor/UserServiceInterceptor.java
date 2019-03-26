package com.sclabs.useraccount.interceptor;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import org.slf4j.Logger;
//import org.slf4j.MDC;


@Component
public class UserServiceInterceptor extends HandlerInterceptorAdapter {

    private final static Logger logger = LoggerFactory.getLogger(UserServiceInterceptor.class);

    private long startTime;

    @Override
    public boolean preHandle
            (HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {

        startTime = System.currentTimeMillis();

        //MDC.put("Transaction Id : ", Long.toString(startTime));
        logger.info("Start time is " + startTime);

        System.out.println("Start time is "+ new Date(startTime));
        return true;
    }
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response,
                           Object handler, ModelAndView modelAndView) throws Exception {

        logger.info("Finish time is " + System.currentTimeMillis());
        //System.out.println("Finish time is " + (new Date(System.currentTimeMillis())) );
        logger.info("Time take for the request is " + (System.currentTimeMillis() - startTime) + " milliseconds");
        System.out.println("Time take for the request is " + (System.currentTimeMillis() - startTime) + " milliseconds" );
    }
    @Override
    public void afterCompletion
            (HttpServletRequest request, HttpServletResponse response, Object
                    handler, Exception exception) throws Exception {

        System.out.println("Request and Response is completed");
    }
}