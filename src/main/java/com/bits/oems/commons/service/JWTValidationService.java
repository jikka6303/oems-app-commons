package com.bits.oems.commons.service;

import com.bits.oems.commons.model.UsernameResponse;

public interface JWTValidationService {

	public UsernameResponse validateToken(String token);

}
