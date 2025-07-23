package com.ux168.csa.service.biz.dao.pgsql.user.repository;


import com.ux168.csa.service.biz.dao.pgsql.user.po.UserPO;
import com.ux168.csa.service.biz.service.user.bo.UserListReqBO;

import java.util.List;

/**
 * description: 用户 Repository
 *
 * @author zhang yinxing
 * @date 2025/3/20
 */
public interface UserRepository{


    List<UserPO> selectList(UserListReqBO userCondition);
}
