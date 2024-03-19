package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GoodsController {

	@GetMapping("/listGoods")
	public String list() {
		System.out.println("1");
		return "상품목록";
	}
}
