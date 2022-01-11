package ir.beigirad.dagger;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
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
public final class RepositoryImpl_Factory implements Factory<RepositoryImpl> {
  private final Provider<Capitalizer> capitalizerProvider;

  public RepositoryImpl_Factory(Provider<Capitalizer> capitalizerProvider) {
    this.capitalizerProvider = capitalizerProvider;
  }

  @Override
  public RepositoryImpl get() {
    return newInstance(capitalizerProvider.get());
  }

  public static RepositoryImpl_Factory create(Provider<Capitalizer> capitalizerProvider) {
    return new RepositoryImpl_Factory(capitalizerProvider);
  }

  public static RepositoryImpl newInstance(Capitalizer capitalizer) {
    return new RepositoryImpl(capitalizer);
  }
}
