package com.sso.cas.server.service;

import com.sso.cas.server.model.CasUser;

import java.util.List;

public interface CasUserInterface {

    void insert(CasUser casUser);

    List<CasUser> findAll();

    CasUser findUserByname(String name);

}
