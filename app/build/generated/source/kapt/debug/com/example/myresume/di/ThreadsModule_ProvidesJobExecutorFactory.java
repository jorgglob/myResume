// Generated by Dagger (https://google.github.io/dagger).
package com.example.myresume.di;

import com.example.myresume.domain.executor.BackgroundExecutor;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class ThreadsModule_ProvidesJobExecutorFactory implements Factory<BackgroundExecutor> {
  private final ThreadsModule module;

  public ThreadsModule_ProvidesJobExecutorFactory(ThreadsModule module) {
    this.module = module;
  }

  @Override
  public BackgroundExecutor get() {
    return provideInstance(module);
  }

  public static BackgroundExecutor provideInstance(ThreadsModule module) {
    return proxyProvidesJobExecutor(module);
  }

  public static ThreadsModule_ProvidesJobExecutorFactory create(ThreadsModule module) {
    return new ThreadsModule_ProvidesJobExecutorFactory(module);
  }

  public static BackgroundExecutor proxyProvidesJobExecutor(ThreadsModule instance) {
    return Preconditions.checkNotNull(
        instance.providesJobExecutor(), "Cannot return null from a non-@Nullable @Provides method");
  }
}