package com.hackmonkey.intertansfer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class OperacionController {

	@GetMapping("/index")
	public String listar()
	{
		return "index-transf";
	}
	
}
