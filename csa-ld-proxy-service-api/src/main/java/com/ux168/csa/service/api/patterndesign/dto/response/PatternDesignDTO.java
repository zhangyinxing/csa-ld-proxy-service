package com.ux168.csa.service.api.patterndesign.dto.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * description:
 * 新款档案主表
 * @author huangxuebin
 * @date 2025/5/15
 */
@Data
@ApiModel("新款档案主表")
public class PatternDesignDTO {
    @ApiModelProperty("实体ID（唯一）")
    private String uuid;

    @ApiModelProperty("设计款号")
    private String designCode;

    @ApiModelProperty("是否套装")
    private Boolean isSuit;

    @ApiModelProperty("款式名称")
    private String patternName;

    @ApiModelProperty("年份")
    private Integer year;

    @ApiModelProperty("审核状态 0未审核 2已审核")
    private Integer auditStatus;
}
