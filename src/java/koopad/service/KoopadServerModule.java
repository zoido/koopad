package koopad.service;

import dagger.Module;
import dagger.Provides;
import dagger.grpc.server.GrpcCallMetadataModule;
import koopad.service.greeter.GreeterServiceDefinition;

/** Binds Koopad Server dependencies. */
@Module
abstract class KoopadServerModule {
  @Provides
  static GreeterServiceDefinition.Factory serverComponent(KoopadServerComponent serverComponent) {
    return new GreeterServiceDefinition.Factory() {
      @Override
      public GreeterServiceDefinition grpcService(GrpcCallMetadataModule metadataModule) {
        return serverComponent.greeterComponent(metadataModule);
      }
    };
  }
}
