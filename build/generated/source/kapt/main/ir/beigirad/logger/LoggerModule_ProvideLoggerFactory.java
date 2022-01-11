package ir.beigirad.logger;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import ir.beigirad.dagger.util.Context;
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
public final class LoggerModule_ProvideLoggerFactory implements Factory<Logger> {
  private final LoggerModule module;

  private final Provider<Context> contextProvider;

  public LoggerModule_ProvideLoggerFactory(LoggerModule module, Provider<Context> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public Logger get() {
    return provideLogger(module, contextProvider.get());
  }

  public static LoggerModule_ProvideLoggerFactory create(LoggerModule module,
      Provider<Context> contextProvider) {
    return new LoggerModule_ProvideLoggerFactory(module, contextProvider);
  }

  public static Logger provideLogger(LoggerModule instance, Context context) {
    return Preconditions.checkNotNullFromProvides(instance.provideLogger(context));
  }
}
