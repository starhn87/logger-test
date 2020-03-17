package com.daumsoft.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
public class MainController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/test")
    @ResponseBody
    public String start() {
        logger.info("test");
        return "test";
    }
}