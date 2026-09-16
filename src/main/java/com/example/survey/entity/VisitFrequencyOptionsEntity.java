package com.example.survey.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="visit_frequency_options")
public class VisitFrequencyOptionsEntity {

	// id
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	// label
	private String label;
	
	// sort_order
	private Integer sortOrder;
}
