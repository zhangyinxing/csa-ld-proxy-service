package dto.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * description:
 * 商品档案
 * @author huangxuebin
 * @date 2025/4/22
 */
@Data
@ApiModel("商品档案")
public class MassPatternDesignDTO {
    @ApiModelProperty("实体ID（唯一）")
    private String uuid;

    @ApiModelProperty("大货款号")
    private String massCode;

    @ApiModelProperty("设计师account")
    private String designerAccount;

    @ApiModelProperty("设计师cnName")
    private String designerCnName;
}
