package com.ux168.csa.service.biz.service.produceorder.bo;

import lombok.Data;

/**
 * description:
 * 成品生产订单用户信息
 * @author wuzijian
 * @date 2025/3/27
 */
@Data
public class ProduceOrderUserBO {

    /**
     * 设计号
     */
    private String designCode;

    /**
     * 跟单
     */
    private String scmName;

    /**
     * 跟单账号
     */
    private String scmAccount;

    /**
     * 创建人
     */
    private String createName;

    /**
     * 创建人账号
     */
    private String createAccount;
}
