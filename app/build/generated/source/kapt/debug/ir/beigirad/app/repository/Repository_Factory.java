package ir.beigirad.app.repository;

import androidx.fragment.app.Fragment;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
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
public final class Repository_Factory implements Factory<Repository> {
  private final Provider<Fragment> fragmentProvider;

  public Repository_Factory(Provider<Fragment> fragmentProvider) {
    this.fragmentProvider = fragmentProvider;
  }

  @Override
  public Repository get() {
    return newInstance(fragmentProvider.get());
  }

  public static Repository_Factory create(Provider<Fragment> fragmentProvider) {
    return new Repository_Factory(fragmentProvider);
  }

  public static Repository newInstance(Fragment fragment) {
    return new Repository(fragment);
  }
}
