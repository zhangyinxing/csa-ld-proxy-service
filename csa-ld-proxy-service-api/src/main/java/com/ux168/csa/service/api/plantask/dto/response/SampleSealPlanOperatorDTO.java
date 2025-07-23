package com.ux168.csa.service.api.plantask.dto.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * description:
 * 样品计划任务执行人返回值
 * @author wuzijian
 * @date 2025/3/27
 */
@Data
@ApiModel("样品计划任务执行人返回值")
public class SampleSealPlanOperatorDTO {

    /**
     * 设计号
     */
    @ApiModelProperty("设计号")
    private String designCode;

    /**
     * 任务名称
     */
    @ApiModelProperty("任务名称")
    private String taskName;

    /**
     * 执行人名称
     */
    @ApiModelProperty("执行人名称")
    private String userName;

    /**
     * 用户账号
     */
    @ApiModelProperty("用户账号")
    private String userAccount;
}
