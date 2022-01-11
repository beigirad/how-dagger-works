package ir.beigirad.dagger;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import ir.beigirad.dagger.qualifier.TypeB;
import ir.beigirad.dagger.util.OsInfo;
import ir.beigirad.logger.Logger;
import javax.annotation.Generated;
import javax.inject.Provider;

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
public final class MyApplication_MembersInjector implements MembersInjector<MyApplication> {
  private final Provider<Repository> repositoryProvider;

  private final Provider<OsInfo> osInfoProvider;

  private final Provider<Capitalizer> capitalizerProvider;

  private final Provider<Logger> loggerProvider;

  public MyApplication_MembersInjector(Provider<Repository> repositoryProvider,
      Provider<OsInfo> osInfoProvider, Provider<Capitalizer> capitalizerProvider,
      Provider<Logger> loggerProvider) {
    this.repositoryProvider = repositoryProvider;
    this.osInfoProvider = osInfoProvider;
    this.capitalizerProvider = capitalizerProvider;
    this.loggerProvider = loggerProvider;
  }

  public static MembersInjector<MyApplication> create(Provider<Repository> repositoryProvider,
      Provider<OsInfo> osInfoProvider, Provider<Capitalizer> capitalizerProvider,
      Provider<Logger> loggerProvider) {
    return new MyApplication_MembersInjector(repositoryProvider, osInfoProvider, capitalizerProvider, loggerProvider);
  }

  @Override
  public void injectMembers(MyApplication instance) {
    injectRepository(instance, repositoryProvider.get());
    injectOsInfo(instance, osInfoProvider.get());
    injectCapitalizer(instance, capitalizerProvider.get());
    injectLogger(instance, loggerProvider.get());
  }

  @InjectedFieldSignature("ir.beigirad.dagger.MyApplication.repository")
  public static void injectRepository(MyApplication instance, Repository repository) {
    instance.repository = repository;
  }

  @InjectedFieldSignature("ir.beigirad.dagger.MyApplication.osInfo")
  public static void injectOsInfo(MyApplication instance, OsInfo osInfo) {
    instance.osInfo = osInfo;
  }

  @InjectedFieldSignature("ir.beigirad.dagger.MyApplication.capitalizer")
  @TypeB
  public static void injectCapitalizer(MyApplication instance, Capitalizer capitalizer) {
    instance.capitalizer = capitalizer;
  }

  @InjectedFieldSignature("ir.beigirad.dagger.MyApplication.logger")
  public static void injectLogger(MyApplication instance, Logger logger) {
    instance.logger = logger;
  }
}
