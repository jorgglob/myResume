package com.example.myresume.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0003H\u0007J\b\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0003H\u0007J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\tH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/example/myresume/di/AppModule;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "providesAppContext", "providesImageDownloader", "Lcom/example/myresume/services/ImageDownloader;", "providesResources", "Landroid/content/res/Resources;", "providesResumeRepository", "Lcom/example/myresume/domain/repository/ResumeRepository;", "resumeServices", "Lcom/example/data/services/ResumeApiServices;", "cacheDataSource", "Lcom/example/data/local/CacheDataSource;", "providesStringResolver", "Lcom/example/myresume/domain/resolver/StringsResolver;", "resources", "app_debug"})
@dagger.Module()
public final class AppModule {
    private final android.content.Context context = null;
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final android.content.Context providesAppContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.example.myresume.domain.repository.ResumeRepository providesResumeRepository(@org.jetbrains.annotations.NotNull()
    com.example.data.services.ResumeApiServices resumeServices, @org.jetbrains.annotations.NotNull()
    com.example.data.local.CacheDataSource cacheDataSource) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.example.myresume.services.ImageDownloader providesImageDownloader() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final android.content.res.Resources providesResources(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.example.myresume.domain.resolver.StringsResolver providesStringResolver(@org.jetbrains.annotations.NotNull()
    android.content.res.Resources resources) {
        return null;
    }
    
    public AppModule(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}