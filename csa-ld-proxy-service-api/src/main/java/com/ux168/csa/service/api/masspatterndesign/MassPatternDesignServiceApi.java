package com.ux168.csa.service.api.masspatterndesign;

import com.ux168.csa.service.api.masspatterndesign.dto.request.GetBomInfoReqDTO;
import com.ux168.csa.service.api.masspatterndesign.dto.request.GetMasterInfoReqDTO;
import com.ux168.csa.service.api.masspatterndesign.dto.response.MassPatternBomDTO;
import com.ux168.csa.service.api.masspatterndesign.dto.response.MassPatternDesignDTO;
import com.ux168.csa.service.constants.ApiConstants;
import com.ux168.platform.infrastructure.common.api.CommResponse;
import com.ux168.platform.infrastructure.common.constants.FeignConstants;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * description:
 * ld-ac商品档案
 * @author huangxuebin
 * @date 2025/4/22
 */
@FeignClient(name = ApiConstants.NAME, contextId = ApiConstants.CONTEXT_ID, path = "/api/mass_pattern_design", url = FeignConstants.DELEGATE_CONFIG)
public interface MassPatternDesignServiceApi {
    @PostMapping("/v1/getMasterInfo")
    @ApiOperation(value = "查询商品档案主表信息")
    CommResponse<List<MassPatternDesignDTO>> getMasterInfo(@RequestBody @Validated GetMasterInfoReqDTO getMasterInfoReqDTO);

    @PostMapping("/v1/bomInfo")
    @ApiOperation(value = "查询商品档案bom信息")
    CommResponse<List<MassPatternBomDTO>> getBomInfo(@RequestBody @Validated GetBomInfoReqDTO reqDTO);
}
