package com.example.survey.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.survey.entity.AgeGroupsEntity;
import com.example.survey.repository.AgeGroupsRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AgeGroupsService {
	
	// =DI=
	private final AgeGroupsRepository ageGroupsRepository;
	
	// 全件取得
	public List<AgeGroupsEntity> findAll() {
		List<AgeGroupsEntity> entity;
		entity = ageGroupsRepository.findAllByOrderBySortOrderAsc();
		return entity;
	}	
}
