package com.ux168.csa.service.biz.dao.pgsql.masspatterndesign.mapper;

import com.ux168.csa.service.biz.service.masspatterndesign.bo.GetBomInfoReqBO;
import com.ux168.csa.service.biz.service.masspatterndesign.bo.GetMasterInfoReqBO;
import com.ux168.csa.service.biz.service.masspatterndesign.bo.MassPatternBomBO;
import com.ux168.csa.service.biz.service.masspatterndesign.bo.MassPatternDesignBO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * description:
 *
 * @author huangxuebin
 * @date 2025/4/22
 */
public interface MassPatternDesignMapper {
    /**
     * description:
     * 查询商品档案主表信息
     * @param getMasterInfoReqBO 商品档案查询条件
     * @return List<MassPatternDesignBO>
     * @author huangxuebin
     * @date 17:20 2025/4/22
     */
    List<MassPatternDesignBO> getMasterInfo(@Param("condition") GetMasterInfoReqBO getMasterInfoReqBO);

    /**
     * description:
     *
     * @author wuzijian
     * @date 下午3:29 2025/5/13
     * @param getBomInfoReqBO
     * @return List<MassPatternBomBO>
    */
    List<MassPatternBomBO> getBomInfo(@Param("condition")GetBomInfoReqBO getBomInfoReqBO);
}
