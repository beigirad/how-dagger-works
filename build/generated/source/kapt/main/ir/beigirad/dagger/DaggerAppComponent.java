package ir.beigirad.dagger;

import dagger.internal.DaggerGenerated;
import dagger.internal.Preconditions;
import ir.beigirad.dagger.module.AppModule;
import ir.beigirad.dagger.module.AppModule_ProvideCapitalizerFactory;
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

  public static AppComponent create() {
    return new Builder().build();
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
      return new AppComponentImpl(appModule);
    }
  }

  private static final class AppComponentImpl implements AppComponent {
    private final AppModule appModule;

    private final AppComponentImpl appComponentImpl = this;

    private AppComponentImpl(AppModule appModuleParam) {
      this.appModule = appModuleParam;

    }

    private Repository repository() {
      return new Repository(AppModule_ProvideCapitalizerFactory.provideCapitalizer(appModule));
    }

    @Override
    public void inject(MyApplication app) {
      injectMyApplication(app);
    }

    private MyApplication injectMyApplication(MyApplication instance) {
      MyApplication_MembersInjector.injectRepository(instance, repository());
      return instance;
    }
  }
}
