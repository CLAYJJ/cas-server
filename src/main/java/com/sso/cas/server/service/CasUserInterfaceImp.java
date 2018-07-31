package com.sso.cas.server.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.sso.cas.server.mapper.CasUserMapper;
import com.sso.cas.server.model.CasUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CasUserInterfaceImp implements CasUserInterface {
    @Autowired
    private CasUserMapper casUserMapper;


    @Override
    public void insert(CasUser casUser) {
        casUserMapper.insert(casUser);
    }

    @Override
    public List<CasUser> findAll() {
        return casUserMapper.findAll();
    }

    @Override
    public CasUser findUserByname(String name) {
        return casUserMapper.findUserByname(name);
    }
}
