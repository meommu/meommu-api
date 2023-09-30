package com.meommu.meommuapi.common.advisor;

import org.springframework.http.HttpStatus;

import com.meommu.meommuapi.common.exception.BusinessCode;
import com.meommu.meommuapi.common.exception.BusinessException;

public class ApiResponseJsonProcessingException extends BusinessException {
	private static final String ERROR_CODE = BusinessCode.JSON_PROCESSING_ERROR.getCode();

	private static final HttpStatus HTTP_STATUS = HttpStatus.INTERNAL_SERVER_ERROR;

	public ApiResponseJsonProcessingException(Throwable cause) {
		super(cause);
	}

	@Override
	public HttpStatus getHttpStatus() {
		return HTTP_STATUS;
	}

	@Override
	public String getErrorCode() {
		return ERROR_CODE;
	}

	@Override
	public boolean isNecessaryToLog() {
		return true;
	}
}
