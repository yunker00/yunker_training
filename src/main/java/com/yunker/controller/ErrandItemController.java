package com.yunker.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yunker.domain.ErrandItem;

@RestController
@RequestMapping("erranditem")
public class ErrandItemController {

	private List<ErrandItem> items = new ArrayList<>();
	
	
	@GetMapping
	public List<ErrandItem> getErrandItems(){
		System.out.println("Received !!!");
		return items;
	}
	
	@PostMapping
	public ErrandItem registerErrandItem(@RequestBody ErrandItem item){
		items.add(item);
		return item;
	}
	
}
