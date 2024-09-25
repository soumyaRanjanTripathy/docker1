package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Student {
@GetMapping("/hy")
public String m1()
{
	return "Wellcome to app";
	
}
}
