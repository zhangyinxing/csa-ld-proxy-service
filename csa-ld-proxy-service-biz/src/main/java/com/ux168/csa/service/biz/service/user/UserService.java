package com.ux168.csa.service.biz.service.user;

import com.ux168.csa.service.biz.service.user.bo.UserBO;
import com.ux168.csa.service.biz.service.user.bo.UserListReqBO;

import java.util.List;

/**
 * description:
 *
 * @author zhang yinxing
 * @date 2025/3/20
 */
public interface UserService {
    /**
     * description: 人员查询
     * @author zhangyinxing
     * @date 下午3:48 2025/3/20
     * @param reqBo
     * @return List<UserBO>
     */
    List<UserBO> list(UserListReqBO reqBo);
}
