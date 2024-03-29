package ir.beigirad.dagger;

import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.InstanceFactory;
import dagger.internal.MapBuilder;
import dagger.internal.Preconditions;
import ir.beigirad.dagger.interception.AInterceptor;
import ir.beigirad.dagger.interception.BInterceptor;
import ir.beigirad.dagger.interception.Interceptor;
import ir.beigirad.dagger.module.AppModule;
import ir.beigirad.dagger.module.AppModule_ProvideCapitalizerBFactory;
import ir.beigirad.dagger.module.AppModule_ProvideCapitalizerFactory;
import ir.beigirad.dagger.module.AppModule_ProvideLocaleFactory;
import ir.beigirad.dagger.module.OsInfoModule;
import ir.beigirad.dagger.module.OsInfoModule_ProvideLibrariesPathFactory;
import ir.beigirad.dagger.util.Context;
import ir.beigirad.logger.Logger;
import ir.beigirad.logger.LoggerComponent;
import ir.beigirad.screen_a.ScreenA;
import ir.beigirad.screen_a.ScreenAModule;
import ir.beigirad.screen_a.ScreenAModule_ProvideInfoFactory;
import ir.beigirad.screen_a.ScreenASubcomponent;
import ir.beigirad.screen_a.ScreenA_MembersInjector;
import java.util.Locale;
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
public final class DaggerAppComponent {
  private DaggerAppComponent() {
  }

  public static AppComponent.Factory factory() {
    return new Factory();
  }

  private static final class Factory implements AppComponent.Factory {
    @Override
    public AppComponent create(Context context, OsInfoModule os, LoggerComponent loggerComponent) {
      Preconditions.checkNotNull(context);
      Preconditions.checkNotNull(os);
      Preconditions.checkNotNull(loggerComponent);
      return new AppComponentImpl(new AppModule(), os, loggerComponent, context);
    }
  }

  private static final class ScreenASubcomponentBuilder implements ScreenASubcomponent.Builder {
    private final AppComponentImpl appComponentImpl;

    private ScreenAModule screenAModule;

    private ScreenASubcomponentBuilder(AppComponentImpl appComponentImpl) {
      this.appComponentImpl = appComponentImpl;
    }

    @Override
    public ScreenASubcomponentBuilder module(ScreenAModule screenAModule) {
      this.screenAModule = Preconditions.checkNotNull(screenAModule);
      return this;
    }

    @Override
    public ScreenASubcomponent build() {
      Preconditions.checkBuilderRequirement(screenAModule, ScreenAModule.class);
      return new ScreenASubcomponentImpl(appComponentImpl, screenAModule);
    }
  }

  private static final class ScreenASubcomponentImpl implements ScreenASubcomponent {
    private final ScreenAModule screenAModule;

    private final AppComponentImpl appComponentImpl;

    private final ScreenASubcomponentImpl screenASubcomponentImpl = this;

    private ScreenASubcomponentImpl(AppComponentImpl appComponentImpl,
        ScreenAModule screenAModuleParam) {
      this.appComponentImpl = appComponentImpl;
      this.screenAModule = screenAModuleParam;

    }

    @Override
    public void inject(ScreenA screenA) {
      injectScreenA(screenA);
    }

    private ScreenA injectScreenA(ScreenA instance) {
      ScreenA_MembersInjector.injectRelatedObject(instance, ScreenAModule_ProvideInfoFactory.provideInfo(screenAModule));
      ScreenA_MembersInjector.injectLogger(instance, Preconditions.checkNotNullFromComponent(appComponentImpl.loggerComponent.exposeLogger()));
      return instance;
    }
  }

  private static final class AppComponentImpl implements AppComponent {
    private final OsInfoModule osInfoModule;

    private final LoggerComponent loggerComponent;

    private final AppComponentImpl appComponentImpl = this;

    private Provider<Context> contextProvider;

    private Provider<Locale> provideLocaleProvider;

    private Provider<Capitalizer> provideCapitalizerProvider;

    private Provider<RepositoryImpl> repositoryImplProvider;

    private Provider<Capitalizer> provideCapitalizerBProvider;

    private Provider<Logger> exposeLoggerProvider;

    private AssistedObject_Factory assistedObjectProvider;

    private Provider<AssistedObject.Factory> factoryProvider;

    private AppComponentImpl(AppModule appModuleParam, OsInfoModule osInfoModuleParam,
        LoggerComponent loggerComponentParam, Context contextParam) {
      this.osInfoModule = osInfoModuleParam;
      this.loggerComponent = loggerComponentParam;
      initialize(appModuleParam, osInfoModuleParam, loggerComponentParam, contextParam);

    }

    private Map<String, Interceptor> mapOfStringAndInterceptor() {
      return MapBuilder.<String, Interceptor>newMapBuilder(2).put("I_A", new AInterceptor()).put("I_B", new BInterceptor()).build();
    }

    @SuppressWarnings("unchecked")
    private void initialize(final AppModule appModuleParam, final OsInfoModule osInfoModuleParam,
        final LoggerComponent loggerComponentParam, final Context contextParam) {
      this.contextProvider = InstanceFactory.create(contextParam);
      this.provideLocaleProvider = AppModule_ProvideLocaleFactory.create(appModuleParam);
      this.provideCapitalizerProvider = AppModule_ProvideCapitalizerFactory.create(appModuleParam, provideLocaleProvider);
      this.repositoryImplProvider = DoubleCheck.provider(RepositoryImpl_Factory.create(contextProvider, provideCapitalizerProvider));
      this.provideCapitalizerBProvider = AppModule_ProvideCapitalizerBFactory.create(appModuleParam, provideLocaleProvider);
      this.exposeLoggerProvider = new ExposeLoggerProvider(loggerComponentParam);
      this.assistedObjectProvider = AssistedObject_Factory.create(exposeLoggerProvider, contextProvider);
      this.factoryProvider = AssistedObject_Factory_Impl.create(assistedObjectProvider);
    }

    @Override
    public void inject(MyApplication app) {
      injectMyApplication(app);
    }

    @Override
    public ScreenASubcomponent.Builder screenAComponent() {
      return new ScreenASubcomponentBuilder(appComponentImpl);
    }

    private MyApplication injectMyApplication(MyApplication instance) {
      MyApplication_MembersInjector.injectRepository(instance, repositoryImplProvider.get());
      MyApplication_MembersInjector.injectOsInfo(instance, OsInfoModule_ProvideLibrariesPathFactory.provideLibrariesPath(osInfoModule));
      MyApplication_MembersInjector.injectCapitalizer(instance, DoubleCheck.lazy(provideCapitalizerBProvider));
      MyApplication_MembersInjector.injectLogger(instance, Preconditions.checkNotNullFromComponent(loggerComponent.exposeLogger()));
      MyApplication_MembersInjector.injectInterceptors(instance, mapOfStringAndInterceptor());
      MyApplication_MembersInjector.injectAssistedObjectFactory(instance, factoryProvider.get());
      return instance;
    }

    private static final class ExposeLoggerProvider implements Provider<Logger> {
      private final LoggerComponent loggerComponent;

      ExposeLoggerProvider(LoggerComponent loggerComponent) {
        this.loggerComponent = loggerComponent;
      }

      @Override
      public Logger get() {
        return Preconditions.checkNotNullFromComponent(loggerComponent.exposeLogger());
      }
    }
  }
}
