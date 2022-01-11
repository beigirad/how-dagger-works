package ir.beigirad.dagger.module;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import ir.beigirad.dagger.Capitalizer;
import java.util.Locale;
import javax.annotation.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata("ir.beigirad.dagger.qualifier.TypeB")
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideCapitalizerBFactory implements Factory<Capitalizer> {
  private final AppModule module;

  private final Provider<Locale> localeProvider;

  public AppModule_ProvideCapitalizerBFactory(AppModule module, Provider<Locale> localeProvider) {
    this.module = module;
    this.localeProvider = localeProvider;
  }

  @Override
  public Capitalizer get() {
    return provideCapitalizerB(module, localeProvider.get());
  }

  public static AppModule_ProvideCapitalizerBFactory create(AppModule module,
      Provider<Locale> localeProvider) {
    return new AppModule_ProvideCapitalizerBFactory(module, localeProvider);
  }

  public static Capitalizer provideCapitalizerB(AppModule instance, Locale locale) {
    return Preconditions.checkNotNullFromProvides(instance.provideCapitalizerB(locale));
  }
}
