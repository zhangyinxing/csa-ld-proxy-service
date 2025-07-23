package com.ux168.csa.service.biz.service.produceorder.impl;

import com.ux168.csa.service.biz.dao.pgsql.produceorder.respository.ProduceOrderUserRepository;
import com.ux168.csa.service.biz.service.produceorder.ProduceOrderUserService;
import com.ux168.csa.service.biz.service.produceorder.bo.ProduceOrderUserBO;
import com.ux168.csa.service.biz.service.produceorder.bo.ProduceOrderUserConditionBO;
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
public class ProduceOrderUserServiceImpl implements ProduceOrderUserService {

    @Resource
    private ProduceOrderUserRepository produceOrderUserRepository;
    
    @Override
    public List<ProduceOrderUserBO> getProduceOrderUserList(ProduceOrderUserConditionBO conditionBO){
        return produceOrderUserRepository.getProduceOrderUserList(conditionBO);
    }
}
