package com.surveymanager.principalui.surveyUser.domain.service;

import java.util.List;

import com.surveymanager.chapter.domain.entity.Chapter;
import com.surveymanager.principalui.surveyUser.domain.entity.SurveyUser;
import com.surveymanager.principalui.surveyUser.domain.entity.SurveyUserDto;
import com.surveymanager.question.domain.entity.Question;
import com.surveymanager.response.domain.entity.Response;
import com.surveymanager.subresponse.domain.Subresponse;

public interface SurveyUserService {

    public List<Chapter> findChapterBySurvey(int id);

    public List<Question> findQuestionByCategory(int idChapter, int idCategory);

    public List<Response> findResponseByQuestion(int id);

    public List<Subresponse> findSubresponseByQuestion(int id);

    public void createSurveyUser(SurveyUser surveyUser);

    public List<SurveyUserDto> findSurveysResponses(int idSurvey, int idChapter);

}
