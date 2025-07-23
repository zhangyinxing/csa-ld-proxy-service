package com.ux168.csa.service.biz.apiimpl.produceorder;

import com.ux168.csa.infrastructure.util.CopyUtil;
import com.ux168.csa.service.api.produceorder.ProduceOrderUserServiceApi;
import com.ux168.csa.service.api.produceorder.dto.request.ProduceOrderUserReqDTO;
import com.ux168.csa.service.api.produceorder.dto.response.ProduceOrderUserDTO;
import com.ux168.csa.service.biz.service.produceorder.ProduceOrderUserService;
import com.ux168.csa.service.biz.service.produceorder.bo.ProduceOrderUserBO;
import com.ux168.csa.service.biz.service.produceorder.bo.ProduceOrderUserConditionBO;
import com.ux168.platform.infrastructure.common.api.CommResponse;
import com.ux168.platform.infrastructure.util.CommonResponseUtil;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * description:
 * 成品生产订单用户信息
 * @author wuzijian
 * @date 2025/3/27
 */
@RestController
@RequestMapping("/api/produceorder/user")
@Service
public class ProduceOrderUserServiceApiImpl implements ProduceOrderUserServiceApi {

    @Resource
    private ProduceOrderUserService produceOrderUserService;

    @PostMapping("/v1/info")
    @ApiOperation(value = "批量查询 员工 ", notes = "根据查询条件 , 批量查询员工")
    @Override
    public CommResponse<List<ProduceOrderUserDTO>> getProduceOrderUserList(@RequestBody @Validated ProduceOrderUserReqDTO reqDTO){
        ProduceOrderUserConditionBO reqBo = CopyUtil.copy(reqDTO, ProduceOrderUserConditionBO.class);
        List<ProduceOrderUserBO> produceOrderUserList = produceOrderUserService.getProduceOrderUserList(reqBo);
        List<ProduceOrderUserDTO> produceOrderUserDTOS = CopyUtil.convertList(produceOrderUserList, ProduceOrderUserDTO.class);
        return CommonResponseUtil.success(produceOrderUserDTOS);
    }
}
