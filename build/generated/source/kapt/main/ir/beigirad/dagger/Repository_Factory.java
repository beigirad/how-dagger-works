package ir.beigirad.dagger;

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
public final class Repository_Factory implements Factory<Repository> {
  @Override
  public Repository get() {
    return newInstance();
  }

  public static Repository_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static Repository newInstance() {
    return new Repository();
  }

  private static final class InstanceHolder {
    private static final Repository_Factory INSTANCE = new Repository_Factory();
  }
}
