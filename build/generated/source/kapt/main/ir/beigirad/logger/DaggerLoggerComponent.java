package ir.beigirad.logger;

import dagger.internal.DaggerGenerated;
import dagger.internal.Preconditions;
import ir.beigirad.dagger.util.Context;
import javax.annotation.Generated;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerLoggerComponent implements LoggerComponent {
  private final LoggerModule loggerModule;

  private final Context context;

  private final DaggerLoggerComponent loggerComponent = this;

  private DaggerLoggerComponent(LoggerModule loggerModuleParam, Context contextParam) {
    this.loggerModule = loggerModuleParam;
    this.context = contextParam;

  }

  public static LoggerComponent.Factory factory() {
    return new Factory();
  }

  @Override
  public Logger exposeLogger() {
    return LoggerModule_ProvideLoggerFactory.provideLogger(loggerModule, context);
  }

  private static final class Factory implements LoggerComponent.Factory {
    @Override
    public LoggerComponent create(Context context) {
      Preconditions.checkNotNull(context);
      return new DaggerLoggerComponent(new LoggerModule(), context);
    }
  }
}
