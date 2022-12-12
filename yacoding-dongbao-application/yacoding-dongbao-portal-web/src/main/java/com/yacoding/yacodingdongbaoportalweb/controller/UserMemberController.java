package com.yacoding.yacodingdongbaoportalweb.controller;

import com.yacoding.dongbao.common.base.annotations.TokenCheck;
import com.yacoding.dongbao.common.base.result.ResultWrapper;
import com.yacoding.dongbao.ums.entity.UmsMember;
import com.yacoding.dongbao.ums.entity.dto.UmsMemberLoginParamDTO;
import com.yacoding.dongbao.ums.entity.dto.UmsMemberRegisterParamDTO;
import com.yacoding.dongbao.ums.service.UmsMemberService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author yaCoding
 * @create 2022-12-12 下午 7:15
 */
@RestController
@RequestMapping("/user-member")
public class UserMemberController {

    @Autowired
    UmsMemberService umsMemberService;

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    /**
     * 获取验证码
     * @return
     */
    @GetMapping("/get-captcha")
    public String getCaptcha(){
        return "获取验证码";
    }

    /**
     * 注册：传入验证码信息
     * @param umsMemberRegisterParamDTO
     * @return
     */
    @PostMapping("/register")
    public ResultWrapper register(@RequestBody @Valid UmsMemberRegisterParamDTO umsMemberRegisterParamDTO){

        return umsMemberService.register(umsMemberRegisterParamDTO);
    }

    @PostMapping("/login")
    public ResultWrapper login(@RequestBody UmsMemberLoginParamDTO umsMemberLoginParamDTO){
        return umsMemberService.login(umsMemberLoginParamDTO);
    }

    @PostMapping("/edit")
    @TokenCheck
    public ResultWrapper edit(@RequestBody UmsMember umsMember){
        System.out.println("edit");
        return umsMemberService.edit(umsMember);
    }

}
