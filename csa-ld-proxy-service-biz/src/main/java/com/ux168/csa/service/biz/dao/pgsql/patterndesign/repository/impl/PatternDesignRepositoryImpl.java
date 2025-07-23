package com.ux168.csa.service.biz.dao.pgsql.patterndesign.repository.impl;

import com.ux168.csa.service.biz.dao.pgsql.patterndesign.mapper.PatternDesignMapper;
import com.ux168.csa.service.biz.dao.pgsql.patterndesign.repository.PatternDesignRepository;
import com.ux168.csa.service.biz.service.patterndesign.bo.GetMasterInfoReqBO;
import com.ux168.csa.service.biz.service.patterndesign.bo.GetPatternDesignColorByAddColorReqBO;
import com.ux168.csa.service.biz.service.patterndesign.bo.PatternDesignBO;
import com.ux168.csa.service.biz.service.patterndesign.bo.PatternDesignColorByAddColorBO;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * description:
 *
 * @author huangxuebin
 * @date 2025/5/15
 */
@Repository
public class PatternDesignRepositoryImpl implements PatternDesignRepository {

    @Resource
    private PatternDesignMapper patternDesignMapper;

    /**
     * description:
     * 查询新款档案主表信息
     * @param getMasterInfoReqBO 查询新款档案主表信息req
     * @return List<PatternDesignBO>
     * @author huangxuebin
     * @date 15:08 2025/5/15
     */
    @Override
    public List<PatternDesignBO> getMasterInfo(GetMasterInfoReqBO getMasterInfoReqBO) {
        return patternDesignMapper.getMasterInfo(getMasterInfoReqBO);
    }

    /**
     * description:
     * 查询ld在加色任务的最终加色
     * @param getPatternDesignColorByAddColorReqBO 查询ld在加色任务的最终加色req
     * @return List<PatternDesignColorByAddColorBO>
     * @author huangxuebin
     * @date 15:08 2025/5/15
     */
    @Override
    public List<PatternDesignColorByAddColorBO> getPatternDesignColorByAddColor(GetPatternDesignColorByAddColorReqBO getPatternDesignColorByAddColorReqBO) {
        return patternDesignMapper.getPatternDesignColorByAddColor(getPatternDesignColorByAddColorReqBO);
    }
}
