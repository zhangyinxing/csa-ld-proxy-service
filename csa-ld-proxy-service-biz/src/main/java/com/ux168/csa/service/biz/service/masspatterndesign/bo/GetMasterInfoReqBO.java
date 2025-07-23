package com.ux168.csa.service.biz.service.masspatterndesign.bo;

import lombok.Data;

import java.util.List;

/**
 * description:
 * 商品档案查询条件
 * @author huangxuebin
 * @date 2025/4/22
 */
@Data
public class GetMasterInfoReqBO {
    /**
     * 大货款号
     */
    private List<String> massCodes;
}
