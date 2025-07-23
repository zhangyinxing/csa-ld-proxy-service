package com.ux168.csa.service.api.produceorder.dto.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * description:
 * 成品生产订单用户查询
 * @author wuzijian
 * @date 2025/3/27
 */
@Data
@ApiModel("成品生产订单用户查询")
public class ProduceOrderUserReqDTO {

    @ApiModelProperty("设计号")
    @NotBlank(message = "designCode不能为空")
    private String designCode;
}
