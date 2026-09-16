package com.example.survey.service;

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
}
