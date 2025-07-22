package dto.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.Size;
import java.util.List;

/**
 * description:
 * 商品档案查询条件
 * @author huangxuebin
 * @date 2025/4/22
 */
@Data
@ApiModel("商品档案查询条件")
public class GetMasterInfoReqDTO {
    @ApiModelProperty("大货款号")
    @Size(min = 1, message = "大货款号不可为空")
    // 目前只有这一个查询条件，先必填
    private List<String> massCodes;
}
