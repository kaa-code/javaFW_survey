package com.example.survey.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.survey.dto.SurveyDto;
import com.example.survey.entity.AgeGroupsEntity;
import com.example.survey.entity.VisitFrequencyOptionsEntity;
import com.example.survey.entity.VisitPurposeOptionsEntity;
import com.example.survey.form.SurveyForm;
import com.example.survey.service.AgeGroupsService;
import com.example.survey.service.StoresService;
import com.example.survey.service.SurveyService;
import com.example.survey.service.VisitFrequencyOptionsService;
import com.example.survey.service.VisitPurposeOptionsService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequiredArgsConstructor
@RequestMapping("/survey")
public class SurveyController {

	// =DI=
	private final AgeGroupsService ageGroupsService;
	private final VisitFrequencyOptionsService visitFrequencyOptionsService;
	private final VisitPurposeOptionsService visitPurposeOptionsService;
	private final StoresService storesService;
	private final SurveyService surveyService;

	// =メソッド=

	// マスターテーブルの一括属性追加
	public void addAttributeMasterTable(Model model) {

		// =変数宣言=
		List<AgeGroupsEntity> ageGroups;
		List<VisitFrequencyOptionsEntity> visitFrequencyOptions;
		List<VisitPurposeOptionsEntity> visitPurposeOptions;

		// =データ取得=
		// 年齢層全件取得(sortOrder順)
		ageGroups = ageGroupsService.findAll();
		visitFrequencyOptions = visitFrequencyOptionsService.findAll();
		visitPurposeOptions = visitPurposeOptionsService.findAll();

		// =属性追加=
		// 年齢層ラベル
		model.addAttribute("age_groups", ageGroups);
		// 来店頻度ラベル
		model.addAttribute("visit_frequency_options", visitFrequencyOptions);
		// 来店目的ラベル
		model.addAttribute("visit_purpose_options", visitPurposeOptions);
		// 評価のための数値ラベル
		model.addAttribute("scores", List.of(1, 2, 3, 4, 5));
	}

	// =マッピング=

	// テスト
	@GetMapping("/test")
	public String test() {
		return "test";
	}

	// アンケート入力
	@GetMapping
	public String inputSurvey(@RequestParam("id") Long storeId, Model model) {

		SurveyForm form = new SurveyForm();
		form.setStoreId(storeId);
		
		
		// =属性追加=
		
		// マスターテーブルの一括属性追加
		addAttributeMasterTable(model);
		// 店舗の属性追加
		model.addAttribute("store", storesService.findStoreById(storeId));
		// フォームの属性追加		
		model.addAttribute("form", form);
		
		
		return "survey-form";
	}

	// アンケート送信処理
	@PostMapping("/confirm")
	public String surveyConfirm(@ModelAttribute("form") SurveyForm form, BindingResult result, Model model) {

		SurveyDto dto;
		
		dto = surveyService.setSurveyDto(form);
		
		model.addAttribute("dto", dto);
		
		return "test";
	}
}