package com.example.survey.service;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.example.survey.dto.SurveyDto;
import com.example.survey.form.SurveyForm;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SurveyService {
	
	// DI
	private final ModelMapper modelMapper;

	// FormからDtoに変換
	public SurveyDto setSurveyDto(SurveyForm form) {
		
		SurveyDto dto = new SurveyDto();
		
		// 
		modelMapper.map(form, dto);
		
		return dto;
	}
}
