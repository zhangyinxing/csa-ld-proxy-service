package com.ux168.csa.service.biz.service.masspatterndesign;

import com.ux168.csa.service.biz.service.masspatterndesign.bo.GetBomInfoReqBO;
import com.ux168.csa.service.biz.service.masspatterndesign.bo.GetMasterInfoReqBO;
import com.ux168.csa.service.biz.service.masspatterndesign.bo.MassPatternBomBO;
import com.ux168.csa.service.biz.service.masspatterndesign.bo.MassPatternDesignBO;

import java.util.List;

/**
 * description:
 *
 * @author huangxuebin
 * @date 2025/4/22
 */
public interface MassPatternDesignService {
    /**
     * description:
     * 查询商品档案主表信息
     * @param getMasterInfoReqBO 商品档案查询条件
     * @return List<MassPatternDesignBO>
     * @author huangxuebin
     * @date 17:10 2025/4/22
     */
    List<MassPatternDesignBO> getMasterInfo(GetMasterInfoReqBO getMasterInfoReqBO);

    /**
     * description:
     * 查询商品档案正在使用的bom行信息
     * @author wuzijian
     * @date 下午3:34 2025/5/13
     * @param reqBO
     * @return List<MassPatternDesignBO>
     */
    List<MassPatternBomBO> getBomInfo(GetBomInfoReqBO reqBO);
}
