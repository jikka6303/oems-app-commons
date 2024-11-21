package com.bits.oems.commons.service;

import java.util.ArrayList;
import java.util.Optional;

import com.bits.oems.commons.constant.AppConstants;
import com.bits.oems.commons.feign.AuthUserFeign;
import com.bits.oems.commons.logger.LogExecutionTime;
import com.bits.oems.commons.model.AuthUserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JWTUserDetailService implements UserDetailsService {

	@Autowired
	private AuthUserFeign authUserDelegate;

	@Override
	@LogExecutionTime
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		AuthUserDto user = Optional.ofNullable(authUserDelegate.findByUsername(username))
				.orElseThrow(() -> new UsernameNotFoundException(AppConstants.NO_SUCH_USER_EXISTS));
		return new User(username, user.getPassword(), new ArrayList<>());
	}

}
