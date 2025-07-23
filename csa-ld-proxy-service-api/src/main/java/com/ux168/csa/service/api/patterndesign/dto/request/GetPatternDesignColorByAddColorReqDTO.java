package com.ux168.csa.service.api.patterndesign.dto.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.Size;
import java.util.List;

/**
 * description:
 * 加色中心最终加色req
 * @author huangxuebin
 * @date 2025/5/15
 */
@Data
@ApiModel("加色中心最终加色req")
public class GetPatternDesignColorByAddColorReqDTO {
    @ApiModelProperty("设计款号")
    @Size(min = 1, message = "设计款号不可为空")
    private List<String> designCodes;

    @ApiModelProperty("颜色时间开始时间戳")
    private Long colorCreateTimeLe;

    @ApiModelProperty("颜色时间结束时间戳")
    private Long colorCreateTimeGe;
}
