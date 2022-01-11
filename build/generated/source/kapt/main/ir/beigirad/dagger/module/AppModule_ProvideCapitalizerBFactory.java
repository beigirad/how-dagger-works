package ir.beigirad.dagger.module;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import ir.beigirad.dagger.Capitalizer;
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
public final class AppModule_ProvideCapitalizerBFactory implements Factory<Capitalizer> {
  private final AppModule module;

  public AppModule_ProvideCapitalizerBFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public Capitalizer get() {
    return provideCapitalizerB(module);
  }

  public static AppModule_ProvideCapitalizerBFactory create(AppModule module) {
    return new AppModule_ProvideCapitalizerBFactory(module);
  }

  public static Capitalizer provideCapitalizerB(AppModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideCapitalizerB());
  }
}
