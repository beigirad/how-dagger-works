package ir.beigirad.dagger;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import ir.beigirad.dagger.util.Context;
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
  private final Provider<Context> contextProvider;

  private final Provider<Capitalizer> capitalizerProvider;

  public RepositoryImpl_Factory(Provider<Context> contextProvider,
      Provider<Capitalizer> capitalizerProvider) {
    this.contextProvider = contextProvider;
    this.capitalizerProvider = capitalizerProvider;
  }

  @Override
  public RepositoryImpl get() {
    return newInstance(contextProvider.get(), capitalizerProvider.get());
  }

  public static RepositoryImpl_Factory create(Provider<Context> contextProvider,
      Provider<Capitalizer> capitalizerProvider) {
    return new RepositoryImpl_Factory(contextProvider, capitalizerProvider);
  }

  public static RepositoryImpl newInstance(Context context, Capitalizer capitalizer) {
    return new RepositoryImpl(context, capitalizer);
  }
}
