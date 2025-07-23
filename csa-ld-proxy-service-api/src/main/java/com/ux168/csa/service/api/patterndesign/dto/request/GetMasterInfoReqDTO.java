package com.ux168.csa.service.api.patterndesign.dto.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.Size;
import java.util.List;

/**
 * description:
 * 新款档案查询条件
 * @author huangxuebin
 * @date 2025/5/15
 */
@Data
@ApiModel("新款档案查询条件")
public class GetMasterInfoReqDTO {
    @ApiModelProperty("设计款号")
    @Size(min = 1, message = "设计款号不可为空")
    // 目前只有这一个查询条件，先必填
    private List<String> designCodes;
}
