package com.ux168.csa.service.api.user.dto.request;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.util.List;

/**
 * description: 人员信息查询请求参数
 *
 * @author zhang yinxing
 * @date 2025/3/20
 */
@Data
@ApiModel("人员信息查询请求参数dto")
public class UserListReqDTO {

    private List<String> userAccountList;
}
