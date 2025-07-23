package com.ux168.csa.service.biz.apiimpl.user;

import com.ux168.csa.service.api.user.UserServiceApi;
import com.ux168.csa.service.api.user.dto.request.UserListReqDTO;
import com.ux168.csa.service.api.user.dto.response.UserResDTO;
import com.ux168.csa.service.biz.service.user.UserService;
import com.ux168.csa.service.biz.service.user.bo.UserBO;
import com.ux168.csa.service.biz.service.user.bo.UserListReqBO;
import com.ux168.platform.infrastructure.common.api.CommResponse;
import com.ux168.platform.infrastructure.common.convert.BaseConvert;
import com.ux168.platform.infrastructure.util.CommonResponseUtil;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * description:
 *
 * @author zhang yinxing
 * @date 2025/3/20
 */
@RestController
@RequestMapping("/api/user")
@Service
public class UserServiceApiImpl implements UserServiceApi {
    @Resource
    private UserService userService;

    @PostMapping("/v1/list")
    @ApiOperation(value = "批量查询 员工 ", notes = "根据查询条件 , 批量查询员工")
    @Override
    public CommResponse<List<UserResDTO>> list(@RequestBody UserListReqDTO reqDto) {
        UserListReqBO reqBo = BaseConvert.convert(reqDto, UserListReqBO.class);
        List<UserBO> list = userService.list(reqBo);
        List<UserResDTO> object = BaseConvert.convertList(list, UserResDTO.class);
        return CommonResponseUtil.success(object);
    }
}
