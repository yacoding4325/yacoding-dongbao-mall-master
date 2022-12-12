package com.yacoding.dongbao.ums.entity.dto;

import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.ToString;

/**
 * @Author yaCoding
 * @create 2022-12-12 下午 8:51
 */
@Data
@ToString
public class UmsMemberRegisterParamDTO {

    @Size(min = 1,max = 8,message = "用户名长度在1-8之间")
    private String username;

    private String password;

}
