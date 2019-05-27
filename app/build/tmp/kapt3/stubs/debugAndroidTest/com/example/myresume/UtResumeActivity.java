package com.example.myresume;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\"\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014J\b\u0010\u0019\u001a\u00020\u001aH\u0007J\b\u0010\u001b\u001a\u00020\u001aH\u0007J\b\u0010\u001c\u001a\u00020\u001aH\u0007J\b\u0010\u001d\u001a\u00020\u001aH\u0007J\b\u0010\u001e\u001a\u00020\u001aH\u0007J\b\u0010\u001f\u001a\u00020\u001aH\u0007R \u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006 "}, d2 = {"Lcom/example/myresume/UtResumeActivity;", "", "()V", "activityRule", "Landroid/support/test/rule/ActivityTestRule;", "Lcom/example/myresume/view/ResumeActivity;", "kotlin.jvm.PlatformType", "getResumeInteractor", "Lcom/example/myresume/domain/interactors/GetResumeInteractor;", "getGetResumeInteractor", "()Lcom/example/myresume/domain/interactors/GetResumeInteractor;", "setGetResumeInteractor", "(Lcom/example/myresume/domain/interactors/GetResumeInteractor;)V", "stringsResolver", "Lcom/example/myresume/domain/resolver/StringsResolver;", "getStringsResolver", "()Lcom/example/myresume/domain/resolver/StringsResolver;", "setStringsResolver", "(Lcom/example/myresume/domain/resolver/StringsResolver;)V", "positionMatcher", "Lorg/hamcrest/Matcher;", "Landroid/view/View;", "position", "", "itemMatcher", "setupForTests", "", "testHeaderHasInformation", "testInfoContainerIsVisible", "testProgressbarGone", "testTextInWorksListElement", "testsVerifyUserName", "app_debug"})
@org.junit.runner.RunWith(value = android.support.test.runner.AndroidJUnit4.class)
public final class UtResumeActivity {
    @org.jetbrains.annotations.NotNull()
    @org.junit.Rule()
    public android.support.test.rule.ActivityTestRule<com.example.myresume.view.ResumeActivity> activityRule;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.example.myresume.domain.resolver.StringsResolver stringsResolver;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.example.myresume.domain.interactors.GetResumeInteractor getResumeInteractor;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.myresume.domain.resolver.StringsResolver getStringsResolver() {
        return null;
    }
    
    public final void setStringsResolver(@org.jetbrains.annotations.NotNull()
    com.example.myresume.domain.resolver.StringsResolver p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.myresume.domain.interactors.GetResumeInteractor getGetResumeInteractor() {
        return null;
    }
    
    public final void setGetResumeInteractor(@org.jetbrains.annotations.NotNull()
    com.example.myresume.domain.interactors.GetResumeInteractor p0) {
    }
    
    @org.junit.Before()
    public final void setupForTests() {
    }
    
    @org.junit.Test()
    public final void testHeaderHasInformation() {
    }
    
    @org.junit.Test()
    public final void testInfoContainerIsVisible() {
    }
    
    @org.junit.Test()
    public final void testTextInWorksListElement() {
    }
    
    @org.junit.Test()
    public final void testsVerifyUserName() {
    }
    
    @org.junit.Test()
    public final void testProgressbarGone() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.hamcrest.Matcher<android.view.View> positionMatcher(int position, @org.jetbrains.annotations.NotNull()
    org.hamcrest.Matcher<android.view.View> itemMatcher) {
        return null;
    }
    
    public UtResumeActivity() {
        super();
    }
}