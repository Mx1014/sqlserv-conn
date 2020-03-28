package com.energy.dao;

import java.util.List;
import java.util.Map;

public interface DeviceDao {
    public int count();
    List<Map<String,Object>> queryList();
}
