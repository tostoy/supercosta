package com.nobrain.supercosta.core.config;

import java.util.Optional;

import org.springframework.data.domain.AuditorAware;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

public class AuditorAwareImpl implements AuditorAware<Long>	 {

	@Override
	public Optional<Long> getCurrentAuditor() {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (auth == null || auth instanceof AnonymousAuthenticationToken) {
			return Optional.of(-1L);
		} else {
			// TODO: use login user id
			return Optional.of(1L);
		}
		
	}

}
