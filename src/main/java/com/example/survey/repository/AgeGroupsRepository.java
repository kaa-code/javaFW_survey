package com.example.survey.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.survey.entity.AgeGroupsEntity;

public interface AgeGroupsRepository extends JpaRepository<AgeGroupsEntity, Integer> {
	
	// sort_orderの昇順で全件取得
    List<AgeGroupsEntity> findAllByOrderBySortOrderAsc();
}
