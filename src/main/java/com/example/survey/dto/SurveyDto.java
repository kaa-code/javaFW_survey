package com.example.survey.dto;

import java.time.LocalDateTime;
import java.util.List;

import com.example.survey.entity.StoresEntity;

import lombok.Data;

@Data
public class SurveyDto {

	// =メタデータ=

	// 作成日時
	private LocalDateTime createdAt;

	// 店舗マスター
	private StoresEntity store;

	// ==入力データ==

	// =個人データ=

	// 名前データ
	private String name;

	// 年齢層データ
	private String ageGroupLabel;

	// メールアドレスデータ
	private String email;

	// =一般質問データ=

	// 来店頻度データ
	private String visitFrequencyLabel;

	// 来店目的データ
	private List<String> visitPurposeLabels;

	// 料理満足度データ
	private Integer mealRating;

	// 接客満足度データ
	private Integer serviceRating;

	// 店内の清潔感データ
	private Integer cleanlinessRating;

	// おすすめメニューデータ
	private String recommendMenu;

	// ご意見・ご感想データ
	private String feedback;

	// =長崎質問データ=

	// ハンバーグを食べたかデータ
	private Boolean hasEatenNagasakiHamburg;

	// ハンバーグ満足度データ
	private Integer nagasakiHamburgRating;

}
