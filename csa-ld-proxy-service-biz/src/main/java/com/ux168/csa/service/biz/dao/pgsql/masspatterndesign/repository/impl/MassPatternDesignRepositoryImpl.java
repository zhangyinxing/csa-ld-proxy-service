package com.ux168.csa.service.biz.dao.pgsql.masspatterndesign.repository.impl;

import com.ux168.csa.service.biz.dao.pgsql.masspatterndesign.mapper.MassPatternDesignMapper;
import com.ux168.csa.service.biz.dao.pgsql.masspatterndesign.repository.MassPatternDesignRepository;
import com.ux168.csa.service.biz.service.masspatterndesign.bo.GetBomInfoReqBO;
import com.ux168.csa.service.biz.service.masspatterndesign.bo.GetMasterInfoReqBO;
import com.ux168.csa.service.biz.service.masspatterndesign.bo.MassPatternBomBO;
import com.ux168.csa.service.biz.service.masspatterndesign.bo.MassPatternDesignBO;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * description:
 *
 * @author huangxuebin
 * @date 2025/4/22
 */
@Repository
public class MassPatternDesignRepositoryImpl implements MassPatternDesignRepository {

    @Resource
    private MassPatternDesignMapper massPatternDesignMapper;

    /**
     * description:
     * 查询商品档案主表信息
     * @param getMasterInfoReqBO 商品档案查询条件
     * @return List<MassPatternDesignBO>
     * @author huangxuebin
     * @date 17:23 2025/4/22
     */
    @Override
    public List<MassPatternDesignBO> getMasterInfo(GetMasterInfoReqBO getMasterInfoReqBO) {
        return massPatternDesignMapper.getMasterInfo(getMasterInfoReqBO);
    }

    /**
     * description:
     * 获取正在使用的bom信息
     * @author wuzijian
     * @date 下午3:32 2025/5/13
     * @param reqBO
     * @return List<MassPatternBomBO>
    */
    @Override
    public List<MassPatternBomBO> getBomInfo(GetBomInfoReqBO reqBO){
        return massPatternDesignMapper.getBomInfo(reqBO);
    }
}
