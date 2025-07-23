package com.ux168.csa.service.biz.service.patterndesign.bo;

import lombok.Data;

import java.util.List;

/**
 * description:
 * 新款档案查询条件
 * @author huangxuebin
 * @date 2025/5/15
 */
@Data
public class GetMasterInfoReqBO {
    /**
     * 设计款号
     */
    private List<String> designCodes;
}
