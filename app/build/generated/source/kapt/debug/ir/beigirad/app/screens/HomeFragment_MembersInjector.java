package ir.beigirad.app.screens;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import ir.beigirad.app.logger.Logger;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class HomeFragment_MembersInjector implements MembersInjector<HomeFragment> {
  private final Provider<Logger> loggerProvider;

  public HomeFragment_MembersInjector(Provider<Logger> loggerProvider) {
    this.loggerProvider = loggerProvider;
  }

  public static MembersInjector<HomeFragment> create(Provider<Logger> loggerProvider) {
    return new HomeFragment_MembersInjector(loggerProvider);
  }

  @Override
  public void injectMembers(HomeFragment instance) {
    injectLogger(instance, loggerProvider.get());
  }

  @InjectedFieldSignature("ir.beigirad.app.screens.HomeFragment.logger")
  public static void injectLogger(HomeFragment instance, Logger logger) {
    instance.logger = logger;
  }
}
