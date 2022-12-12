package com.yacoding.dongbao.ums.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.yacoding.dongbao.common.base.enums.StateCodeEnum;
import com.yacoding.dongbao.common.base.result.ResultWrapper;
import com.yacoding.dongbao.ums.entity.UmsMember;
import com.yacoding.dongbao.ums.entity.dto.UmsMemberLoginParamDTO;
import com.yacoding.dongbao.ums.entity.dto.UmsMemberRegisterParamDTO;
import com.yacoding.dongbao.ums.entity.response.UserMemberLoginResponse;
import com.yacoding.dongbao.ums.mapper.UmsMemberMapper;
import com.yacoding.dongbao.ums.service.UmsMemberService;
import com.yacoding.yacodingdongbaocommonutil.JwtUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * @Author yaCoding
 * @create 2022-12-11 下午 2:57
 */
// 后台用户表 服务实现类
@Service
public class UmsMemberServiceImpl implements UmsMemberService {

    @Autowired
    UmsMemberMapper umsMemberMapper;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public ResultWrapper register(UmsMemberRegisterParamDTO umsMemberREgisterParamDTO) {
        UmsMember umsMember = new UmsMember();
        BeanUtils.copyProperties(umsMemberREgisterParamDTO,umsMember);
        String encode = passwordEncoder.encode(umsMemberREgisterParamDTO.getPassword());
        umsMember.setPassword(encode);
        umsMemberMapper.insert(umsMember);
        return ResultWrapper.getSuccessBuilder().build();
    }

    @Override
    public ResultWrapper login(UmsMemberLoginParamDTO umsMemberLoginParamDTO) {
        UmsMember umsMember = umsMemberMapper.selectByName(umsMemberLoginParamDTO.getUsername());
        if (umsMember != null) {
            String passwordDb = umsMember.getPassword();
            if(!passwordEncoder.matches(umsMemberLoginParamDTO.getPassword(),passwordDb)){
                return ResultWrapper.getFailBuilder().code(StateCodeEnum.PASSWORD_ERROR.getCode()).msg(StateCodeEnum.PASSWORD_ERROR.getMsg()).build();
            }
        } else {
            return ResultWrapper.getFailBuilder().code(StateCodeEnum.USER_EMPTY.getCode()).msg(StateCodeEnum.USER_EMPTY.getMsg()).build();
        }
        String token = JwtUtil.createToken(umsMember.getId()+"");
        UserMemberLoginResponse userMemberLoginResponse = new UserMemberLoginResponse();
        userMemberLoginResponse.setToken(token);
        umsMember.setPassword("");
        userMemberLoginResponse.setUmsMember(umsMember);
        return ResultWrapper.getSuccessBuilder().data(userMemberLoginResponse).build();
    }

    @Override
    public ResultWrapper edit(UmsMember umsMember) {
        umsMemberMapper.updateById(umsMember);
        return ResultWrapper.getSuccessBuilder().data(umsMember).build();
    }

}
