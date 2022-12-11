package com.yacoding.dongbao.ums.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yacoding.dongbao.ums.entity.UmsMember;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 后台用户表 Mapper 接口
 * </p>
 *
 */
@Repository
public interface UmsMemberMapper extends BaseMapper<UmsMember> {

	UmsMember selectByName(String name);

}
