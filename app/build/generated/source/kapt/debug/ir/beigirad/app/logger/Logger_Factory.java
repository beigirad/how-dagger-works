package ir.beigirad.app.logger;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class Logger_Factory implements Factory<Logger> {
  private final Provider<Context> contextProvider;

  public Logger_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public Logger get() {
    return newInstance(contextProvider.get());
  }

  public static Logger_Factory create(Provider<Context> contextProvider) {
    return new Logger_Factory(contextProvider);
  }

  public static Logger newInstance(Context context) {
    return new Logger(context);
  }
}
