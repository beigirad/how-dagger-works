package ir.beigirad.dagger;

import dagger.internal.DaggerGenerated;
import dagger.internal.Preconditions;
import ir.beigirad.dagger.module.AppModule;
import ir.beigirad.dagger.module.AppModule_ProvideCapitalizerFactory;
import ir.beigirad.dagger.module.AppModule_ProvideLocaleFactory;
import ir.beigirad.dagger.module.OsInfoModule;
import ir.beigirad.dagger.module.OsInfoModule_ProvideLibrariesPathFactory;
import ir.beigirad.dagger.util.Context;
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
public final class DaggerAppComponent implements AppComponent {
  private final Context context;

  private final AppModule appModule;

  private final OsInfoModule osInfoModule;

  private final DaggerAppComponent appComponent = this;

  private DaggerAppComponent(AppModule appModuleParam, OsInfoModule osInfoModuleParam,
      Context contextParam) {
    this.context = contextParam;
    this.appModule = appModuleParam;
    this.osInfoModule = osInfoModuleParam;

  }

  public static AppComponent.Factory factory() {
    return new Factory();
  }

  private Capitalizer capitalizer() {
    return AppModule_ProvideCapitalizerFactory.provideCapitalizer(appModule, AppModule_ProvideLocaleFactory.provideLocale(appModule));
  }

  private RepositoryImpl repositoryImpl() {
    return new RepositoryImpl(context, capitalizer());
  }

  @Override
  public void inject(MyApplication app) {
    injectMyApplication(app);
  }

  private MyApplication injectMyApplication(MyApplication instance) {
    MyApplication_MembersInjector.injectRepository(instance, repositoryImpl());
    MyApplication_MembersInjector.injectOsInfo(instance, OsInfoModule_ProvideLibrariesPathFactory.provideLibrariesPath(osInfoModule));
    return instance;
  }

  private static final class Factory implements AppComponent.Factory {
    @Override
    public AppComponent create(Context context, OsInfoModule os) {
      Preconditions.checkNotNull(context);
      Preconditions.checkNotNull(os);
      return new DaggerAppComponent(new AppModule(), os, context);
    }
  }
}
