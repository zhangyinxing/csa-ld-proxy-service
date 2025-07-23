package com.ux168.csa.service.api.user;

import com.ux168.csa.service.api.user.dto.request.UserListReqDTO;
import com.ux168.csa.service.api.user.dto.response.UserResDTO;
import com.ux168.csa.service.constants.ApiConstants;
import com.ux168.platform.infrastructure.common.api.CommResponse;
import com.ux168.platform.infrastructure.common.constants.FeignConstants;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * description: 人员信息接口
 *
 * @author zhang yinxing
 * @date 2025/3/20
 */
@FeignClient(name = ApiConstants.NAME, contextId = ApiConstants.CONTEXT_ID, path = "/api/user", url = FeignConstants.DELEGATE_CONFIG)
public interface UserServiceApi {
    /**
     * description: 根据条件查询
     * @author zhangyinxing
     * @date 下午3:23 2025/3/20
     * @param reqDto
     * @return CommResponse<List<UserResDTO>>
     */
    @PostMapping("/v1/list")
    @ApiOperation(value = "批量查询 员工 ", notes = "根据查询条件 , 批量查询员工")
    CommResponse<List<UserResDTO>> list(@RequestBody UserListReqDTO reqDto);
}
