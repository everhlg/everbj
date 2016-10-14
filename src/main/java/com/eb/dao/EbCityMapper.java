package com.eb.dao;

import java.util.List;

import com.eb.model.EbCity;

public interface EbCityMapper {
    int deleteByPrimaryKey(String ucode);

    int insert(EbCity record);

    int insertSelective(EbCity record);

    EbCity selectByPrimaryKey(String ucode);

    int updateByPrimaryKeySelective(EbCity record);

    int updateByPrimaryKey(EbCity record);
    
    List<EbCity> selectCity();
}