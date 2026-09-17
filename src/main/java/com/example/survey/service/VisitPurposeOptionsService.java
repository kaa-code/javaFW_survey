package com.example.survey.service;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.survey.entity.VisitPurposeOptionsEntity;
import com.example.survey.repository.VisitPurposeOptionsRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class VisitPurposeOptionsService {

	// =DI=
	private final VisitPurposeOptionsRepository visitPurposeOptionsRepository;

	// 全件取得
	public List<VisitPurposeOptionsEntity> findAll() {
		List<VisitPurposeOptionsEntity> entity;
		entity = visitPurposeOptionsRepository.findAll();
		return entity;
	}

	// IDからラベルを取得
	public String getLabelById(Integer id) {
		
		if(id == null) {
			return "";
		}
		
		VisitPurposeOptionsEntity entity;
		String label;

		entity = visitPurposeOptionsRepository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("ID" + id + "のデータが取得できませんでした。"));
		label = entity.getLabel();

		return label;
	}

	// IDリストからラベルリストを取得
	public List<String> getLabelsByIds(List<Integer> ids) {

		if (ids == null || ids.isEmpty()) {
			return Collections.emptyList();
		}

		List<String> labels;

		labels = visitPurposeOptionsRepository.findAllById(ids).stream()
				.map(VisitPurposeOptionsEntity::getLabel)
				.toList();

		return labels;
	}
}
