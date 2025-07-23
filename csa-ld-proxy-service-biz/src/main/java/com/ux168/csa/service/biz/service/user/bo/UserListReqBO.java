package com.ux168.csa.service.biz.service.user.bo;

import lombok.Data;

import java.util.List;

/**
 * description: 人员信息查询请求参数
 *
 * @author zhang yinxing
 * @date 2025/3/20
 */
@Data
public class UserListReqBO {

    private List<String> userAccountList;
}
