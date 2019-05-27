package com.example.myresume;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/example/myresume/MockAppModule;", "", "()V", "providesResumeRepository", "Lcom/example/myresume/domain/repository/ResumeRepository;", "providesStringResolver", "Lcom/example/myresume/domain/resolver/StringsResolver;", "app_debug"})
@dagger.Module()
public final class MockAppModule {
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.example.myresume.domain.resolver.StringsResolver providesStringResolver() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.example.myresume.domain.repository.ResumeRepository providesResumeRepository() {
        return null;
    }
    
    public MockAppModule() {
        super();
    }
}