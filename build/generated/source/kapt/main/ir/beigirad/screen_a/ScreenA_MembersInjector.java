package ir.beigirad.screen_a;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import ir.beigirad.logger.Logger;
import javax.annotation.Generated;
import javax.inject.Provider;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ScreenA_MembersInjector implements MembersInjector<ScreenA> {
  private final Provider<RelatedAObject> relatedObjectProvider;

  private final Provider<Logger> loggerProvider;

  public ScreenA_MembersInjector(Provider<RelatedAObject> relatedObjectProvider,
      Provider<Logger> loggerProvider) {
    this.relatedObjectProvider = relatedObjectProvider;
    this.loggerProvider = loggerProvider;
  }

  public static MembersInjector<ScreenA> create(Provider<RelatedAObject> relatedObjectProvider,
      Provider<Logger> loggerProvider) {
    return new ScreenA_MembersInjector(relatedObjectProvider, loggerProvider);
  }

  @Override
  public void injectMembers(ScreenA instance) {
    injectRelatedObject(instance, relatedObjectProvider.get());
    injectLogger(instance, loggerProvider.get());
  }

  @InjectedFieldSignature("ir.beigirad.screen_a.ScreenA.relatedObject")
  public static void injectRelatedObject(ScreenA instance, RelatedAObject relatedObject) {
    instance.relatedObject = relatedObject;
  }

  @InjectedFieldSignature("ir.beigirad.screen_a.ScreenA.logger")
  public static void injectLogger(ScreenA instance, Logger logger) {
    instance.logger = logger;
  }
}
