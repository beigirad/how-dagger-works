package ir.beigirad.app;

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
public final class MainActivity_MembersInjector implements MembersInjector<MainActivity> {
  private final Provider<Logger> loggerProvider;

  public MainActivity_MembersInjector(Provider<Logger> loggerProvider) {
    this.loggerProvider = loggerProvider;
  }

  public static MembersInjector<MainActivity> create(Provider<Logger> loggerProvider) {
    return new MainActivity_MembersInjector(loggerProvider);
  }

  @Override
  public void injectMembers(MainActivity instance) {
    injectLogger(instance, loggerProvider.get());
  }

  @InjectedFieldSignature("ir.beigirad.app.MainActivity.logger")
  public static void injectLogger(MainActivity instance, Logger logger) {
    instance.logger = logger;
  }
}
