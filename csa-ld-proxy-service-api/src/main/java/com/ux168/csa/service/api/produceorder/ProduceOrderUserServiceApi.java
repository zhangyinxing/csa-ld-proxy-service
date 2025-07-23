package com.ux168.csa.service.api.produceorder;

import com.ux168.csa.service.api.produceorder.dto.request.ProduceOrderUserReqDTO;
import com.ux168.csa.service.api.produceorder.dto.response.ProduceOrderUserDTO;
import com.ux168.csa.service.constants.ApiConstants;
import com.ux168.platform.infrastructure.common.api.CommResponse;
import com.ux168.platform.infrastructure.common.constants.FeignConstants;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * description:
 *
 * @author wuzijian
 * @date 2025/3/27
 */
@FeignClient(name = ApiConstants.NAME, contextId = ApiConstants.CONTEXT_ID, path = "/api/produceorder/user", url = FeignConstants.DELEGATE_CONFIG)
public interface ProduceOrderUserServiceApi {


    @PostMapping("/v1/info")
    @ApiOperation(value = "批量查询 员工 ", notes = "根据查询条件 , 批量查询员工")
    CommResponse<List<ProduceOrderUserDTO>> getProduceOrderUserList(@RequestBody @Validated ProduceOrderUserReqDTO reqDTO);
}
