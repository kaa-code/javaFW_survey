package com.example.survey.form;

import java.util.List;

import lombok.Data;

@Data
public class SurveyForm {

	// =メタデータ=

	// 店舗ID
	private Long storeId;

	// 利用規約同意フラグ
	private Boolean isTermsAccepted;

	// =個人データ=

	// 名前
	private String name;

	// 年齢層データ
	private Integer ageGroupId;

	// メールアドレスデータ
	private String email;

	// =一般質問データ=

	// 来店頻度データ
	private Integer visitFrequencyId;

	// 来店目的データ
	private List<Integer> visitPurposeIds;

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

	// =長崎限定=

	// ハンバーグを食べたかデータ
	private Boolean hasEatenNagasakiHamburg;

	// ハンバーグ満足度データ
	private Integer nagasakiHamburgRating;
}
