package com.sso.cas.server;

import com.sso.cas.server.mapper.CasUserMapper;
import com.sso.cas.server.model.CasUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ServerApplicationTests {

    @Autowired
    private CasUserMapper casUserMapper;

    @Test
    public void contextLoads() {
        /*CasUser casUser = new CasUser();
        casUser.setId(UUID.randomUUID().toString());
        casUser.setUserName("luojiajia");
        casUser.setUserPassword("ljj123");
        casUser.setCreateDate(new Date());
        casUser.setDelFlag("0");
        casUserMapper.insert(casUser);*/
        List<CasUser> list = casUserMapper.findAll();
        System.out.println(list);
    }

}
