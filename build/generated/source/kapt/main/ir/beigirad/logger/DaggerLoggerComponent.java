package ir.beigirad.logger;

import dagger.internal.DaggerGenerated;
import dagger.internal.Preconditions;
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
public final class DaggerLoggerComponent {
  private DaggerLoggerComponent() {
  }

  public static Builder builder() {
    return new Builder();
  }

  public static LoggerComponent create() {
    return new Builder().build();
  }

  public static final class Builder {
    private LoggerModule loggerModule;

    private Builder() {
    }

    public Builder loggerModule(LoggerModule loggerModule) {
      this.loggerModule = Preconditions.checkNotNull(loggerModule);
      return this;
    }

    public LoggerComponent build() {
      if (loggerModule == null) {
        this.loggerModule = new LoggerModule();
      }
      return new LoggerComponentImpl(loggerModule);
    }
  }

  private static final class LoggerComponentImpl implements LoggerComponent {
    private final LoggerModule loggerModule;

    private final LoggerComponentImpl loggerComponentImpl = this;

    private LoggerComponentImpl(LoggerModule loggerModuleParam) {
      this.loggerModule = loggerModuleParam;

    }

    @Override
    public Logger exposeLogger() {
      return LoggerModule_ProvideLoggerFactory.provideLogger(loggerModule);
    }
  }
}
