package com.daleum.ex.Hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloConrtoller {

	@ResponseBody
	@RequestMapping("/hello")
	public String helloWorld() {
		return "Hello World";
	}
}
