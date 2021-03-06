// Generated by Dagger (https://google.github.io/dagger).
package com.example.myresume.domain.interactors;

import com.example.myresume.domain.executor.BackgroundExecutor;
import com.example.myresume.domain.executor.UiThreadExecutor;
import com.example.myresume.domain.repository.ResumeRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class GetResumeInteractor_Factory implements Factory<GetResumeInteractor> {
  private final Provider<ResumeRepository> arg0Provider;

  private final Provider<BackgroundExecutor> arg1Provider;

  private final Provider<UiThreadExecutor> arg2Provider;

  public GetResumeInteractor_Factory(
      Provider<ResumeRepository> arg0Provider,
      Provider<BackgroundExecutor> arg1Provider,
      Provider<UiThreadExecutor> arg2Provider) {
    this.arg0Provider = arg0Provider;
    this.arg1Provider = arg1Provider;
    this.arg2Provider = arg2Provider;
  }

  @Override
  public GetResumeInteractor get() {
    return provideInstance(arg0Provider, arg1Provider, arg2Provider);
  }

  public static GetResumeInteractor provideInstance(
      Provider<ResumeRepository> arg0Provider,
      Provider<BackgroundExecutor> arg1Provider,
      Provider<UiThreadExecutor> arg2Provider) {
    return new GetResumeInteractor(arg0Provider.get(), arg1Provider.get(), arg2Provider.get());
  }

  public static GetResumeInteractor_Factory create(
      Provider<ResumeRepository> arg0Provider,
      Provider<BackgroundExecutor> arg1Provider,
      Provider<UiThreadExecutor> arg2Provider) {
    return new GetResumeInteractor_Factory(arg0Provider, arg1Provider, arg2Provider);
  }

  public static GetResumeInteractor newGetResumeInteractor(
      ResumeRepository arg0, BackgroundExecutor arg1, UiThreadExecutor arg2) {
    return new GetResumeInteractor(arg0, arg1, arg2);
  }
}
