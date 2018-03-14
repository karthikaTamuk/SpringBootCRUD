package com.karthi.springbootstarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	

@RequestMapping("/hello")
public String sayHi() {
	return "Hi";
}

@RequestMapping("/hello/karthi")
public String sayHiKarthi() {
	return "HI!!! Karthika!!!";
}

}
