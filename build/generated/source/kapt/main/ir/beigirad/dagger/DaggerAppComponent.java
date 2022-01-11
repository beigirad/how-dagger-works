package ir.beigirad.dagger;

import dagger.internal.DaggerGenerated;
import dagger.internal.Preconditions;
import ir.beigirad.dagger.module.AppModule;
import ir.beigirad.dagger.module.AppModule_ProvideCapitalizerFactory;
import ir.beigirad.dagger.module.AppModule_ProvideLocaleFactory;
import ir.beigirad.dagger.module.OsInfoModule;
import ir.beigirad.dagger.module.OsInfoModule_ProvideLibrariesPathFactory;
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
public final class DaggerAppComponent {
  private DaggerAppComponent() {
  }

  public static Builder builder() {
    return new Builder();
  }

  public static final class Builder {
    private AppModule appModule;

    private OsInfoModule osInfoModule;

    private Builder() {
    }

    public Builder appModule(AppModule appModule) {
      this.appModule = Preconditions.checkNotNull(appModule);
      return this;
    }

    public Builder osInfoModule(OsInfoModule osInfoModule) {
      this.osInfoModule = Preconditions.checkNotNull(osInfoModule);
      return this;
    }

    public AppComponent build() {
      if (appModule == null) {
        this.appModule = new AppModule();
      }
      Preconditions.checkBuilderRequirement(osInfoModule, OsInfoModule.class);
      return new AppComponentImpl(appModule, osInfoModule);
    }
  }

  private static final class AppComponentImpl implements AppComponent {
    private final AppModule appModule;

    private final OsInfoModule osInfoModule;

    private final AppComponentImpl appComponentImpl = this;

    private AppComponentImpl(AppModule appModuleParam, OsInfoModule osInfoModuleParam) {
      this.appModule = appModuleParam;
      this.osInfoModule = osInfoModuleParam;

    }

    private Capitalizer capitalizer() {
      return AppModule_ProvideCapitalizerFactory.provideCapitalizer(appModule, AppModule_ProvideLocaleFactory.provideLocale(appModule));
    }

    private RepositoryImpl repositoryImpl() {
      return new RepositoryImpl(capitalizer());
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
  }
}
