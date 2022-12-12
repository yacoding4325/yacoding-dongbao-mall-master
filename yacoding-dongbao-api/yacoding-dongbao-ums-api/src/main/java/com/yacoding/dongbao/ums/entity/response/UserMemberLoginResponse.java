package com.yacoding.dongbao.ums.entity.response;

import com.yacoding.dongbao.ums.entity.UmsMember;
import lombok.Data;

/**
 * @Author yaCoding
 * @create 2022-12-12 下午 10:08
 */
@Data
public class UserMemberLoginResponse {

    private String token;

    private UmsMember umsMember;

}
