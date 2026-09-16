package com.example.survey.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="survey_responses")
public class SurveyResponsesEntity {

	// id
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	// store_id
	private Long storeId;
	
	// name
	private String name;
	
	// age_group_id
	private Integer ageGroupId;
	
	// email
	private String email;
	
	// visit_frequency_id
	private Integer visitFrequencyId;
	
	// meal_rating
	private Integer mealRating;
	
	// service_rating
	private Integer serviceRating;
	
	// cleanliness_rating
	private Integer cleanlinessRating;
	
	// recommend_menu
	private String recommendMenu;
	
	// feedback
	private String feedback;
	
	// has_eaten_nagasaki_hamburg
	private Boolean hasEatenNagasakiHamburg;
	
	// nagasaki_hamburg_rating
	private Integer nagasakiHamburgRating;
	
	// created_at
	private LocalDateTime createdAt;
}
