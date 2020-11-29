package com.twingao.istio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.twingao.istio.entity.Detail;
import com.twingao.istio.service.DetailService;
import com.twingao.istio.utils.JsonResult;

@RestController
public class DetailController {

	@Autowired
    private DetailService detailService;
	
	@RequestMapping("/detail")
	public JsonResult getAllDetail() {

		System.out.println("detail.v1-----------http://detail:8084/detail");

		List<Detail> details = detailService.SelectAllDetail();
		return new JsonResult(JsonResult.OK_CODE, JsonResult.OK_MSG, details);
	}

	@RequestMapping("/detail/{id}")
	public JsonResult getDetail(@PathVariable Integer id) {

		System.out.println("detail.v1-----------http://detail:8084/detail/" + String.valueOf(id));

		Detail detail = detailService.SelectDetailById(id);
		return new JsonResult(JsonResult.OK_CODE, JsonResult.OK_MSG, detail);
	}
}