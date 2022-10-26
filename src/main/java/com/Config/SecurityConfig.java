package com.Config;


import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		auth.inMemoryAuthentication()
		.withUser("subhashmothukuru@gmail.com")
		.password("Leon12345678(")
		.roles("admin")
		.and()
		.withUser("subhash@gmail.com")
		.password("Leon12345678(")
		.roles("manager")
		.and()
		.withUser("subbu@gmail.com")
		.password("Leon12345678(")
		.roles("user");
		
		
	}
	

	@Bean
	public PasswordEncoder getPasswordEncoder()
	{
		return NoOpPasswordEncoder.getInstance();
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers("/create").hasRole("admin")
		.antMatchers("/delete/{bookId}").hasRole("admin")
		.antMatchers("/update").hasAnyRole("admin", "manager")
		.antMatchers("/showNewBook").hasAnyRole("admin", "manager")
		.antMatchers("/**").permitAll().
		and().formLogin();
		
	}
	


}
