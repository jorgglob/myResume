package com.example.data.mappers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0007\b\tB\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0016\u00a8\u0006\n"}, d2 = {"Lcom/example/data/mappers/ResumeDataMapper;", "Lcom/example/data/mappers/Map;", "Lcom/example/data/remote/ResumeResponse;", "Lcom/example/myresume/domain/models/ResumeData;", "()V", "transform", "value", "BasicsDataMapper", "PastJobsMapper", "SkillsMapper", "data_debug"})
public final class ResumeDataMapper extends com.example.data.mappers.Map<com.example.data.remote.ResumeResponse, com.example.myresume.domain.models.ResumeData> {
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.myresume.domain.models.ResumeData transform(@org.jetbrains.annotations.NotNull()
    com.example.data.remote.ResumeResponse value) {
        return null;
    }
    
    public ResumeDataMapper() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0016\u00a8\u0006\u0007"}, d2 = {"Lcom/example/data/mappers/ResumeDataMapper$BasicsDataMapper;", "Lcom/example/data/mappers/Map;", "Lcom/example/data/models/PersonalInfo;", "Lcom/example/myresume/domain/models/BasicsData;", "()V", "transform", "value", "data_debug"})
    public static final class BasicsDataMapper extends com.example.data.mappers.Map<com.example.data.models.PersonalInfo, com.example.myresume.domain.models.BasicsData> {
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.example.myresume.domain.models.BasicsData transform(@org.jetbrains.annotations.NotNull()
        com.example.data.models.PersonalInfo value) {
            return null;
        }
        
        public BasicsDataMapper() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0016\u00a8\u0006\u0007"}, d2 = {"Lcom/example/data/mappers/ResumeDataMapper$PastJobsMapper;", "Lcom/example/data/mappers/Map;", "Lcom/example/data/models/WorkExperience;", "Lcom/example/myresume/domain/models/PastJobData;", "()V", "transform", "value", "data_debug"})
    public static final class PastJobsMapper extends com.example.data.mappers.Map<com.example.data.models.WorkExperience, com.example.myresume.domain.models.PastJobData> {
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.example.myresume.domain.models.PastJobData transform(@org.jetbrains.annotations.NotNull()
        com.example.data.models.WorkExperience value) {
            return null;
        }
        
        public PastJobsMapper() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0016\u00a8\u0006\u0007"}, d2 = {"Lcom/example/data/mappers/ResumeDataMapper$SkillsMapper;", "Lcom/example/data/mappers/Map;", "Lcom/example/data/models/Skills;", "Lcom/example/myresume/domain/models/SkillsData;", "()V", "transform", "value", "data_debug"})
    public static final class SkillsMapper extends com.example.data.mappers.Map<com.example.data.models.Skills, com.example.myresume.domain.models.SkillsData> {
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.example.myresume.domain.models.SkillsData transform(@org.jetbrains.annotations.NotNull()
        com.example.data.models.Skills value) {
            return null;
        }
        
        public SkillsMapper() {
            super();
        }
    }
}