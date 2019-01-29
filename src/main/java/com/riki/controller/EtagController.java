package com.riki.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EtagController {

	@RequestMapping("/")
	public String dateAndTime() {
		SimpleDateFormat format= new SimpleDateFormat("dd/MM/yyyy HH:mm");
		Date date=new Date();
		return format.format(date);
	}
}
