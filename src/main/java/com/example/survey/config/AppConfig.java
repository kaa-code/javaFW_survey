package com.example.survey.config;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.survey.entity.SurveyResponsesEntity;
import com.example.survey.form.SurveyForm;

@Configuration
public class AppConfig {

	@Bean
	public ModelMapper modelMapper() {
		ModelMapper modelMapper = new ModelMapper();

		// フィールド名が完全一致するものだけマッピング（誤マッピング防止）
        modelMapper.getConfiguration()
            .setMatchingStrategy(MatchingStrategies.STRICT);

        // SurveyForm → SurveyResponsesEntity のマッピング設定（id の自動コピーを除外）
        modelMapper.typeMap(SurveyForm.class, SurveyResponsesEntity.class)
            .addMappings(mapper -> {
                mapper.skip(SurveyResponsesEntity::setId);
            });

		return modelMapper;
	}
}
