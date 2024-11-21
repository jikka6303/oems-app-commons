package com.bits.oems.commons.service;

import com.bits.oems.commons.feign.AuthFeign;
import com.bits.oems.commons.logger.LogExecutionTime;
import com.bits.oems.commons.model.TokenValidationRequest;
import com.bits.oems.commons.model.UsernameResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JWTValidationServiceImpl implements JWTValidationService {

	@Autowired
	private AuthFeign authFeign;

	@Override
	@LogExecutionTime
	public UsernameResponse validateToken(String token) {
		return authFeign.validateToken(new TokenValidationRequest(token));
	}

}
