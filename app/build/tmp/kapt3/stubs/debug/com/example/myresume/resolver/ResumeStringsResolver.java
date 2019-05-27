package com.example.myresume.resolver;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\u001c\u0010\t\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/example/myresume/resolver/ResumeStringsResolver;", "Lcom/example/myresume/domain/resolver/StringsResolver;", "resources", "Landroid/content/res/Resources;", "(Landroid/content/res/Resources;)V", "getSkillsHeader", "", "getTimeOutExceededString", "getUnknownExceptionString", "getWorkPeriodFormat", "startDate", "endDate", "Companion", "app_debug"})
public final class ResumeStringsResolver implements com.example.myresume.domain.resolver.StringsResolver {
    private final android.content.res.Resources resources = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EMPTY_STRING = "";
    public static final com.example.myresume.resolver.ResumeStringsResolver.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getWorkPeriodFormat(@org.jetbrains.annotations.Nullable()
    java.lang.String startDate, @org.jetbrains.annotations.Nullable()
    java.lang.String endDate) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getTimeOutExceededString() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getUnknownExceptionString() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getSkillsHeader() {
        return null;
    }
    
    public ResumeStringsResolver(@org.jetbrains.annotations.NotNull()
    android.content.res.Resources resources) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/myresume/resolver/ResumeStringsResolver$Companion;", "", "()V", "EMPTY_STRING", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}