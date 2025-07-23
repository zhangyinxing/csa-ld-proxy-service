package com.ux168.csa.service.biz.service.plantask.impl;

import com.ux168.csa.service.biz.dao.pgsql.plantask.repository.PlanTaskOperatorRepository;
import com.ux168.csa.service.biz.service.plantask.PlanTaskOperatorService;
import com.ux168.csa.service.biz.service.plantask.bo.SampleSealPlanOperatorBO;
import com.ux168.csa.service.biz.service.plantask.bo.SampleSealPlanOperatorConditionBO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * description:
 *
 * @author wuzijian
 * @date 2025/3/27
 */
@Service
public class PlanTaskOperatorServiceImpl implements PlanTaskOperatorService {

    private String SAMPLE_SEAL_PLAN_CLASS_ID = "c4348772-1282-11ea-b8eb-630d33ba9079";

    @Resource
    private PlanTaskOperatorRepository planTaskOperatorRepository;

    @Override
    public List<SampleSealPlanOperatorBO> getSampleSealOperators(SampleSealPlanOperatorConditionBO conditionBO){
        conditionBO.setPlanclassid(SAMPLE_SEAL_PLAN_CLASS_ID);
        return planTaskOperatorRepository.getSampleSealOperators(conditionBO);
    }
}
