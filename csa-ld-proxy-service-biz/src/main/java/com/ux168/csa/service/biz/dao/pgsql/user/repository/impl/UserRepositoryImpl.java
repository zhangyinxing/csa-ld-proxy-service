package com.ux168.csa.service.biz.dao.pgsql.user.repository.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ux168.csa.service.biz.dao.pgsql.user.mapper.UserMapper;
import com.ux168.csa.service.biz.dao.pgsql.user.po.UserPO;
import com.ux168.csa.service.biz.dao.pgsql.user.repository.UserRepository;
import com.ux168.csa.service.biz.service.user.bo.UserListReqBO;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * description: 用户 Repository Impl
 *
 * @author zhang yinxing
 * @date 2025/3/20
 */
@Repository
public class UserRepositoryImpl implements UserRepository {
    @Resource
    private UserMapper userMapper;

    @Override
    public List<UserPO> selectList(UserListReqBO userCondition) {
        QueryWrapper<UserPO> queryWrapper = new QueryWrapper<>();
        queryWrapper.in(CollectionUtils.isNotEmpty(userCondition.getUserAccountList()),"useraccount",userCondition.getUserAccountList());
        return userMapper.selectList(queryWrapper);
    }
}
