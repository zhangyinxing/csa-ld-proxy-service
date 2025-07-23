package com.ux168.csa.service.api.patterndesign;

import com.ux168.csa.service.api.patterndesign.dto.request.GetMasterInfoReqDTO;
import com.ux168.csa.service.api.patterndesign.dto.request.GetPatternDesignColorByAddColorReqDTO;
import com.ux168.csa.service.api.patterndesign.dto.response.PatternDesignColorByAddColorDTO;
import com.ux168.csa.service.api.patterndesign.dto.response.PatternDesignDTO;
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
 * ld-ac新款档案
 * @author huangxuebin
 * @date 2025/5/15
 */
@FeignClient(name = ApiConstants.NAME, contextId = ApiConstants.CONTEXT_ID, path = "/api/pattern_design", url = FeignConstants.DELEGATE_CONFIG)
public interface PatternDesignServiceApi {
    @PostMapping("/v1/getMasterInfo")
    @ApiOperation(value = "查询新款档案主表信息")
    CommResponse<List<PatternDesignDTO>> getMasterInfo(@RequestBody @Validated GetMasterInfoReqDTO getMasterInfoReqDTO);

    @PostMapping("/v1/getPatternDesignColorByAddColor")
    @ApiOperation(value = "查询ld在加色任务的最终加色")
    CommResponse<List<PatternDesignColorByAddColorDTO>> getPatternDesignColorByAddColor(@RequestBody @Validated GetPatternDesignColorByAddColorReqDTO getPatternDesignColorByAddColorReqDTO);
}
