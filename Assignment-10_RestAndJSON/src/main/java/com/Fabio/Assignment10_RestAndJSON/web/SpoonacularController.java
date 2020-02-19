package com.Fabio.Assignment10_RestAndJSON.web;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Fabio.Assignment10_RestAndJSON.dto.ResponseDay;
import com.Fabio.Assignment10_RestAndJSON.dto.Week;
import com.Fabio.Assignment10_RestAndJSON.service.SpoonacularIntegration;

@RestController
public class SpoonacularController {

	SpoonacularIntegration api = new SpoonacularIntegration();
	@GetMapping("mealplanner/day")
	public ResponseEntity<ResponseDay> getDayMeals(String numCalories, 
			String diet, String exclusions){
		
		ResponseEntity<ResponseDay> response = api.callSpoonacularDay(numCalories, diet, exclusions);
		return response;
	}

	@GetMapping("mealplanner/week")
	public ResponseEntity<Week> getWeekMeals(String numCalories,
			String diet, String exclusions){
		
		ResponseEntity<Week> response = api.callSpoonacularWeek(numCalories, diet, exclusions);
				
		return response;
	}
}
