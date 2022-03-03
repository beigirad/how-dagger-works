package ir.beigirad.dagger;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import ir.beigirad.dagger.util.Context;
import ir.beigirad.logger.Logger;
import javax.annotation.Generated;
import javax.inject.Provider;

@ScopeMetadata
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
public final class AssistedObject_Factory implements Factory<AssistedObject> {
  private final Provider<Logger> loggerProvider;

  private final Provider<Context> contextProvider;

  public AssistedObject_Factory(Provider<Logger> loggerProvider,
      Provider<Context> contextProvider) {
    this.loggerProvider = loggerProvider;
    this.contextProvider = contextProvider;
  }

  @Override
  public AssistedObject get() {
    return newInstance(loggerProvider.get(), contextProvider.get());
  }

  public static AssistedObject_Factory create(Provider<Logger> loggerProvider,
      Provider<Context> contextProvider) {
    return new AssistedObject_Factory(loggerProvider, contextProvider);
  }

  public static AssistedObject newInstance(Logger logger, Context context) {
    return new AssistedObject(logger, context);
  }
}
