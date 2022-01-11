package ir.beigirad.dagger;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.Generated;
import javax.inject.Provider;

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
public final class MyApplication_MembersInjector implements MembersInjector<MyApplication> {
  private final Provider<Repository> repositoryProvider;

  public MyApplication_MembersInjector(Provider<Repository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  public static MembersInjector<MyApplication> create(Provider<Repository> repositoryProvider) {
    return new MyApplication_MembersInjector(repositoryProvider);
  }

  @Override
  public void injectMembers(MyApplication instance) {
    injectRepository(instance, repositoryProvider.get());
  }

  @InjectedFieldSignature("ir.beigirad.dagger.MyApplication.repository")
  public static void injectRepository(MyApplication instance, Repository repository) {
    instance.repository = repository;
  }
}
