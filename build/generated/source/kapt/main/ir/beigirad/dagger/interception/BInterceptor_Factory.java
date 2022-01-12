package ir.beigirad.dagger.interception;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.Generated;

@ScopeMetadata
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
public final class BInterceptor_Factory implements Factory<BInterceptor> {
  @Override
  public BInterceptor get() {
    return newInstance();
  }

  public static BInterceptor_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static BInterceptor newInstance() {
    return new BInterceptor();
  }

  private static final class InstanceHolder {
    private static final BInterceptor_Factory INSTANCE = new BInterceptor_Factory();
  }
}
