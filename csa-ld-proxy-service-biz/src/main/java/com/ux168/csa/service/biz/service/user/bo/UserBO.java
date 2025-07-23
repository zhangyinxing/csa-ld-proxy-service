package com.ux168.csa.service.biz.service.user.bo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * description:
 *
 * @author zhang yinxing
 * @date 2025/3/20
 */
@Data
public class UserBO {
    /**
     * uuid
     */
    private String uuid;

    /**
     * 账户
     */
    private String userAccount;

    /**
     * 姓名
     */
    private String userName;

    /**
     * 手机号
     */
    private String cellPhone;
}
