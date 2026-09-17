package com.example.survey.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.survey.entity.VisitFrequencyOptionsEntity;
import com.example.survey.repository.VisitFrequencyOptionsRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class VisitFrequencyOptionsService {

	// =DI=
	private final VisitFrequencyOptionsRepository visitFrequencyOptionsRepository;

	// 全件取得
	public List<VisitFrequencyOptionsEntity> findAll() {
		List<VisitFrequencyOptionsEntity> entity;
		entity = visitFrequencyOptionsRepository.findAll();
		return entity;
	}

	// IDからラベルを取得
	public String getLabelById(Integer id) {
		
		if(id == null) {
			return "";
		}
		
		VisitFrequencyOptionsEntity entity;
		String label;

		entity = visitFrequencyOptionsRepository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("ID" + id + "のデータが取得できませんでした。"));
		label = entity.getLabel();

		return label;
	}
}
