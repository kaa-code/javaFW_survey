package com.example.survey.service;

import org.springframework.stereotype.Service;

import com.example.survey.entity.StoresEntity;
import com.example.survey.repository.StoresRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StoresService {

	// =DI=
	private final StoresRepository storesRepository;

	// IDから取得
	public StoresEntity findStoreById(Long id) {
		StoresEntity entity;
		entity = storesRepository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("ID" + id + "のデータが取得できませんでした。"));
		return entity;
	}
}
