package ir.beigirad.dagger;

import dagger.internal.DaggerGenerated;
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
  private final DaggerAppComponent appComponent = this;

  private DaggerAppComponent() {


  }

  public static Builder builder() {
    return new Builder();
  }

  public static AppComponent create() {
    return new Builder().build();
  }

  private Repository repository() {
    return new Repository(new Capitalizer());
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
    private Builder() {
    }

    public AppComponent build() {
      return new DaggerAppComponent();
    }
  }
}
