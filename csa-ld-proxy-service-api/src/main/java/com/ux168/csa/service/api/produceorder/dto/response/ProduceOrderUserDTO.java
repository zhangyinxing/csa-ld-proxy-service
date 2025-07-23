package com.ux168.csa.service.api.produceorder.dto.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * description:
 * 成品生产订单用户信息
 * @author wuzijian
 * @date 2025/3/27
 */
@ApiModel("成品生产订单用户信息")
@Data
public class ProduceOrderUserDTO {

    /**
     * 设计号
     */
    @ApiModelProperty("设计号")
    private String designCode;

    /**
     * 跟单
     */
    @ApiModelProperty("跟单")
    private String scmName;

    /**
     * 跟单账号
     */
    @ApiModelProperty("跟单账号")
    private String scmAccount;

    /**
     * 创建人
     */
    @ApiModelProperty("创建人")
    private String createName;

    /**
     * 创建人账号
     */
    @ApiModelProperty("创建人账号")
    private String createAccount;
}
