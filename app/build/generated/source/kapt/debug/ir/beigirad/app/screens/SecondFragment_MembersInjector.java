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
public final class SecondFragment_MembersInjector implements MembersInjector<SecondFragment> {
  private final Provider<Logger> loggerProvider;

  public SecondFragment_MembersInjector(Provider<Logger> loggerProvider) {
    this.loggerProvider = loggerProvider;
  }

  public static MembersInjector<SecondFragment> create(Provider<Logger> loggerProvider) {
    return new SecondFragment_MembersInjector(loggerProvider);
  }

  @Override
  public void injectMembers(SecondFragment instance) {
    injectLogger(instance, loggerProvider.get());
  }

  @InjectedFieldSignature("ir.beigirad.app.screens.SecondFragment.logger")
  public static void injectLogger(SecondFragment instance, Logger logger) {
    instance.logger = logger;
  }
}
