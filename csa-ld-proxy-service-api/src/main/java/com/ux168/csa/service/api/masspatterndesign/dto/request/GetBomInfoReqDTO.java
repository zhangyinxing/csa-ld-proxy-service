package com.ux168.csa.service.api.masspatterndesign.dto.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * description:
 * 获取bom信息
 * @author wuzijian
 * @date 2025/5/13
 */
@Data
@ApiModel("商品档案bom信息查询条件")
public class GetBomInfoReqDTO {

    @ApiModelProperty("大货款号")
    @NotBlank(message = "massCode必传")
    private String massCode;
}
