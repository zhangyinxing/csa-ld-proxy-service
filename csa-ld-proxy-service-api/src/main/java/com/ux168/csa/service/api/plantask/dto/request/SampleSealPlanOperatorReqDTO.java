package com.ux168.csa.service.api.plantask.dto.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * description:
 * 计划任务执行人查询条件
 * @author wuzijian
 * @date 2025/3/27
 */
@Data
@ApiModel("计划任务执行人查询条件")
public class SampleSealPlanOperatorReqDTO {

    @ApiModelProperty("设计号")
    @NotBlank(message = "designCode不能为空")
    private String designCode;
}
