package com.example.survey.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// 複合主キーのIDクラス
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SurveyRespVisitPurpOptionsId implements Serializable {
	private Long surveyResponseId;
	private Integer visitPurposeOptionId;
}