package com.test.demo3;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@RequestMapping(value="/greetings", method = RequestMethod.GET, params = {"name"})
	public @ResponseBody String greetingsUser(@RequestParam(value = "name") String name){
		
		return "Hello "+name + " our services are up and running! :)";
	}

}
