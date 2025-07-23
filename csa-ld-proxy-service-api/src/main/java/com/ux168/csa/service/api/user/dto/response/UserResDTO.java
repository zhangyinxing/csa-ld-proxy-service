package com.ux168.csa.service.api.user.dto.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * description:
 *
 * @author zhang yinxing
 * @date 2025/3/20
 */
@Data
@ApiModel("人员信息")
public class UserResDTO {

    /**
     * uuid
     */
    @ApiModelProperty(name = "userName" , value = "uuid")
    private String uuid;

    /**
     * 账户
     */
    @ApiModelProperty(name = "userAccount" , value = "账户")
    private String userAccount;

    /**
     * 姓名
     */
    @ApiModelProperty(name = "userName" , value = "姓名")
    private String userName;

    /**
     * 姓名
     */
    @ApiModelProperty(name = "cellPhone" , value = "手机号码")
    private String cellPhone;
}
