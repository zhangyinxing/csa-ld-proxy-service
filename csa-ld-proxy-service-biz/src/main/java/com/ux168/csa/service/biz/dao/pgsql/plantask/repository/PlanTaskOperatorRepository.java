package com.ux168.csa.service.biz.dao.pgsql.plantask.repository;

import com.ux168.csa.service.biz.service.plantask.bo.SampleSealPlanOperatorBO;
import com.ux168.csa.service.biz.service.plantask.bo.SampleSealPlanOperatorConditionBO;

import java.util.List;

/**
 * description:
 *
 * @author wuzijian
 * @date 2025/3/27
 */
public interface PlanTaskOperatorRepository {

    /**
     * description:
     * 获取封样计划任务执行人
     * @author wuzijian
     * @date 上午9:47 2025/3/27
     * @param conditionBO
     * @return List<SampleSealPlanOperatorBO>
    */
    List<SampleSealPlanOperatorBO> getSampleSealOperators(SampleSealPlanOperatorConditionBO conditionBO);
}
