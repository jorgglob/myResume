package com.example.myresume.presenter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0010\u001a\u00020\u000eH\u0016R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/example/myresume/presenter/ResumePresenter;", "Lcom/example/myresume/presenter/ResumeActivityContract$Presenter;", "genericMethodsView", "Lcom/example/myresume/view/GenericMethodsView;", "resourceManager", "Lcom/example/myresume/domain/resolver/StringsResolver;", "resumeUseCase", "Lcom/example/myresume/domain/interactors/GetResumeInteractor;", "resumeView", "Lcom/example/myresume/presenter/ResumeActivityContract$View;", "(Lcom/example/myresume/view/GenericMethodsView;Lcom/example/myresume/domain/resolver/StringsResolver;Lcom/example/myresume/domain/interactors/GetResumeInteractor;Lcom/example/myresume/presenter/ResumeActivityContract$View;)V", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "disposeSubscriptions", "", "downloadResume", "initView", "app_debug"})
public final class ResumePresenter implements com.example.myresume.presenter.ResumeActivityContract.Presenter {
    private final io.reactivex.disposables.CompositeDisposable disposables = null;
    private final com.example.myresume.view.GenericMethodsView genericMethodsView = null;
    private final com.example.myresume.domain.resolver.StringsResolver resourceManager = null;
    private final com.example.myresume.domain.interactors.GetResumeInteractor resumeUseCase = null;
    private final com.example.myresume.presenter.ResumeActivityContract.View resumeView = null;
    
    @java.lang.Override()
    public void initView() {
    }
    
    @java.lang.Override()
    public void downloadResume() {
    }
    
    @java.lang.Override()
    public void disposeSubscriptions() {
    }
    
    public ResumePresenter(@org.jetbrains.annotations.NotNull()
    com.example.myresume.view.GenericMethodsView genericMethodsView, @org.jetbrains.annotations.NotNull()
    com.example.myresume.domain.resolver.StringsResolver resourceManager, @org.jetbrains.annotations.NotNull()
    com.example.myresume.domain.interactors.GetResumeInteractor resumeUseCase, @org.jetbrains.annotations.NotNull()
    com.example.myresume.presenter.ResumeActivityContract.View resumeView) {
        super();
    }
}