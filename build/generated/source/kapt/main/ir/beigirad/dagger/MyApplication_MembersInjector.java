package ir.beigirad.dagger;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import ir.beigirad.dagger.interception.Interceptor;
import ir.beigirad.dagger.qualifier.TypeB;
import ir.beigirad.dagger.util.OsInfo;
import ir.beigirad.logger.Logger;
import java.util.Map;
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
public final class MyApplication_MembersInjector implements MembersInjector<MyApplication> {
  private final Provider<Repository> repositoryProvider;

  private final Provider<OsInfo> osInfoProvider;

  private final Provider<Capitalizer> capitalizerProvider;

  private final Provider<Logger> loggerProvider;

  private final Provider<Map<String, Interceptor>> interceptorsProvider;

  public MyApplication_MembersInjector(Provider<Repository> repositoryProvider,
      Provider<OsInfo> osInfoProvider, Provider<Capitalizer> capitalizerProvider,
      Provider<Logger> loggerProvider, Provider<Map<String, Interceptor>> interceptorsProvider) {
    this.repositoryProvider = repositoryProvider;
    this.osInfoProvider = osInfoProvider;
    this.capitalizerProvider = capitalizerProvider;
    this.loggerProvider = loggerProvider;
    this.interceptorsProvider = interceptorsProvider;
  }

  public static MembersInjector<MyApplication> create(Provider<Repository> repositoryProvider,
      Provider<OsInfo> osInfoProvider, Provider<Capitalizer> capitalizerProvider,
      Provider<Logger> loggerProvider, Provider<Map<String, Interceptor>> interceptorsProvider) {
    return new MyApplication_MembersInjector(repositoryProvider, osInfoProvider, capitalizerProvider, loggerProvider, interceptorsProvider);
  }

  @Override
  public void injectMembers(MyApplication instance) {
    injectRepository(instance, repositoryProvider.get());
    injectOsInfo(instance, osInfoProvider.get());
    injectCapitalizer(instance, capitalizerProvider);
    injectLogger(instance, loggerProvider.get());
    injectInterceptors(instance, interceptorsProvider.get());
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
  public static void injectCapitalizer(MyApplication instance, Provider<Capitalizer> capitalizer) {
    instance.capitalizer = capitalizer;
  }

  @InjectedFieldSignature("ir.beigirad.dagger.MyApplication.logger")
  public static void injectLogger(MyApplication instance, Logger logger) {
    instance.logger = logger;
  }

  @InjectedFieldSignature("ir.beigirad.dagger.MyApplication.interceptors")
  public static void injectInterceptors(MyApplication instance,
      Map<String, Interceptor> interceptors) {
    instance.interceptors = interceptors;
  }
}
