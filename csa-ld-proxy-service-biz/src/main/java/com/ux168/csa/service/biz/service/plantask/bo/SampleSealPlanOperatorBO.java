package com.ux168.csa.service.biz.service.plantask.bo;

import lombok.Data;

/**
 * description:
 * 样品封样计划各项任务执行人查询结果
 * @author wuzijian
 * @date 2025/3/27
 */
@Data
public class SampleSealPlanOperatorBO {

    /**
     * 设计号
     */
    private String designCode;

    /**
     * 任务名称
     */
    private String taskName;

    /**
     * 执行人名称
     */
    private String userName;

    /**
     * 用户账号
     */
    private String userAccount;
}
