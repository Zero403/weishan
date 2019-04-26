package com.weishan.weishan;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("hello.do")
    public String demo(){
        return "你好 世界";
    }
}
