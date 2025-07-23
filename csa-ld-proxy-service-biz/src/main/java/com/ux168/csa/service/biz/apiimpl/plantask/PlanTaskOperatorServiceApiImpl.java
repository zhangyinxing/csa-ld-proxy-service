package com.ux168.csa.service.biz.apiimpl.plantask;

import com.ux168.csa.infrastructure.util.CopyUtil;
import com.ux168.csa.service.api.plantask.PlanTaskOperatorServiceApi;
import com.ux168.csa.service.api.plantask.dto.request.SampleSealPlanOperatorReqDTO;
import com.ux168.csa.service.api.plantask.dto.response.SampleSealPlanOperatorDTO;
import com.ux168.csa.service.biz.service.plantask.PlanTaskOperatorService;
import com.ux168.csa.service.biz.service.plantask.bo.SampleSealPlanOperatorBO;
import com.ux168.csa.service.biz.service.plantask.bo.SampleSealPlanOperatorConditionBO;
import com.ux168.platform.infrastructure.common.api.CommResponse;
import com.ux168.platform.infrastructure.util.CommonResponseUtil;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * description:
 * 计划任务执行人查询接口
 * @author wuzijian
 * @date 2025/3/27
 */
@RestController
@RequestMapping("/api/plantask")
@Service
public class PlanTaskOperatorServiceApiImpl implements PlanTaskOperatorServiceApi {

    @Resource
    private PlanTaskOperatorService planTaskOperatorService;


    @PostMapping("/v1/sampleseal/operators")
    @ApiOperation(value = "获取样品封样计划任务执行人")
    @Override
    public CommResponse<List<SampleSealPlanOperatorDTO>> getSampleSealOperators(@RequestBody @Validated SampleSealPlanOperatorReqDTO reqDTO){
        SampleSealPlanOperatorConditionBO conditionBO = CopyUtil.copy(reqDTO, SampleSealPlanOperatorConditionBO.class);
        List<SampleSealPlanOperatorBO> sampleSealPlanOperatorBOS = planTaskOperatorService.getSampleSealOperators(conditionBO);
        List<SampleSealPlanOperatorDTO> sampleSealPlanOperatorDTOS = CopyUtil.convertList(sampleSealPlanOperatorBOS, SampleSealPlanOperatorDTO.class);
        return CommonResponseUtil.success(sampleSealPlanOperatorDTOS);
    }
}
