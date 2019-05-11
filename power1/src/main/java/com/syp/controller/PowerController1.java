package com.syp.controller;

import com.syp.util.R;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class PowerController1 {

    @RequestMapping("/getPower.do")
    public Object getPower(){
        Map<String,String> map =  new HashMap<>();
        map.put("key","power1");
        return map;
    }
}
