package com.twingao.istio.service;

import java.util.List;

import com.twingao.istio.entity.Detail;

public interface DetailService {

	public List<Detail> SelectAllDetail();	

	public Detail SelectDetailById(Integer id);	

}