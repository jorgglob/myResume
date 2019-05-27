// Generated by Dagger (https://google.github.io/dagger).
package com.example.data.di;

import com.example.data.services.ResumeApiServices;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import retrofit2.Retrofit;

public final class ApiModule_ProvidesResumeApiServiceFactory implements Factory<ResumeApiServices> {
  private final ApiModule module;

  private final Provider<Retrofit> retrofitProvider;

  public ApiModule_ProvidesResumeApiServiceFactory(
      ApiModule module, Provider<Retrofit> retrofitProvider) {
    this.module = module;
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public ResumeApiServices get() {
    return provideInstance(module, retrofitProvider);
  }

  public static ResumeApiServices provideInstance(
      ApiModule module, Provider<Retrofit> retrofitProvider) {
    return proxyProvidesResumeApiService(module, retrofitProvider.get());
  }

  public static ApiModule_ProvidesResumeApiServiceFactory create(
      ApiModule module, Provider<Retrofit> retrofitProvider) {
    return new ApiModule_ProvidesResumeApiServiceFactory(module, retrofitProvider);
  }

  public static ResumeApiServices proxyProvidesResumeApiService(
      ApiModule instance, Retrofit retrofit) {
    return Preconditions.checkNotNull(
        instance.providesResumeApiService(retrofit),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}