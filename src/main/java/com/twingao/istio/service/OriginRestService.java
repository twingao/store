package com.twingao.istio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.twingao.istio.entity.Origin;

@Service("originRestService")
public class OriginRestService {

	@Value("${restUrl.origin}")
    private String orginUrl;

	@Autowired
	RestTemplate restTemplate = new RestTemplate();

	public Origin SelectOrigin() {

		JSONObject jsonResult = JSON.parseObject(restTemplate.getForObject(orginUrl, String.class));
		return JSONObject.parseObject(jsonResult.getString("data"), Origin.class);
	}

}