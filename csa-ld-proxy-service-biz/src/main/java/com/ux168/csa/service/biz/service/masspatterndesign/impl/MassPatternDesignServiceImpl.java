package com.ux168.csa.service.biz.service.masspatterndesign.impl;

import com.ux168.csa.service.biz.dao.pgsql.masspatterndesign.repository.MassPatternDesignRepository;
import com.ux168.csa.service.biz.service.masspatterndesign.MassPatternDesignService;
import com.ux168.csa.service.biz.service.masspatterndesign.bo.GetBomInfoReqBO;
import com.ux168.csa.service.biz.service.masspatterndesign.bo.GetMasterInfoReqBO;
import com.ux168.csa.service.biz.service.masspatterndesign.bo.MassPatternBomBO;
import com.ux168.csa.service.biz.service.masspatterndesign.bo.MassPatternDesignBO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * description:
 *
 * @author huangxuebin
 * @date 2025/4/22
 */
@Service
public class MassPatternDesignServiceImpl implements MassPatternDesignService {

    @Resource
    private MassPatternDesignRepository massPatternDesignRepository;

    /**
     * description:
     * 查询商品档案主表信息
     * @param getMasterInfoReqBO 商品档案查询条件
     * @return List<MassPatternDesignBO>
     * @author huangxuebin
     * @date 17:11 2025/4/22
     */
    @Override
    public List<MassPatternDesignBO> getMasterInfo(GetMasterInfoReqBO getMasterInfoReqBO) {
        return massPatternDesignRepository.getMasterInfo(getMasterInfoReqBO);
    }

    /**
     * description:
     * 查询商品档案正在使用的bom行信息
     * @author wuzijian 
     * @date 下午3:34 2025/5/13 
     * @param reqBO
     * @return List<MassPatternDesignBO>
    */
    @Override
    public List<MassPatternBomBO> getBomInfo(GetBomInfoReqBO reqBO){
        return massPatternDesignRepository.getBomInfo(reqBO);
    }
}
