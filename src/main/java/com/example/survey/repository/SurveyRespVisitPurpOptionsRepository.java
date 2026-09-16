package com.example.survey.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.survey.entity.SurveyRespVisitPurpOptionsEntity;
import com.example.survey.entity.SurveyRespVisitPurpOptionsId;

public interface SurveyRespVisitPurpOptionsRepository extends JpaRepository<SurveyRespVisitPurpOptionsEntity, SurveyRespVisitPurpOptionsId> {

	// アンケート結果IDから取得
	List<SurveyRespVisitPurpOptionsEntity> findBySurveyResponseId(Long surveyResponseId);
}
