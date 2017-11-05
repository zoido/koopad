package koopad.service;

import dagger.Component;
import dagger.grpc.server.GrpcCallMetadataModule;
import dagger.grpc.server.NettyServerModule;
import io.grpc.Server;
import javax.inject.Singleton;
import koopad.service.greeter.GreeterComponent;
import koopad.service.greeter.GreeterGrpcProxyModule;

@Singleton
@Component(
  modules = {
    // GreeterGrpcServiceModule.class,
    GreeterGrpcProxyModule.class,
    KoopadServerModule.class,
    NettyServerModule.class
  }
)
interface KoopadServerComponent {
  GreeterComponent greeterComponent(GrpcCallMetadataModule metadataModule);

  Server server();
}
