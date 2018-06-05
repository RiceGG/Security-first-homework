package cn.com.taiji.config;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

public class SecurityWebApplicationInitializer
	extends AbstractSecurityWebApplicationInitializer {

	public SecurityWebApplicationInitializer() {
		super(WebSecurityConfig.class);
	}
}