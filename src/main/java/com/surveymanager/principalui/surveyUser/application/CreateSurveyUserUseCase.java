package com.surveymanager.principalui.surveyUser.application;

import com.surveymanager.principalui.surveyUser.domain.entity.SurveyUser;
import com.surveymanager.principalui.surveyUser.domain.service.SurveyUserService;

public class CreateSurveyUserUseCase {
    private final SurveyUserService surveyUserService;

    public CreateSurveyUserUseCase(SurveyUserService surveyUserService) {
        this.surveyUserService = surveyUserService;
    }
    
    public void execute(SurveyUser surveyUser){
        surveyUserService.createSurveyUser(surveyUser);
    }

}
