package com.example.survey.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.survey.entity.AgeGroupsEntity;
import com.example.survey.entity.VisitPurposeOptionsEntity;

public interface VisitPurposeOptionsRepository extends JpaRepository<VisitPurposeOptionsEntity, Integer>{
	
	// sort_orderの昇順で全件取得
    List<AgeGroupsEntity> findAllByOrderBySortOrderAsc();
}
