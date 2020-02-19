package com.Fabio.Assignment10_RestAndJSON.service;

import java.net.URI;

import org.junit.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;


public class TestApi {

	@Test
	public void callSpoonacularApi() {
		
		RestTemplate rt = new RestTemplate();
		
		URI uri = UriComponentsBuilder
									.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
									.queryParam("timeFrame", "week")
									.queryParam("targetCalories", "2000")
									.queryParam("diet", "vegan")
									.queryParam("exclude", "olives")
									.queryParam("apiKey", "33e1b7f88b9b4da4b60723d831345db0")
									.build()
									.toUri();
		
		ResponseEntity<String> forEntity = rt.getForEntity(uri, String.class);
		System.out.println(forEntity.getBody());
	}
}
