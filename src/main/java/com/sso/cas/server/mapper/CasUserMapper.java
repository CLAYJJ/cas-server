package com.sso.cas.server.mapper;

import com.sso.cas.server.model.CasUser;

import java.util.List;

public interface CasUserMapper {


    void insert(CasUser casUser);

    List<CasUser> findAll();

    CasUser findUserByname(String name);
}
