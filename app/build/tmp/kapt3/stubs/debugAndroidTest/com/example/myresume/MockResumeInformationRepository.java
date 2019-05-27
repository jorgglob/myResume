package com.example.myresume;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0002J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0006H\u0002\u00a8\u0006\u000e"}, d2 = {"Lcom/example/myresume/MockResumeInformationRepository;", "Lcom/example/myresume/domain/repository/ResumeRepository;", "()V", "getBasicMock", "Lcom/example/myresume/domain/models/BasicsData;", "getJobListMock", "", "Lcom/example/myresume/domain/models/PastJobData;", "getResumeData", "Lio/reactivex/Single;", "Lcom/example/myresume/domain/models/ResumeData;", "getSkillsListMock", "Lcom/example/myresume/domain/models/SkillsData;", "Companion", "app_debug"})
public final class MockResumeInformationRepository implements com.example.myresume.domain.repository.ResumeRepository {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String JOB_NAME = "jobName";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String JOB_POSITION = "jobPosition";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String JOB_LOGO = "jobLogo";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String JOB_PERIOD_START = "jobPeriodStart";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String JOB_PERIOD_END = "jobPeriodEnd";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String JOB_SUMMARY = "jobSummary";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SKILL = "skill";
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
    public static final com.example.myresume.MockResumeInformationRepository.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<com.example.myresume.domain.models.ResumeData> getResumeData() {
        return null;
    }
    
    private final java.util.List<com.example.myresume.domain.models.SkillsData> getSkillsListMock() {
        return null;
    }
    
    private final java.util.List<com.example.myresume.domain.models.PastJobData> getJobListMock() {
        return null;
    }
    
    private final com.example.myresume.domain.models.BasicsData getBasicMock() {
        return null;
    }
    
    public MockResumeInformationRepository() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/example/myresume/MockResumeInformationRepository$Companion;", "", "()V", "BASICS_EMAIL", "", "BASICS_NAME", "BASICS_PROFILE", "BASICS_TITLE", "BASICS_URL_IMAGE", "JOB_LOGO", "JOB_NAME", "JOB_PERIOD_END", "JOB_PERIOD_START", "JOB_POSITION", "JOB_SUMMARY", "SKILL", "SKILL_KEYWORDS", "", "getSKILL_KEYWORDS", "()Ljava/util/List;", "SKILL_LEVEL", "SKILL_URL_IMAGE", "app_debug"})
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