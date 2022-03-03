package ir.beigirad.dagger;

import dagger.internal.DaggerGenerated;
import ir.beigirad.dagger.util.Context;
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
public final class AssistedObject_Factory {
  private final Provider<Logger> loggerProvider;

  private final Provider<Context> contextProvider;

  public AssistedObject_Factory(Provider<Logger> loggerProvider,
      Provider<Context> contextProvider) {
    this.loggerProvider = loggerProvider;
    this.contextProvider = contextProvider;
  }

  public AssistedObject get(int id) {
    return newInstance(loggerProvider.get(), contextProvider.get(), id);
  }

  public static AssistedObject_Factory create(Provider<Logger> loggerProvider,
      Provider<Context> contextProvider) {
    return new AssistedObject_Factory(loggerProvider, contextProvider);
  }

  public static AssistedObject newInstance(Logger logger, Context context, int id) {
    return new AssistedObject(logger, context, id);
  }
}
