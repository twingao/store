package com.twingao.istio.service.impl;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.twingao.istio.service.DetailService;
import com.twingao.istio.entity.Detail;
import com.twingao.istio.service.OriginRestService;

@Service("detailService")
public class DetailServiceImpl implements DetailService {

	@Autowired
	OriginRestService originRestService;
	
	public List<Detail> SelectAllDetail() {
		
		List<Detail> details = new LinkedList<Detail>();
		
		details.add(new Detail(1, "v1", "Food", "Apple", 5, LocalDate.of(2019, 9, 12), originRestService.SelectOrigin()));
		details.add(new Detail(2, "v1", "Food", "Coca.Cola", 3, LocalDate.of(2019, 2, 23), originRestService.SelectOrigin()));
		details.add(new Detail(3, "v1", "Food", "Flour", 35, LocalDate.of(2019, 7, 21), originRestService.SelectOrigin()));
		details.add(new Detail(4, "v1", "Food", "Eggplant", 5, LocalDate.of(2020, 1, 4), originRestService.SelectOrigin()));
		details.add(new Detail(5, "v1", "Food", "Sunflower", 12, LocalDate.of(2019, 6, 5), originRestService.SelectOrigin()));

		return details;
	}

	public Detail SelectDetailById(Integer id) {

		if (id == 1) {
			return new Detail(1, "v1", "Food", "Apple", 5, LocalDate.of(2019, 9, 12), originRestService.SelectOrigin());
		}
		else if (id == 2) {
			return new Detail(2, "v1", "Food", "Coca.Cola", 3, LocalDate.of(2019, 2, 23), originRestService.SelectOrigin());
		}
		else if (id == 3) {
			return new Detail(3, "v1", "Food", "Flour", 35, LocalDate.of(2019, 7, 21), originRestService.SelectOrigin());
		}
		else if (id == 4) {
			return new Detail(4, "v1", "Food", "Eggplant", 5, LocalDate.of(2020, 1, 4), originRestService.SelectOrigin());
		}
		else if (id == 5) {
			return new Detail(5, "v1", "Food", "Sunflower", 12, LocalDate.of(2019, 6, 5), originRestService.SelectOrigin());
		}
		else {
			return new Detail(-1, "v1", "Food", "None", -112, LocalDate.of(2000, 1, 1), null);
		}
	}
}