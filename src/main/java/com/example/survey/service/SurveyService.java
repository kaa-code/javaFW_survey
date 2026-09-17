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
	private final AgeGroupsService ageGroupsService;	
	private final VisitPurposeOptionsService visitPurposeOptionsService;
	private final VisitFrequencyOptionsService visitFrequencyOptionsService;

	// FormからDtoに変換
	public SurveyDto setSurveyDto(SurveyForm form) {
		
		SurveyDto dto = new SurveyDto();
		
		// あらかたのマップ
		modelMapper.map(form, dto);
		// 年齢層ラベル
		dto.setAgeGroupLabel(ageGroupsService.getLabelById(form.getAgeGroupId()));
		// 来店目的ラベル
		dto.setVisitPurposeLabels(visitPurposeOptionsService.getLabelsByIds(form.getVisitPurposeIds()));
		// 来店頻度ラベル
		dto.setVisitFrequencyLabel(visitFrequencyOptionsService.getLabelById(form.getVisitFrequencyId()));
		
		return dto;
	}
	
}
