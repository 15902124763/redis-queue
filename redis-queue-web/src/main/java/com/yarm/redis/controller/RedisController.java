package com.yarm.redis.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("redis")
public class RedisController {

    @RequestMapping(value = "set",method = RequestMethod.POST)
    public String setRedis(){
        return "";
    }

    @RequestMapping(value = "get/{key}", method = RequestMethod.GET)
    public String getRedis(@PathVariable("key") String key){
        System.out.println(key);
        return key;
    }

}
