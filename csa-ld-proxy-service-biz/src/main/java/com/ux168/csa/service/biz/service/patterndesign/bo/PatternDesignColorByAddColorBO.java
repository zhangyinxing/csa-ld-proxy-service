package com.ux168.csa.service.biz.service.patterndesign.bo;

import lombok.Data;

import java.util.Date;

/**
 * description:
 * 加色中心最终加色
 * @author huangxuebin
 * @date 2025/5/15
 */
@Data
public class PatternDesignColorByAddColorBO {
    /**
     * 颜色编码
     */
    private String colorCode;

    /**
     * 颜色名称
     */
    private String colorName;

    /**
     * 设计款号
     */
    private String designCode;

    /**
     * 颜色加色时间
     */
    private Date createOn;
}
