package ir.beigirad.app.viewmodel;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import ir.beigirad.app.logger.Logger;
import javax.annotation.processing.Generated;
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
public final class HomeViewModel_Factory implements Factory<HomeViewModel> {
  private final Provider<Logger> loggerProvider;

  public HomeViewModel_Factory(Provider<Logger> loggerProvider) {
    this.loggerProvider = loggerProvider;
  }

  @Override
  public HomeViewModel get() {
    return newInstance(loggerProvider.get());
  }

  public static HomeViewModel_Factory create(Provider<Logger> loggerProvider) {
    return new HomeViewModel_Factory(loggerProvider);
  }

  public static HomeViewModel newInstance(Logger logger) {
    return new HomeViewModel(logger);
  }
}
