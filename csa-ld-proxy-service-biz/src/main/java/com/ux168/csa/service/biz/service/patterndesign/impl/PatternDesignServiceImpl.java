package com.ux168.csa.service.biz.service.patterndesign.impl;

import com.ux168.csa.service.biz.dao.pgsql.patterndesign.repository.PatternDesignRepository;
import com.ux168.csa.service.biz.service.patterndesign.PatternDesignService;
import com.ux168.csa.service.biz.service.patterndesign.bo.GetMasterInfoReqBO;
import com.ux168.csa.service.biz.service.patterndesign.bo.GetPatternDesignColorByAddColorReqBO;
import com.ux168.csa.service.biz.service.patterndesign.bo.PatternDesignBO;
import com.ux168.csa.service.biz.service.patterndesign.bo.PatternDesignColorByAddColorBO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;

/**
 * description:
 *
 * @author huangxuebin
 * @date 2025/5/15
 */
@Service
public class PatternDesignServiceImpl implements PatternDesignService {

    @Resource
    private PatternDesignRepository patternDesignRepository;

    /**
     * description:
     * 查询新款档案主表信息
     * @param getMasterInfoReqBO 查询新款档案主表信息req
     * @return List<PatternDesignBO>
     * @author huangxuebin
     * @date 14:56 2025/5/15
     */
    @Override
    public List<PatternDesignBO> getMasterInfo(GetMasterInfoReqBO getMasterInfoReqBO) {
        return patternDesignRepository.getMasterInfo(getMasterInfoReqBO);
    }

    /**
     * description:
     * 查询ld在加色任务的最终加色
     * @param getPatternDesignColorByAddColorReqBO 查询ld在加色任务的最终加色req
     * @return List<PatternDesignColorByAddColorBO>
     * @author huangxuebin
     * @date 14:56 2025/5/15
     */
    @Override
    public List<PatternDesignColorByAddColorBO> getPatternDesignColorByAddColor(GetPatternDesignColorByAddColorReqBO getPatternDesignColorByAddColorReqBO) {
        return patternDesignRepository.getPatternDesignColorByAddColor(getPatternDesignColorByAddColorReqBO);
    }
}
