package com.ux168.csa.service.biz.dao.pgsql.produceorder.respository.impl;

import com.ux168.csa.service.biz.dao.pgsql.produceorder.mapper.ProduceOrderUserMapper;
import com.ux168.csa.service.biz.dao.pgsql.produceorder.respository.ProduceOrderUserRepository;
import com.ux168.csa.service.biz.service.produceorder.bo.ProduceOrderUserBO;
import com.ux168.csa.service.biz.service.produceorder.bo.ProduceOrderUserConditionBO;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * description:
 *
 * @author wuzijian
 * @date 2025/3/27
 */
@Repository
public class ProduceOrderUserRepositoryImpl implements ProduceOrderUserRepository {

    @Resource
    private ProduceOrderUserMapper produceOrderUserMapper;

    @Override
    public List<ProduceOrderUserBO> getProduceOrderUserList(ProduceOrderUserConditionBO conditionBO){
        return produceOrderUserMapper.selectLastProduceOrderUsersByDesignCode(conditionBO);
    }
}
