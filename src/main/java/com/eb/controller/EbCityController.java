package com.eb.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eb.model.EbCity;
import com.eb.service.EbCityService;

@Controller
@RequestMapping("EbCity/*")
public class EbCityController {
	
	@Resource
	private EbCityService ebCityService;
	
	@RequestMapping("getCity")
	public String getCity(HttpServletRequest request){
		List<EbCity> cities = ebCityService.getCity();
		request.setAttribute("cities", cities);
		return "city";
	}
}
