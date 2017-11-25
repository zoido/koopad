package koopad.service.greeter;

import dagger.Subcomponent;
import dagger.grpc.server.CallScoped;
import dagger.grpc.server.GrpcCallMetadataModule;

/** Main Greeter's sub component. */
@CallScoped
@Subcomponent(
  modules = {
    GrpcCallMetadataModule.class,
    GreeterGrpcServiceModule.class,
    GreeterInterceptorsModule.class,
    GreeterModule.class
  }
)
public interface GreeterSubComponent extends GreeterServiceDefinition {}
