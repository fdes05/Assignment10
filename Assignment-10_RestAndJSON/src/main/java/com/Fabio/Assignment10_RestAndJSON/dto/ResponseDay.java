package com.Fabio.Assignment10_RestAndJSON.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;


public class ResponseDay {
	
	@JsonProperty("meals")
	private List<Meals> listOfMeals;
	
	@JsonProperty("nutrients")
	private Nutrients nutrients;
	
	public List<Meals> getMeals() {
		return listOfMeals;
	}
	public void setMeals(List<Meals> listOfMeals) {
		this.listOfMeals = listOfMeals;
	}
	public Nutrients getNutrients() {
		return nutrients;
	}
	public void setNutrients(Nutrients nutrients) {
		this.nutrients = nutrients;
	}
}
