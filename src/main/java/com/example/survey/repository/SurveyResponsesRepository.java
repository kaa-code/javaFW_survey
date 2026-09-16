package com.example.survey.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.survey.entity.SurveyResponsesEntity;

public interface SurveyResponsesRepository extends JpaRepository<SurveyResponsesEntity, Long>{

}
