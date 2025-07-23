package com.ux168.csa.service.api.plantask;

import com.ux168.csa.service.api.plantask.dto.request.SampleSealPlanOperatorReqDTO;
import com.ux168.csa.service.api.plantask.dto.response.SampleSealPlanOperatorDTO;
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
 *
 * @author wuzijian
 * @date 2025/3/27
 */
@FeignClient(name = ApiConstants.NAME, contextId = ApiConstants.CONTEXT_ID, path = "/api/plantask", url = FeignConstants.DELEGATE_CONFIG)
public interface PlanTaskOperatorServiceApi {

    @PostMapping("/v1/sampleseal/operators")
    @ApiOperation(value = "获取样品封样计划任务执行人")
    CommResponse<List<SampleSealPlanOperatorDTO>> getSampleSealOperators(@RequestBody @Validated SampleSealPlanOperatorReqDTO reqDTO);
}
