package com.example.survey.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="survey_resp_visit_purp_options")
@IdClass(SurveyRespVisitPurpOptionsId.class)
public class SurveyRespVisitPurpOptionsEntity {

	// survey_response_id
	@Id
	private Long surveyResponseId;
	
	// visit_purpose_option_id
	@Id
	private Integer visitPurposeOptionId;
}
