package com.eb.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.eb.dao.EbCityMapper;
import com.eb.model.EbCity;
import com.eb.service.EbCityService;

@Service
public class EbCityServiceImpl implements EbCityService{
	
	@Resource
	private EbCityMapper ebCityMapper;

	@Override
	public List<EbCity> getCity() {
		// TODO Auto-generated method stub
		return ebCityMapper.selectCity();
	}
	
	
}
