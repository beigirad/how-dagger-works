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
public final class Capitalizer_Factory implements Factory<Capitalizer> {
  @Override
  public Capitalizer get() {
    return newInstance();
  }

  public static Capitalizer_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static Capitalizer newInstance() {
    return new Capitalizer();
  }

  private static final class InstanceHolder {
    private static final Capitalizer_Factory INSTANCE = new Capitalizer_Factory();
  }
}
