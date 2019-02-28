package com.river.web.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

public class teset {
    final static Logger logger = LoggerFactory.getLogger(teset.class);

    public static void main(String[] args) throws InterruptedException {


        logger.debug("现在的时间是 {}", new Date().toString());
        logger.info(" This time is {}", new Date().toString());

        logger.warn(" This time is {}", new Date().toString());

        logger.error(" This time is {}", new Date().toString());
    }
}