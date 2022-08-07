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
public final class MyApplication_MembersInjector implements MembersInjector<MyApplication> {
  private final Provider<Logger> loggerProvider;

  public MyApplication_MembersInjector(Provider<Logger> loggerProvider) {
    this.loggerProvider = loggerProvider;
  }

  public static MembersInjector<MyApplication> create(Provider<Logger> loggerProvider) {
    return new MyApplication_MembersInjector(loggerProvider);
  }

  @Override
  public void injectMembers(MyApplication instance) {
    injectLogger(instance, loggerProvider.get());
  }

  @InjectedFieldSignature("ir.beigirad.app.MyApplication.logger")
  public static void injectLogger(MyApplication instance, Logger logger) {
    instance.logger = logger;
  }
}
