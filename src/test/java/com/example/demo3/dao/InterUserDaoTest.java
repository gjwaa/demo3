package com.example.demo3.dao;

import com.example.demo3.bean.UserInfo;
import com.example.demo3.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.List;

public class InterUserDaoTest {
    @Test
    public void test(){
        SqlSession sqlsession = MybatisUtil.getSqlsession();
        InterUserDao mapper = sqlsession.getMapper(InterUserDao.class);
        List<UserInfo> userInfos = mapper.selectUserInfo();
        for(UserInfo userInfo:userInfos){
            System.out.println(userInfo);
        }
        sqlsession.close();


    }


}
