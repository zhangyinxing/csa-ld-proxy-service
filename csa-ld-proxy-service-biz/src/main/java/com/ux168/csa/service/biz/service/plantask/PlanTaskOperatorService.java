package com.ux168.csa.service.biz.service.plantask;

import com.ux168.csa.service.biz.service.plantask.bo.SampleSealPlanOperatorBO;
import com.ux168.csa.service.biz.service.plantask.bo.SampleSealPlanOperatorConditionBO;

import java.util.List;

/**
 * description:
 * 计划任务执行人
 * @author wuzijian
 * @date 2025/3/27
 */
public interface PlanTaskOperatorService {

    List<SampleSealPlanOperatorBO> getSampleSealOperators(SampleSealPlanOperatorConditionBO conditionBO);
}
