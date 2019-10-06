package com.aws.beanstalk;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BeanStalkRestController {
	
	@GetMapping("/test/beanstalk")
	public String getMessage() {
		return "WelCome to beanstalk";
		
	}

}
