package com.yunker.domain;

import java.io.Serializable;

import lombok.Builder;
import lombok.Data;

@Data
public class ErrandItem implements Serializable{

	private static final long serialVersionUID = 1185886977483408286L;

	private String name;
	private String description;
	
	
}
