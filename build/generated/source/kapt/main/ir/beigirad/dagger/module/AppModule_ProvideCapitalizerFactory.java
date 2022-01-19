package ir.beigirad.dagger.module;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import ir.beigirad.dagger.Capitalizer;
import java.util.Locale;
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
public final class AppModule_ProvideCapitalizerFactory implements Factory<Capitalizer> {
  private final AppModule module;

  private final Provider<Locale> localeProvider;

  public AppModule_ProvideCapitalizerFactory(AppModule module, Provider<Locale> localeProvider) {
    this.module = module;
    this.localeProvider = localeProvider;
  }

  @Override
  public Capitalizer get() {
    return provideCapitalizer(module, localeProvider.get());
  }

  public static AppModule_ProvideCapitalizerFactory create(AppModule module,
      Provider<Locale> localeProvider) {
    return new AppModule_ProvideCapitalizerFactory(module, localeProvider);
  }

  public static Capitalizer provideCapitalizer(AppModule instance, Locale locale) {
    return Preconditions.checkNotNullFromProvides(instance.provideCapitalizer(locale));
  }
}
