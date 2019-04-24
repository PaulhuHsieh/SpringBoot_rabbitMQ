package iii.server.MQTT;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;



@Configuration
@EnableWebSecurity
public class WebSecurityConfigurer extends WebSecurityConfigurerAdapter {   
	
	//@Autowired
    //private UserDetailsService userDetailsService;
	
    //@Bean
    //@Override
    //public AuthenticationManager authenticationManagerBean() throws Exception {
    //    return super.authenticationManagerBean();
    //}
    @Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
    	/*
		http.
			authorizeRequests()
			.anyRequest() //對象為所有網址
			.authenticated() //存取必須通過驗證
			.and()
			.formLogin() //若未不符合authorize條件，則產生預設login表單
			.and()
			.httpBasic(); //產生基本表單
	    */
    	 http
    	 .csrf()
    	 .disable();
         http
         .authorizeRequests()
         .antMatchers("/")
         .permitAll();
	}
    
    
}
