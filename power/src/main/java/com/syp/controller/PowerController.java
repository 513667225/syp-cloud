package com.syp.controller;

import com.syp.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
public class PowerController {


    @RequestMapping("/getPower.do")
    public Object getPower(){

        Map<String,String> map = new HashMap<>();
        map.put("key","power");
        return map;
    }

}
