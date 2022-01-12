package ir.beigirad.dagger.interception;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
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
public final class AInterceptor_Factory implements Factory<AInterceptor> {
  @Override
  public AInterceptor get() {
    return newInstance();
  }

  public static AInterceptor_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static AInterceptor newInstance() {
    return new AInterceptor();
  }

  private static final class InstanceHolder {
    private static final AInterceptor_Factory INSTANCE = new AInterceptor_Factory();
  }
}
