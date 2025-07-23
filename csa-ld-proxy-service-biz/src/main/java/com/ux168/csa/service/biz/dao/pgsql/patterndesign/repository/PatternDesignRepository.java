package com.ux168.csa.service.biz.dao.pgsql.patterndesign.repository;

import com.ux168.csa.service.biz.service.patterndesign.bo.GetMasterInfoReqBO;
import com.ux168.csa.service.biz.service.patterndesign.bo.GetPatternDesignColorByAddColorReqBO;
import com.ux168.csa.service.biz.service.patterndesign.bo.PatternDesignBO;
import com.ux168.csa.service.biz.service.patterndesign.bo.PatternDesignColorByAddColorBO;

import java.util.List;

/**
 * description:
 *
 * @author huangxuebin
 * @date 2025/5/15
 */
public interface PatternDesignRepository {
    /**
     * description:
     * 查询新款档案主表信息
     * @param getMasterInfoReqBO 查询新款档案主表信息req
     * @return List<PatternDesignBO>
     * @author huangxuebin
     * @date 15:07 2025/5/15
     */
    List<PatternDesignBO> getMasterInfo(GetMasterInfoReqBO getMasterInfoReqBO);

    /**
     * description:
     * 查询ld在加色任务的最终加色
     * @param getPatternDesignColorByAddColorReqBO 查询ld在加色任务的最终加色req
     * @return List<PatternDesignColorByAddColorBO>
     * @author huangxuebin
     * @date 15:07 2025/5/15
     */
    List<PatternDesignColorByAddColorBO> getPatternDesignColorByAddColor(GetPatternDesignColorByAddColorReqBO getPatternDesignColorByAddColorReqBO);
}
