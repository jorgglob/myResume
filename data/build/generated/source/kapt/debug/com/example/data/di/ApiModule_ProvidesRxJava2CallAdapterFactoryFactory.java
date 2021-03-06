// Generated by Dagger (https://google.github.io/dagger).
package com.example.data.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

public final class ApiModule_ProvidesRxJava2CallAdapterFactoryFactory
    implements Factory<RxJava2CallAdapterFactory> {
  private final ApiModule module;

  public ApiModule_ProvidesRxJava2CallAdapterFactoryFactory(ApiModule module) {
    this.module = module;
  }

  @Override
  public RxJava2CallAdapterFactory get() {
    return provideInstance(module);
  }

  public static RxJava2CallAdapterFactory provideInstance(ApiModule module) {
    return proxyProvidesRxJava2CallAdapterFactory(module);
  }

  public static ApiModule_ProvidesRxJava2CallAdapterFactoryFactory create(ApiModule module) {
    return new ApiModule_ProvidesRxJava2CallAdapterFactoryFactory(module);
  }

  public static RxJava2CallAdapterFactory proxyProvidesRxJava2CallAdapterFactory(
      ApiModule instance) {
    return Preconditions.checkNotNull(
        instance.providesRxJava2CallAdapterFactory(),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
