package com.ux168.csa.service.biz.service.patterndesign.bo;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * description:
 * 加色中心最终加色req
 * @author huangxuebin
 * @date 2025/5/15
 */
@Data
public class GetPatternDesignColorByAddColorReqBO {
    /**
     * 设计款号
     */
    private List<String> designCodes;

    /**
     * 颜色时间开始时间戳
     */
    private Date colorCreateTimeLe;

    /**
     * 颜色时间结束时间戳
     */
    private Date colorCreateTimeGe;
}
