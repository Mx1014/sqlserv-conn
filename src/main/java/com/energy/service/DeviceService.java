package com.energy.service;

import com.energy.dao.DeviceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class DeviceService {
    @Autowired
    private DeviceDao deviceDao;

    public int query(){
        return deviceDao.count();
    }

    public List<Map<String,Object>> queryList() {
        return deviceDao.queryList();
    }
}
