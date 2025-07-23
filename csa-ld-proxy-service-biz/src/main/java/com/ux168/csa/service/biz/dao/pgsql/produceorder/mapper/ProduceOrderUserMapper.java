package com.ux168.csa.service.biz.dao.pgsql.produceorder.mapper;

import com.ux168.csa.service.biz.service.produceorder.bo.ProduceOrderUserBO;
import com.ux168.csa.service.biz.service.produceorder.bo.ProduceOrderUserConditionBO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * description:
 *
 * @author wuzijian
 * @date 2025/3/27
 */
public interface ProduceOrderUserMapper {

    List<ProduceOrderUserBO> selectLastProduceOrderUsersByDesignCode(@Param("condition")ProduceOrderUserConditionBO conditionBO);
}
