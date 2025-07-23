package com.ux168.csa.service.biz.dao.pgsql.produceorder.respository;

import com.ux168.csa.service.biz.service.produceorder.bo.ProduceOrderUserBO;
import com.ux168.csa.service.biz.service.produceorder.bo.ProduceOrderUserConditionBO;

import java.util.List;

/**
 * description:
 * 成品生产订单用户信息
 * @author wuzijian
 * @date 2025/3/27
 */
public interface ProduceOrderUserRepository {


    /**
     * description:
     * 获取成品生产订单用户信息
     * @author wuzijian
     * @date 下午2:13 2025/3/27
     * @param conditionBO
     * @return List<ProduceOrderUserBO>
    */
    List<ProduceOrderUserBO> getProduceOrderUserList(ProduceOrderUserConditionBO conditionBO);
}
