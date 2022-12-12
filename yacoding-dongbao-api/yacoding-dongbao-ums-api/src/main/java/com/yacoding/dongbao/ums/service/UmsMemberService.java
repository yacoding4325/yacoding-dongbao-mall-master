package com.yacoding.dongbao.ums.service;


import com.yacoding.dongbao.common.base.result.ResultWrapper;
import com.yacoding.dongbao.ums.entity.UmsMember;
import com.yacoding.dongbao.ums.entity.dto.UmsMemberLoginParamDTO;
import com.yacoding.dongbao.ums.entity.dto.UmsMemberRegisterParamDTO;

/**
 * <p>
 * 后台用户表 服务类
 * </p>
 *
 * @author yacoding
 * @since 2022-12-11
 */

public interface UmsMemberService  {

    ResultWrapper register(UmsMemberRegisterParamDTO umsMemberREgisterParamDTO);

    ResultWrapper login(UmsMemberLoginParamDTO umsMemberLoginParamDTO);

    ResultWrapper edit(UmsMember umsMember);

}
