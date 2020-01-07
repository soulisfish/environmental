package com.environmental.service;

import com.environmental.entity.EnvAllinfo;

import java.util.List;

public interface infoService {

    EnvAllinfo  getEnvAllinfo();
    List<EnvAllinfo> getTodayInfo();
    List<EnvAllinfo> getThisWeekInfo();
    List<EnvAllinfo> getThisMonInfo();
    int addEnvAllinfos(List<EnvAllinfo> lists);

}
