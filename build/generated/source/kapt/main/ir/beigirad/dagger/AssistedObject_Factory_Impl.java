package ir.beigirad.dagger;

import dagger.internal.DaggerGenerated;
import dagger.internal.InstanceFactory;
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
public final class AssistedObject_Factory_Impl implements AssistedObject.Factory {
  private final AssistedObject_Factory delegateFactory;

  AssistedObject_Factory_Impl(AssistedObject_Factory delegateFactory) {
    this.delegateFactory = delegateFactory;
  }

  @Override
  public AssistedObject create(int id) {
    return delegateFactory.get(id);
  }

  public static Provider<AssistedObject.Factory> create(AssistedObject_Factory delegateFactory) {
    return InstanceFactory.create(new AssistedObject_Factory_Impl(delegateFactory));
  }
}
