package com.ux168.csa.service.api.patterndesign.dto.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


/**
 * description:
 * 加色中心最终加色
 * @author huangxuebin
 * @date 2025/5/15
 */
@Data
@ApiModel("加色中心最终加色")
public class PatternDesignColorByAddColorDTO {
    @ApiModelProperty("颜色编码")
    private String colorCode;

    @ApiModelProperty("颜色名称")
    private String colorName;

    @ApiModelProperty("设计款号")
    private String designCode;

    @ApiModelProperty("颜色加色时间")
    private Long createOn;
}
