package com.example.myresume.presenter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u00020\u000eH\u0002J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0010H\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0007J\b\u0010\u0016\u001a\u00020\u0015H\u0007J\b\u0010\u0017\u001a\u00020\u0015H\u0007J\b\u0010\u0018\u001a\u00020\u0015H\u0007J\b\u0010\u0019\u001a\u00020\u0015H\u0007J\b\u0010\u001a\u001a\u00020\u0015H\u0007J\b\u0010\u001b\u001a\u00020\u0015H\u0007J\b\u0010\u001c\u001a\u00020\u0015H\u0007J\b\u0010\u001d\u001a\u00020\u0015H\u0007J\b\u0010\u001e\u001a\u00020\u0015H\u0007R\u0012\u0010\u0003\u001a\u00020\u00048\u0002@\u0002X\u0083.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00020\b8\u0002@\u0002X\u0083.\u00a2\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00020\n8\u0002@\u0002X\u0083.\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u00020\f8\u0002@\u0002X\u0083.\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/example/myresume/presenter/UtResumePresenter;", "", "()V", "genericMethodsView", "Lcom/example/myresume/view/GenericMethodsView;", "resumeActivityPresenter", "Lcom/example/myresume/presenter/ResumeActivityContract$Presenter;", "resumeActivityView", "Lcom/example/myresume/presenter/ResumeActivityContract$View;", "resumeUseCase", "Lcom/example/myresume/domain/interactors/GetResumeInteractor;", "stringsResolver", "Lcom/example/myresume/domain/resolver/StringsResolver;", "createBasicsData", "Lcom/example/myresume/domain/models/BasicsData;", "createSkillDataList", "", "Lcom/example/myresume/domain/models/SkillsData;", "createWorkDataList", "Lcom/example/myresume/domain/models/PastJobData;", "setUp", "", "testGetResumeInformationSuccessfulWithNoData", "testGetResumeInformationWithAnyOtherException", "testGetResumeInformationWithGenericException", "testGetResumeInformationWithOnlyBasics", "testGetResumeInformationWithOnlySkills", "testGetResumeInformationWithOnlyWorks", "testGetResumeInformationWithTimeoutException", "testGetResumeInformationWithallData", "testInitView", "Companion", "app_debug"})
public final class UtResumePresenter {
    @org.mockito.Mock()
    private com.example.myresume.presenter.ResumeActivityContract.View resumeActivityView;
    @org.mockito.Mock()
    private com.example.myresume.view.GenericMethodsView genericMethodsView;
    @org.mockito.Mock()
    private com.example.myresume.domain.resolver.StringsResolver stringsResolver;
    @org.mockito.Mock()
    private com.example.myresume.domain.interactors.GetResumeInteractor resumeUseCase;
    private com.example.myresume.presenter.ResumeActivityContract.Presenter resumeActivityPresenter;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String WORK_COMPANY = "workCompany";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String WORK_POSITION = "workPosition";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String WORK_URL_IMAGE = "workUrlImage";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String WORK_PERIOD_START = "workPeriodStart";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String WORK_PERIOD_END = "workPeriodEnd";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String WORK_SUMMARY = "workSummary";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SKILL_NAME = "skillName";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SKILL_LEVEL = "skillLevel";
    @org.jetbrains.annotations.NotNull()
    private static final java.util.List<java.lang.String> SKILL_KEYWORDS = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SKILL_URL_IMAGE = "skillUrlImage";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BASICS_NAME = "name";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BASICS_TITLE = "title";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BASICS_URL_IMAGE = "urlImage";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BASICS_EMAIL = "email";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BASICS_PROFILE = "profile";
    public static final com.example.myresume.presenter.UtResumePresenter.Companion Companion = null;
    
    @org.junit.Before()
    public final void setUp() {
    }
    
    @org.junit.Test()
    public final void testInitView() {
    }
    
    @org.junit.Test()
    public final void testGetResumeInformationWithallData() {
    }
    
    @org.junit.Test()
    public final void testGetResumeInformationSuccessfulWithNoData() {
    }
    
    @org.junit.Test()
    public final void testGetResumeInformationWithOnlySkills() {
    }
    
    @org.junit.Test()
    public final void testGetResumeInformationWithOnlyBasics() {
    }
    
    @org.junit.Test()
    public final void testGetResumeInformationWithOnlyWorks() {
    }
    
    @org.junit.Test()
    public final void testGetResumeInformationWithTimeoutException() {
    }
    
    @org.junit.Test()
    public final void testGetResumeInformationWithGenericException() {
    }
    
    @org.junit.Test()
    public final void testGetResumeInformationWithAnyOtherException() {
    }
    
    private final java.util.List<com.example.myresume.domain.models.SkillsData> createSkillDataList() {
        return null;
    }
    
    private final java.util.List<com.example.myresume.domain.models.PastJobData> createWorkDataList() {
        return null;
    }
    
    private final com.example.myresume.domain.models.BasicsData createBasicsData() {
        return null;
    }
    
    public UtResumePresenter() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/example/myresume/presenter/UtResumePresenter$Companion;", "", "()V", "BASICS_EMAIL", "", "BASICS_NAME", "BASICS_PROFILE", "BASICS_TITLE", "BASICS_URL_IMAGE", "SKILL_KEYWORDS", "", "getSKILL_KEYWORDS", "()Ljava/util/List;", "SKILL_LEVEL", "SKILL_NAME", "SKILL_URL_IMAGE", "WORK_COMPANY", "WORK_PERIOD_END", "WORK_PERIOD_START", "WORK_POSITION", "WORK_SUMMARY", "WORK_URL_IMAGE", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> getSKILL_KEYWORDS() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}