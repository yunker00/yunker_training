package com.yunker.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yunker.domain.ErrandItem;

@Controller
@RequestMapping("errand")
public class ErrandItemController {

	private List<ErrandItem> items = new ArrayList<>();
		
	@GetMapping
	public String getInput(Model m){
		m.addAttribute(new ErrandItem());
		return "errand/input";
	}
	
	@PostMapping
	public String registerErrandItem(ErrandItem errandItem){
		items.add(errandItem);
		return "errand/output";
	}
	
}
