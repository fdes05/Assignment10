package com.Fabio.Assignment10_RestAndJSON.service;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import com.Fabio.Assignment10_RestAndJSON.dto.ResponseDay;
import com.Fabio.Assignment10_RestAndJSON.dto.Week;

@Service
public class SpoonacularIntegration {
	
	public ResponseEntity<ResponseDay> callSpoonacularDay(String cal, 
			String diet, String exclude) {
		
		RestTemplate rt = new RestTemplate();
		
		URI uri = UriComponentsBuilder
									.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
									.queryParam("timeFrame", "day")
									.queryParam("targetCalories", cal)
									.queryParam("diet", diet)
									.queryParam("exclude", exclude)
									.queryParam("apiKey", "33e1b7f88b9b4da4b60723d831345db0")
									.build()
									.toUri();
		
		ResponseEntity<ResponseDay> forEntity = rt.getForEntity(uri, ResponseDay.class);
		System.out.println(forEntity.getBody());
		
		return forEntity;
	}
	
	public ResponseEntity<Week> callSpoonacularWeek(String cal, 
			String diet, String exclude) {
		
		RestTemplate rt = new RestTemplate();
		
		URI uri = UriComponentsBuilder
									.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
									.queryParam("timeFrame", "week")
									.queryParam("targetCalories", cal)
									.queryParam("diet", diet)
									.queryParam("exclude", exclude)
									.queryParam("apiKey", "33e1b7f88b9b4da4b60723d831345db0")
									.build()
									.toUri();
		
		ResponseEntity<Week> forEntity = rt.getForEntity(uri, Week.class);
		
		System.out.println(forEntity.getBody());
		
		return forEntity;
	}
	
}
