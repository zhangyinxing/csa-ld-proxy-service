package com.ux168.csa.service.biz.service.user.impl;

import com.ux168.csa.service.biz.dao.pgsql.user.po.UserPO;
import com.ux168.csa.service.biz.dao.pgsql.user.repository.UserRepository;
import com.ux168.csa.service.biz.service.user.UserService;
import com.ux168.csa.service.biz.service.user.bo.UserBO;
import com.ux168.csa.service.biz.service.user.bo.UserListReqBO;
import com.ux168.platform.infrastructure.common.convert.BaseConvert;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * description: 用户 Service 实现类
 *
 * @author zhang yinxing
 * @date 2025/3/20
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserRepository userRepository;

    @Override
    public List<UserBO> list(UserListReqBO reqBo) {
        List<UserPO> list = userRepository.selectList(reqBo);
        List<UserBO> userBoList = BaseConvert.convertList(list, UserBO.class);
        return userBoList;
    }
}
