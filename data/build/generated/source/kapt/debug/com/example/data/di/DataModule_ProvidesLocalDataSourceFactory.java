// Generated by Dagger (https://google.github.io/dagger).
package com.example.data.di;

import com.example.data.local.CacheDataSource;
import com.example.data.local.CacheDatabaseProvider;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class DataModule_ProvidesLocalDataSourceFactory implements Factory<CacheDataSource> {
  private final DataModule module;

  private final Provider<CacheDatabaseProvider> realmProviderCacheProvider;

  public DataModule_ProvidesLocalDataSourceFactory(
      DataModule module, Provider<CacheDatabaseProvider> realmProviderCacheProvider) {
    this.module = module;
    this.realmProviderCacheProvider = realmProviderCacheProvider;
  }

  @Override
  public CacheDataSource get() {
    return provideInstance(module, realmProviderCacheProvider);
  }

  public static CacheDataSource provideInstance(
      DataModule module, Provider<CacheDatabaseProvider> realmProviderCacheProvider) {
    return proxyProvidesLocalDataSource(module, realmProviderCacheProvider.get());
  }

  public static DataModule_ProvidesLocalDataSourceFactory create(
      DataModule module, Provider<CacheDatabaseProvider> realmProviderCacheProvider) {
    return new DataModule_ProvidesLocalDataSourceFactory(module, realmProviderCacheProvider);
  }

  public static CacheDataSource proxyProvidesLocalDataSource(
      DataModule instance, CacheDatabaseProvider realmProviderCache) {
    return Preconditions.checkNotNull(
        instance.providesLocalDataSource(realmProviderCache),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}