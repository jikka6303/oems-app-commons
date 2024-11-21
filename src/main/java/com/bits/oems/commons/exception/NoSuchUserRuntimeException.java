package com.bits.oems.commons.exception;

import com.bits.oems.commons.constant.AppConstants;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = AppConstants.NO_SUCH_USER_EXISTS)
public class NoSuchUserRuntimeException extends AppRuntimeException {

    
    /**
     * 
	 */
    private static final long serialVersionUID = 1L;
}
