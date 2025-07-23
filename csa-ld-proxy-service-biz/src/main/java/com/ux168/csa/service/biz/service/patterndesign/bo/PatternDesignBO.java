package com.ux168.csa.service.biz.service.patterndesign.bo;

import lombok.Data;

/**
 * description:
 * 新款档案主表
 * @author huangxuebin
 * @date 2025/5/15
 */
@Data
public class PatternDesignBO {
    /**
     * 实体ID（唯一）
     */
    private String uuid;

    /**
     * 设计款号
     */
    private String designCode;

    /**
     * 是否套装
     */
    private Boolean isSuit;

    /**
     * 款式名称
     */
    private String patternName;

    /**
     * 年份
     */
    private Integer year;

    /**
     * 审核状态 0未审核 2已审核
     */
    private Integer auditStatus;
}
