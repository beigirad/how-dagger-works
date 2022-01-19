package ir.beigirad.dagger.module;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.util.Locale;
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
public final class AppModule_ProvideLocaleFactory implements Factory<Locale> {
  private final AppModule module;

  public AppModule_ProvideLocaleFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public Locale get() {
    return provideLocale(module);
  }

  public static AppModule_ProvideLocaleFactory create(AppModule module) {
    return new AppModule_ProvideLocaleFactory(module);
  }

  public static Locale provideLocale(AppModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideLocale());
  }
}
