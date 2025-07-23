package com.ux168.csa.service.biz.apiimpl.masspatterndesign;

import com.ux168.csa.infrastructure.util.CopyUtil;
import com.ux168.csa.service.api.masspatterndesign.MassPatternDesignServiceApi;
import com.ux168.csa.service.api.masspatterndesign.dto.request.GetBomInfoReqDTO;
import com.ux168.csa.service.api.masspatterndesign.dto.request.GetMasterInfoReqDTO;
import com.ux168.csa.service.api.masspatterndesign.dto.response.MassPatternBomDTO;
import com.ux168.csa.service.api.masspatterndesign.dto.response.MassPatternDesignDTO;
import com.ux168.csa.service.biz.service.masspatterndesign.MassPatternDesignService;
import com.ux168.csa.service.biz.service.masspatterndesign.bo.GetBomInfoReqBO;
import com.ux168.csa.service.biz.service.masspatterndesign.bo.GetMasterInfoReqBO;
import com.ux168.csa.service.biz.service.masspatterndesign.bo.MassPatternBomBO;
import com.ux168.csa.service.biz.service.masspatterndesign.bo.MassPatternDesignBO;
import com.ux168.platform.infrastructure.common.api.CommResponse;
import com.ux168.platform.infrastructure.util.CommonResponseUtil;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * description:
 *
 * @author huangxuebin
 * @date 2025/4/22
 */
@RestController
@RequestMapping("/api/mass_pattern_design")
@Service
public class MassPatternDesignServiceApiImpl implements MassPatternDesignServiceApi {

    @Resource
    private MassPatternDesignService massPatternDesignService;

    /**
     * description:
     * 查询商品档案主表信息
     * @param getMasterInfoReqDTO 商品档案查询条件
     * @return CommResponse<List<MassPatternDesignDTO>>
     * @author huangxuebin
     * @date 17:02 2025/4/22
     */
    @Override
    public CommResponse<List<MassPatternDesignDTO>> getMasterInfo(GetMasterInfoReqDTO getMasterInfoReqDTO) {
        GetMasterInfoReqBO getMasterInfoReqBO = CopyUtil.copy(getMasterInfoReqDTO, GetMasterInfoReqBO.class);
        List<MassPatternDesignBO> massPatternDesignBOS = massPatternDesignService.getMasterInfo(getMasterInfoReqBO);
        return CommonResponseUtil.success(CopyUtil.convertList(massPatternDesignBOS, MassPatternDesignDTO.class));
    }

    @PostMapping("/v1/bomInfo")
    @ApiOperation(value = "查询商品档案bom信息")
    @Override
    public CommResponse<List<MassPatternBomDTO>> getBomInfo(@RequestBody @Validated GetBomInfoReqDTO reqDTO){
        GetBomInfoReqBO reqBO = CopyUtil.copy(reqDTO, GetBomInfoReqBO.class);
        List<MassPatternBomBO> bomInfo = massPatternDesignService.getBomInfo(reqBO);
        return CommonResponseUtil.success(CopyUtil.convertList(bomInfo,MassPatternBomDTO.class));
    }
}
