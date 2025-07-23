package com.ux168.csa.service.biz.dao.pgsql.plantask.repository.impl;

import com.ux168.csa.service.biz.dao.pgsql.plantask.mapper.PlanTaskOperatorMapper;
import com.ux168.csa.service.biz.dao.pgsql.plantask.repository.PlanTaskOperatorRepository;
import com.ux168.csa.service.biz.service.plantask.bo.SampleSealPlanOperatorBO;
import com.ux168.csa.service.biz.service.plantask.bo.SampleSealPlanOperatorConditionBO;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * description:
 * 计划任务执行人获取
 * @author wuzijian
 * @date 2025/3/27
 */
@Repository
public class PlanTaskOperatorRepositoryImpl implements PlanTaskOperatorRepository {

    @Resource
    private PlanTaskOperatorMapper planTaskOperatorMapper;


    @Override
    public List<SampleSealPlanOperatorBO> getSampleSealOperators(SampleSealPlanOperatorConditionBO conditionBO){
        return planTaskOperatorMapper.selectSampleSealOperators(conditionBO);
    }
}
