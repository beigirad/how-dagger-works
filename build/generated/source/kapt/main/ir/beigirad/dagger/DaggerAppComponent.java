package ir.beigirad.dagger;

import dagger.internal.DaggerGenerated;
import dagger.internal.Preconditions;
import ir.beigirad.dagger.module.AppModule;
import ir.beigirad.dagger.module.AppModule_ProvideCapitalizerFactory;
import ir.beigirad.dagger.module.AppModule_ProvideLocaleFactory;
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
  private final AppModule appModule;

  private final DaggerAppComponent appComponent = this;

  private DaggerAppComponent(AppModule appModuleParam) {
    this.appModule = appModuleParam;

  }

  public static Builder builder() {
    return new Builder();
  }

  public static AppComponent create() {
    return new Builder().build();
  }

  private Capitalizer capitalizer() {
    return AppModule_ProvideCapitalizerFactory.provideCapitalizer(appModule, AppModule_ProvideLocaleFactory.provideLocale(appModule));
  }

  private Repository repository() {
    return new Repository(capitalizer());
  }

  @Override
  public void inject(MyApplication app) {
    injectMyApplication(app);
  }

  private MyApplication injectMyApplication(MyApplication instance) {
    MyApplication_MembersInjector.injectRepository(instance, repository());
    return instance;
  }

  public static final class Builder {
    private AppModule appModule;

    private Builder() {
    }

    public Builder appModule(AppModule appModule) {
      this.appModule = Preconditions.checkNotNull(appModule);
      return this;
    }

    public AppComponent build() {
      if (appModule == null) {
        this.appModule = new AppModule();
      }
      return new DaggerAppComponent(appModule);
    }
  }
}
