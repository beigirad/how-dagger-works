package ir.beigirad.dagger.module;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import ir.beigirad.dagger.Capitalizer;
import javax.annotation.Generated;

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
public final class AppModule_ProvideCapitalizerFactory implements Factory<Capitalizer> {
  private final AppModule module;

  public AppModule_ProvideCapitalizerFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public Capitalizer get() {
    return provideCapitalizer(module);
  }

  public static AppModule_ProvideCapitalizerFactory create(AppModule module) {
    return new AppModule_ProvideCapitalizerFactory(module);
  }

  public static Capitalizer provideCapitalizer(AppModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideCapitalizer());
  }
}
