package com.example.myresume.presenter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/example/myresume/presenter/ResumeActivityContract;", "", "Presenter", "View", "app_debug"})
public abstract interface ResumeActivityContract {
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/myresume/presenter/ResumeActivityContract$Presenter;", "", "disposeSubscriptions", "", "downloadResume", "initView", "app_debug"})
    public static abstract interface Presenter {
        
        public abstract void initView();
        
        public abstract void downloadResume();
        
        public abstract void disposeSubscriptions();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0016\u0010\u0007\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH&J\u0016\u0010\u000b\u001a\u00020\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\tH&\u00a8\u0006\u000e"}, d2 = {"Lcom/example/myresume/presenter/ResumeActivityContract$View;", "", "initView", "", "renderBasicInformation", "basicInformation", "Lcom/example/myresume/domain/models/BasicsData;", "renderSkillsInformation", "skillsInformation", "", "Lcom/example/myresume/domain/models/SkillsData;", "renderWorksInformation", "pastJobInformation", "Lcom/example/myresume/domain/models/PastJobData;", "app_debug"})
    public static abstract interface View {
        
        public abstract void initView();
        
        public abstract void renderBasicInformation(@org.jetbrains.annotations.NotNull()
        com.example.myresume.domain.models.BasicsData basicInformation);
        
        public abstract void renderSkillsInformation(@org.jetbrains.annotations.NotNull()
        java.util.List<com.example.myresume.domain.models.SkillsData> skillsInformation);
        
        public abstract void renderWorksInformation(@org.jetbrains.annotations.NotNull()
        java.util.List<com.example.myresume.domain.models.PastJobData> pastJobInformation);
    }
}