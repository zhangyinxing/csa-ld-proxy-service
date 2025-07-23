package com.ux168.csa.service.exception;

import com.ux168.csa.infrastructure.common.exception.IErrorCodeEnum;
import lombok.Getter;

/**
 * description: 错误码范围  50009000  ~ 50009999
 *
 * @author zhang yinxing
 * @since 2024/3/26
 */
public enum ServiceCodeEnum implements IErrorCodeEnum {

	;
	@Getter
	private Integer code;
	@Getter
	private String errMsg;
	@Getter
	private String toCMessage;

	ServiceCodeEnum(Integer code, String errMsg, String toCMessage) {
		this.code = code;
		this.errMsg = errMsg;
		this.toCMessage = toCMessage;
	}
}
