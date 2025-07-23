package com.ux168.csa.service.biz.dao.pgsql.user.po;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * description:
 *
 * @author zhang yinxing
 * @date 2025/3/20
 */
@TableName("sys_user")
@Data
public class UserPO {
    @TableField("uuid")
    @TableId()
    private String uuid;

    @TableField("useraccount")
    private String userAccount;

    @TableField("username")
    private String userName;

    @TableField("cellphone")
    private String cellPhone;

    @TableField("enabled")
    private String enabled;
}
