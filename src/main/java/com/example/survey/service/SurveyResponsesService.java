package com.example.survey.service;

import org.springframework.stereotype.Service;

import com.example.survey.repository.SurveyResponsesRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SurveyResponsesService {

	// =DI=
	private final SurveyResponsesRepository surveyReponsesRepository;
	
	
}
