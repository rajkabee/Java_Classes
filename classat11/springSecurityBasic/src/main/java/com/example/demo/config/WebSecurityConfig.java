package com.example.demo.config;


	import org.springframework.context.annotation.Bean;
	import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
	import org.springframework.security.config.annotation.web.builders.HttpSecurity;
	import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
	import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
	import org.springframework.security.crypto.password.NoOpPasswordEncoder;
	import org.springframework.security.crypto.password.PasswordEncoder;
	@EnableWebSecurity
	public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
		@Override
		protected void configure(AuthenticationManagerBuilder auth) throws Exception {
			auth.inMemoryAuthentication()
				.withUser("user")
				.password("userpass")
				.roles("USER")
				.and()
				.withUser("manager")
				.password("managerpass")
				.roles("MANAGER")
				.and()
				.withUser("admin")
				.password("adminpass")
				.roles("ADMIN");
		}		
		
		@Override
		protected void configure(HttpSecurity http) throws Exception {
			http.authorizeRequests()
			.antMatchers("/admin").hasRole("ADMIN")
			.antMatchers("/manager").hasAnyRole("MANAGER", "ADMIN")
			.antMatchers("/user").hasAnyRole("USER","MANAGER","ADMIN")
			.antMatchers("/", "/login", "/logout").permitAll()
			.and().formLogin();
		}
		
		@Bean
		public PasswordEncoder getPasswordEncoder() {
			return NoOpPasswordEncoder.getInstance();
		}
		
		
	}
