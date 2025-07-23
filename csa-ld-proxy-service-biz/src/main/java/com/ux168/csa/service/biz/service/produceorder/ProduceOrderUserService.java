package com.ux168.csa.service.biz.service.produceorder;

import com.ux168.csa.service.biz.service.produceorder.bo.ProduceOrderUserBO;
import com.ux168.csa.service.biz.service.produceorder.bo.ProduceOrderUserConditionBO;

import java.util.List;

/**
 * description:
 *
 * @author wuzijian
 * @date 2025/3/27
 */
public interface ProduceOrderUserService {

    /**
     * description:
     * 获取成品生产订单信息
     * @author wuzijian
     * @date 下午2:17 2025/3/27
     * @param conditionBO
     * @return List<ProduceOrderUserBO>
    */
    List<ProduceOrderUserBO> getProduceOrderUserList(ProduceOrderUserConditionBO conditionBO);
}
