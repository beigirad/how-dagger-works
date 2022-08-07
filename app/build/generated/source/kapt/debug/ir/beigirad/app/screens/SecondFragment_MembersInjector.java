package ir.beigirad.app.screens;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import ir.beigirad.app.logger.Logger;
import ir.beigirad.app.repository.Repository;
import javax.annotation.processing.Generated;
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
public final class SecondFragment_MembersInjector implements MembersInjector<SecondFragment> {
  private final Provider<Logger> loggerProvider;

  private final Provider<Repository> repositoryProvider;

  public SecondFragment_MembersInjector(Provider<Logger> loggerProvider,
      Provider<Repository> repositoryProvider) {
    this.loggerProvider = loggerProvider;
    this.repositoryProvider = repositoryProvider;
  }

  public static MembersInjector<SecondFragment> create(Provider<Logger> loggerProvider,
      Provider<Repository> repositoryProvider) {
    return new SecondFragment_MembersInjector(loggerProvider, repositoryProvider);
  }

  @Override
  public void injectMembers(SecondFragment instance) {
    injectLogger(instance, loggerProvider.get());
    injectRepository(instance, repositoryProvider.get());
  }

  @InjectedFieldSignature("ir.beigirad.app.screens.SecondFragment.logger")
  public static void injectLogger(SecondFragment instance, Logger logger) {
    instance.logger = logger;
  }

  @InjectedFieldSignature("ir.beigirad.app.screens.SecondFragment.repository")
  public static void injectRepository(SecondFragment instance, Repository repository) {
    instance.repository = repository;
  }
}
