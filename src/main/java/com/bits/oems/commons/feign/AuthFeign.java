package com.bits.oems.commons.feign;

import javax.validation.Valid;

import com.bits.oems.commons.model.TokenValidationRequest;
import com.bits.oems.commons.model.UsernameResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(value = "AuthFeign", url = "${auth.path}")
public interface AuthFeign {
	
	@PostMapping(value = "${auth.path.validate}")
	public UsernameResponse validateToken(@Valid @RequestBody TokenValidationRequest request);

}
