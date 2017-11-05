package koopad.service.greeter;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class GreeterModule {
  @Binds
  abstract GreeterServiceDefinition greeterComponent(GreeterComponent greeterComponent);
}
