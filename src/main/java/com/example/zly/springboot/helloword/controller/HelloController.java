package com.example.zly.springboot.helloword.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloController 控制器
 * @author zly
 *
 */
@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String Hello() {
		return "Hello Word!!";
	}
}
