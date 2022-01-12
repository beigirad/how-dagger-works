package ir.beigirad.screen_a;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
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
public final class ScreenA_MembersInjector implements MembersInjector<ScreenA> {
  private final Provider<RelatedAObject> relatedObjectProvider;

  public ScreenA_MembersInjector(Provider<RelatedAObject> relatedObjectProvider) {
    this.relatedObjectProvider = relatedObjectProvider;
  }

  public static MembersInjector<ScreenA> create(Provider<RelatedAObject> relatedObjectProvider) {
    return new ScreenA_MembersInjector(relatedObjectProvider);
  }

  @Override
  public void injectMembers(ScreenA instance) {
    injectRelatedObject(instance, relatedObjectProvider.get());
  }

  @InjectedFieldSignature("ir.beigirad.screen_a.ScreenA.relatedObject")
  public static void injectRelatedObject(ScreenA instance, RelatedAObject relatedObject) {
    instance.relatedObject = relatedObject;
  }
}
