package koopad.service.greeter;

import dagger.Binds;
import dagger.Module;

/** Main module for Greeter. */
@Module
public abstract class GreeterModule {
  @Binds
  abstract GreeterServiceDefinition greeterSubComponent(GreeterSubComponent greeterSubComponent);
}
