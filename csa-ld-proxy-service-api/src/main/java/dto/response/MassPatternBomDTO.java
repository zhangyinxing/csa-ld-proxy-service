package dto.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * description:
 * bom信息
 * @author wuzijian
 * @date 2025/5/13
 */
@Data
@ApiModel("商品档案bom信息")
public class MassPatternBomDTO {

    @ApiModelProperty("商品档案大货款号")
    private String massCode;

    @ApiModelProperty("bom行配色配码")
    private Integer patternBomStatus;

    @ApiModelProperty("版本")
    private Integer version;
}
