// Generated by Dagger (https://google.github.io/dagger).
package com.example.myresume;

import com.example.myresume.domain.interactors.GetResumeInteractor;
import com.example.myresume.domain.resolver.StringsResolver;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class UtResumeActivity_MembersInjector implements MembersInjector<UtResumeActivity> {
  private final Provider<StringsResolver> stringsResolverProvider;

  private final Provider<GetResumeInteractor> getResumeInteractorProvider;

  public UtResumeActivity_MembersInjector(
      Provider<StringsResolver> stringsResolverProvider,
      Provider<GetResumeInteractor> getResumeInteractorProvider) {
    this.stringsResolverProvider = stringsResolverProvider;
    this.getResumeInteractorProvider = getResumeInteractorProvider;
  }

  public static MembersInjector<UtResumeActivity> create(
      Provider<StringsResolver> stringsResolverProvider,
      Provider<GetResumeInteractor> getResumeInteractorProvider) {
    return new UtResumeActivity_MembersInjector(
        stringsResolverProvider, getResumeInteractorProvider);
  }

  @Override
  public void injectMembers(UtResumeActivity instance) {
    injectStringsResolver(instance, stringsResolverProvider.get());
    injectGetResumeInteractor(instance, getResumeInteractorProvider.get());
  }

  public static void injectStringsResolver(
      UtResumeActivity instance, StringsResolver stringsResolver) {
    instance.stringsResolver = stringsResolver;
  }

  public static void injectGetResumeInteractor(
      UtResumeActivity instance, GetResumeInteractor getResumeInteractor) {
    instance.getResumeInteractor = getResumeInteractor;
  }
}
