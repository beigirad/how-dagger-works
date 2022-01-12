package ir.beigirad.screen_a;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
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
public final class ScreenAModule_ProvideInfoFactory implements Factory<RelatedAObject> {
  private final ScreenAModule module;

  public ScreenAModule_ProvideInfoFactory(ScreenAModule module) {
    this.module = module;
  }

  @Override
  public RelatedAObject get() {
    return provideInfo(module);
  }

  public static ScreenAModule_ProvideInfoFactory create(ScreenAModule module) {
    return new ScreenAModule_ProvideInfoFactory(module);
  }

  public static RelatedAObject provideInfo(ScreenAModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideInfo());
  }
}
