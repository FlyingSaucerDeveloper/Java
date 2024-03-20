package com.flyingsaucer.webApp.Controller;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
	
	@PostMapping("login")
	public void loginCredentials(@Param("userid") String id, @Param("password") String password ) {
		
		
		
		
	}
	
	

}
