package com.environmental.service.imp;

import com.environmental.dao.EnvAllinfoMapper;
import com.environmental.entity.EnvAllinfo;
import com.environmental.service.infoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("infoService")
public class infoServiceImp implements infoService {

    @Autowired
    EnvAllinfoMapper envAllinfoMapper;

    @Override
    public EnvAllinfo getEnvAllinfo() {
        return null;
    }

    @Override
    public List<EnvAllinfo> getTodayInfo() {
        return null;
    }

    @Override
    public List<EnvAllinfo> getThisWeekInfo() {
        return null;
    }

    @Override
    public List<EnvAllinfo> getThisMonInfo() {
        return null;
    }

    @Override
    public int addEnvAllinfos(List<EnvAllinfo> lists) {
        return 0;
    }
}
