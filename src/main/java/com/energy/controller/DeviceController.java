package com.energy.controller;

import com.energy.service.DeviceService;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
@EnableAutoConfiguration
public class DeviceController {
    @Resource
    private DeviceService deviceService;

    @RequestMapping("/")
    public String index(){
        return "hello world";
    }

    @RequestMapping("/query")
    public int query(){
        return deviceService.query();
    }

    @RequestMapping("/querylist")
    public List<Map<String,Object>> queryList(){
        return deviceService.queryList();
    }
}
