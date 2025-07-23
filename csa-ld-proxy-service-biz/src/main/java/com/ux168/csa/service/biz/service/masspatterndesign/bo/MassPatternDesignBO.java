package com.ux168.csa.service.biz.service.masspatterndesign.bo;

import lombok.Data;

/**
 * description:
 * 商品档案
 * @author huangxuebin
 * @date 2025/4/22
 */
@Data
public class MassPatternDesignBO {
    /**
     * 实体ID（唯一）
     */
    private String uuid;

    /**
     * 大货款号
     */
    private String massCode;

    /**
     * 设计师account
     */
    private String designerAccount;

    /**
     * 设计师cnName
     */
    private String designerCnName;
}
