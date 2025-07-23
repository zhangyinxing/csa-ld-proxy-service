package com.ux168.csa.service.biz.dao.pgsql.plantask.mapper;

import com.ux168.csa.service.biz.service.plantask.bo.SampleSealPlanOperatorBO;
import com.ux168.csa.service.biz.service.plantask.bo.SampleSealPlanOperatorConditionBO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * description:
 *
 * @author wuzijian
 * @date 2025/3/27
 */
public interface PlanTaskOperatorMapper {

    List<SampleSealPlanOperatorBO> selectSampleSealOperators(@Param("condition")SampleSealPlanOperatorConditionBO conditionBO);
}
