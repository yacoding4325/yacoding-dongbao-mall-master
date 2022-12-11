package com.yacoding.dongbao.ums.mapper;

import com.yacoding.dongbao.ums.entity.UmsMember;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Author yaCoding
 * @create 2022-12-11 下午 9:08
 */
@SpringBootTest(classes = com.yacoding.dongbao.ums.YacodingDongbaoUmsApplication.class)
public class UserMemberTest {

    @Autowired
    UmsMemberMapper umsMemberMapper;

    @Test
    void testInsert() {
        UmsMember t = new UmsMember();
        t.setUsername("cpf2");
        t.setStatus(0);
        t.setPassword("1");
        t.setNote("note");
        t.setNickName("nick");
        t.setEmail("email");
        umsMemberMapper.insert(t);
    }

    @Test
    void testUpdate(){
        UmsMember t = new UmsMember();
        t.setNickName("尴尬");
        t.setId(17L);
        umsMemberMapper.updateById(t);
    }

    @Test
    void testSelect(){
        UmsMember cpf = umsMemberMapper.selectByName("张三");
        System.out.println(cpf.getNickName());
    }

}
