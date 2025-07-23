package com.ux168.csa.service.biz.apiimpl.patterndesign;

import com.ux168.csa.infrastructure.util.CopyUtil;
import com.ux168.csa.service.api.patterndesign.PatternDesignServiceApi;
import com.ux168.csa.service.api.patterndesign.dto.request.GetMasterInfoReqDTO;
import com.ux168.csa.service.api.patterndesign.dto.request.GetPatternDesignColorByAddColorReqDTO;
import com.ux168.csa.service.api.patterndesign.dto.response.PatternDesignColorByAddColorDTO;
import com.ux168.csa.service.api.patterndesign.dto.response.PatternDesignDTO;
import com.ux168.csa.service.biz.service.patterndesign.PatternDesignService;
import com.ux168.csa.service.biz.service.patterndesign.bo.GetMasterInfoReqBO;
import com.ux168.csa.service.biz.service.patterndesign.bo.GetPatternDesignColorByAddColorReqBO;
import com.ux168.csa.service.biz.service.patterndesign.bo.PatternDesignBO;
import com.ux168.csa.service.biz.service.patterndesign.bo.PatternDesignColorByAddColorBO;
import com.ux168.platform.infrastructure.common.api.CommResponse;
import com.ux168.platform.infrastructure.util.CommonResponseUtil;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * description:
 *
 * @author huangxuebin
 * @date 2025/5/15
 */
@RestController
@RequestMapping("/api/pattern_design")
@Service
public class PatternDesignServiceApiImpl implements PatternDesignServiceApi {

    @Resource
    private PatternDesignService patternDesignService;

    /**
     * description:
     * 查询新款档案主表信息
     * @param getMasterInfoReqDTO 查询新款档案主表信息req
     * @return CommResponse<List<PatternDesignDTO>>
     * @author huangxuebin
     * @date 14:44 2025/5/15
     */
    @Override
    public CommResponse<List<PatternDesignDTO>> getMasterInfo(GetMasterInfoReqDTO getMasterInfoReqDTO) {
        GetMasterInfoReqBO getMasterInfoReqBO = CopyUtil.copy(getMasterInfoReqDTO, GetMasterInfoReqBO.class);
        List<PatternDesignBO> patternDesignBOS = patternDesignService.getMasterInfo(getMasterInfoReqBO);
        return CommonResponseUtil.success(CopyUtil.convertList(patternDesignBOS, PatternDesignDTO.class));
    }

    /**
     * description:
     * 查询ld在加色任务的最终加色
     * @param getPatternDesignColorByAddColorReqDTO 查询ld在加色任务的最终加色req
     * @return CommResponse<List<PatternDesignColorByAddColorDTO>>
     * @author huangxuebin
     * @date 14:44 2025/5/15
     */
    @Override
    public CommResponse<List<PatternDesignColorByAddColorDTO>> getPatternDesignColorByAddColor(GetPatternDesignColorByAddColorReqDTO getPatternDesignColorByAddColorReqDTO) {
        GetPatternDesignColorByAddColorReqBO getPatternDesignColorByAddColorReqBO = CopyUtil.copy(getPatternDesignColorByAddColorReqDTO, GetPatternDesignColorByAddColorReqBO.class);
        List<PatternDesignColorByAddColorBO> patternDesignColorByAddColorBOS = patternDesignService.getPatternDesignColorByAddColor(getPatternDesignColorByAddColorReqBO);
        return CommonResponseUtil.success(CopyUtil.convertList(patternDesignColorByAddColorBOS, PatternDesignColorByAddColorDTO.class));
    }
}
