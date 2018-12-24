package com.tanoak.tkdocker.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author tanoak@qq.com
 * @date 2018/12/25 0:36
 * @Desc 首页
 */
@Controller
public class IndexController {
    
    @GetMapping("/index")
    public String index(){
        return "index";
    }
    
    @GetMapping("/json")
    @ResponseBody
    public Map<String, Object> toJson(){
        Map<String, Object> map = new HashMap<>();
        map.put("name", "张三");
        map.put("age",18);
        return map;
    }
}
