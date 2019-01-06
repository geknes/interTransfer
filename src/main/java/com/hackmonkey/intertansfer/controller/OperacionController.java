package com.hackmonkey.intertansfer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/operacion")
public class OperacionController {

	@GetMapping("/")
	public String listar()
	{
		return "index-transf";
	}
	
}
